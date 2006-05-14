package ch.form105.shuttle.ui.view.project;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

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

		IWorkspaceRoot wsRoot = ResourcesPlugin.getWorkspace().getRoot();
		/*IProject project = wsRoot.getProject("Default Project");
		try {
			project.create(null);
		} catch (CoreException e) {

			e.printStackTrace();
		}
		*/
		
		
		
		

		
		
		treeViewer.setInput(wsRoot.getProjects());

		// treeViewer.setInput(getInitalInput());
		// treeViewer.expandAll();

		// ----- TreeViewer for player import -----

		treeViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				IWorkbenchPage page = ShuttleUIPlugin.getDefault()
						.getWorkbench().getActiveWorkbenchWindow()
						.getActivePage();
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
