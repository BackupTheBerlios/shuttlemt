package ch.form105.shuttle.ui.view.project;

import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

import ch.form105.shuttle.base.model.Projects;
import ch.form105.shuttle.ui.ShuttleUIPlugin;
import ch.form105.shuttle.ui.view.player.ImportPlayerView;

public class ProjectView extends ViewPart {

	public static final String ID = "ShuttleUI.ProjectView";

	private TreeViewer treeViewer;

	// root folder for the projects

	public ProjectView() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		// ResourcesPlugin.getWorkspace().getRoot();
		createTreeViewer(parent);
		createViewerComponent(treeViewer);

		GridData layoutData = new GridData();
		layoutData.grabExcessHorizontalSpace = true;
		layoutData.grabExcessVerticalSpace = true;
		layoutData.horizontalAlignment = GridData.FILL;
		layoutData.verticalAlignment = GridData.FILL;
		treeViewer.getControl().setLayoutData(layoutData);

	}

	private void createViewerComponent(TreeViewer treeViewer) {

	}

	private void createTreeViewer(Composite parent) {
		treeViewer = new TreeViewer(parent);
		treeViewer.setContentProvider(new ProjectContentProvider());
		treeViewer.setLabelProvider(new ProjectLabelProvider());

		Projects projects = new Projects();

		treeViewer.setInput(projects);

		// treeViewer.setInput(getInitalInput());
		// treeViewer.expandAll();
		
		// ----- TreeViewer for player import -----
		
		treeViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				IWorkbenchPage page = ShuttleUIPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					page.showView(ImportPlayerView.ID);
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
			
		});
	
	}

	private Object getInitalInput() {
		return null;
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
