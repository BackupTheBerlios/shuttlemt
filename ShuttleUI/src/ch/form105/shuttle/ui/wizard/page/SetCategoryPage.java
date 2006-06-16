package ch.form105.shuttle.ui.wizard.page;

import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.util.Collection;
import java.util.Enumeration;
import java.util.TreeSet;

import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

import ch.form105.shuttle.base.generated.tournament.types.CategoryCatIdType;

public class SetCategoryPage extends WizardPage {
	
	CheckboxTreeViewer treeViewer;

	public SetCategoryPage() {
		super("SetNamePage");
		setPageComplete(false);
		setTitle("Choose Categories");
		setMessage("Select the categories that should be played");

	}

	public void createControl(Composite parent) {
		
		// project specification group
		Composite group = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		group.setLayout(layout);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		
		TreeSet list = null;
		try {
			list = new TreeSet(new StringComparator("< a,A< b,B< c,C< d,D< e,E< f,F< g,G< h,H< i,I< j,J < k,K< l,L< m,M< n,N< o,O< p,P< q,Q< r,R< s,S< t,T < u,U< v,V< w,W< x,X< y,Y< z,Z"));
			
			for (Enumeration e = CategoryCatIdType.enumerate(); e.hasMoreElements();) {
				list.add(e.nextElement());
			}
			
		} catch (ParseException e1) {			
			e1.printStackTrace();
		}
        
        createCheckboxTreeViewer(group);
        treeViewer.setInput(list);
        treeViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));

		setControl(group);
	
	}
	
	private void createCheckboxTreeViewer(Composite parent) {
		treeViewer= new CheckboxTreeViewer(parent, SWT.BORDER);
		treeViewer.setContentProvider(new ContentProvider());
		treeViewer.setLabelProvider(new LabelProvider());
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				validatePage();
			}
		});
		
		
	}

	private Listener nameModifyListener = new Listener() {
		public void handleEvent(Event e) {
			validatePage();
		}

	};


	private void validatePage() {
		
		Object[] object = (Object[]) treeViewer.getCheckedElements();
		
		
		
		if (object.length == 0) {
			setErrorMessage("Please select at least one category");
		} else {
			setErrorMessage(null);
			if (getNextPage() == null) {
				setMessage("Press Finish");
			} else {
				setMessage("Press Next");
			}
			setPageComplete(true);
		}
	}
	
	public class LabelProvider implements ILabelProvider {

		public Image getImage(Object element) {
			return null;
		}

		public String getText(Object element) {
			return element.toString();
		}

		public void addListener(ILabelProviderListener listener) {
		}

		public void dispose() {
		}

		public boolean isLabelProperty(Object element, String property) {
			return false;
		}

		public void removeListener(ILabelProviderListener listener) {
		}

	}
	
	public class ContentProvider implements ITreeContentProvider {

		public Object[] getChildren(Object parentElement) {
			System.out.println("getChildren invoked");
			return ((Collection) parentElement).toArray();	
		}

		public Object getParent(Object element) {
			System.out.println("getParent invoked: "+element);
			return element;
		}

		public boolean hasChildren(Object element) {
			
			return false;
		}

		public Object[] getElements(Object inputElement) {
			System.out.println("getElements invoked");
			Collection col = ((Collection) inputElement);
			return ((Collection) inputElement).toArray();	
		}

		public void dispose() {
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
	}
	
	private class StringComparator  extends RuleBasedCollator {

		public StringComparator(String rules) throws ParseException {
			super(rules);			
		}
		
		public int compare(Object o1, Object o2) {
			o1 = ((CategoryCatIdType) o1).toString();
			o2 = ((CategoryCatIdType) o2).toString();
			return super.compare(o1, o2);			
		}	
	}
	
	public Object[] getResult() {
		Object[] object = treeViewer.getCheckedElements();
		return (Object[])treeViewer.getCheckedElements();
	}

}
