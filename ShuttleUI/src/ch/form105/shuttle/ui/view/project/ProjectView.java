package ch.form105.shuttle.ui.view.project;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

import ch.form105.shuttle.ui.ShuttleUIPlugin;
import ch.form105.shuttle.ui.application.DefaultPreferences;
import ch.form105.shuttle.ui.view.player.ImportPlayerView;

public class ProjectView extends ViewPart {

	public static final String ID = "ShuttleUI.ProjectView";

	private static final Logger log = Logger.getLogger(ProjectView.class);

	private TreeViewer treeViewer;

	private IProject project;

	private IPreferenceStore store = ShuttleUIPlugin.getDefault()
			.getPreferenceStore();
	
	private final static IWorkbench workbench = ShuttleUIPlugin.getDefault().getWorkbench();
	private final static IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
	
	// root folder for the projects

	public ProjectView() {
		super();
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

		createContextMenu();

	}

	private void createViewerComponent(TreeViewer treeViewer) {

	}

	private void createTreeViewer(Composite parent) {
		treeViewer = new TreeViewer(parent);
		treeViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction(event);
			}

		});
		treeViewer.setContentProvider(new ProjectContentProvider());
		treeViewer.setLabelProvider(new ProjectLabelProvider());

		IWorkspaceRoot wsRoot = ResourcesPlugin.getWorkspace().getRoot();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IResourceChangeListener listener = new IResourceChangeListener() {
			public void resourceChanged(IResourceChangeEvent event) {

				treeViewer.setInput(ResourcesPlugin.getWorkspace().getRoot()
						.getProjects());

			}
		};
		workspace.addResourceChangeListener(listener);

		treeViewer.setInput(wsRoot.getProjects());

		// treeViewer.setInput(getInitalInput());
		// treeViewer.expandAll();

		// ----- TreeViewer for player import -----

		treeViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction(event);
			}

		});

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	/**
	 * create a context menu for this view
	 * 
	 */
	protected void createContextMenu() {
		// Create menu manager.
		MenuManager menuMgr = new MenuManager();
		menuMgr.setRemoveAllWhenShown(true);

		// Create menu.
		menuMgr.addMenuListener(new IMenuListener() {

			public void menuAboutToShow(IMenuManager manager) {
				manager.add(new GroupMarker(
						IWorkbenchActionConstants.MB_ADDITIONS));
			}
		});

		Menu menu = menuMgr.createContextMenu(treeViewer.getControl());
		treeViewer.getControl().setMenu(menu);

		// Register menu for extension.
		getSite().registerContextMenu(menuMgr, treeViewer);
	}

	private void doubleClickAction(DoubleClickEvent event) {

		IStructuredSelection selection = ((IStructuredSelection) event
				.getSelection());
		if (selection.getFirstElement() instanceof IFile) {
			IFile file = (IFile) selection.getFirstElement();
			String playerFilename = store.getDefaultString(DefaultPreferences.IMPORT_PLAYER_FILENAME.name());
			
			if (file.getName().equals(playerFilename)) {
				IViewPart viewPart;
				try {
					viewPart = window.getActivePage().showView(ImportPlayerView.ID);
					ImportPlayerView ipView = (ImportPlayerView) viewPart;
					ipView.setFile(file);
					ipView.init();
					
				} catch (PartInitException e) {
					log.error(e,e);
				}
				
				
			}
		}

		
	}
	
	

}
