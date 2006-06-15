package ch.form105.shuttle.ui.view.project;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
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

import ch.form105.shuttle.base.importer.CSVLoaderInput;
import ch.form105.shuttle.base.importer.ClubMapDeclaration;
import ch.form105.shuttle.base.importer.Importer;
import ch.form105.shuttle.base.importer.Mapper;
import ch.form105.shuttle.base.importer.PlayerMapDeclaration;
import ch.form105.shuttle.ui.ShuttleUIPlugin;
import ch.form105.shuttle.ui.application.DefaultPreferences;
import ch.form105.shuttle.ui.view.club.ImportClubView;
import ch.form105.shuttle.ui.view.player.ImportPlayerView;

public class ProjectView extends ViewPart {

	public static final String ID = "ShuttleUI.ProjectView";

	private static final Logger log = Logger.getLogger(ProjectView.class);

	private TreeViewer treeViewer;

	// private IProject project;

	private IPreferenceStore store = ShuttleUIPlugin.getDefault().getPreferenceStore();

	private final static IWorkbench workbench = ShuttleUIPlugin.getDefault().getWorkbench();

	private final static IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();

	private HashMap clubs;

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
				treeViewer.setInput(ResourcesPlugin.getWorkspace().getRoot().getProjects());
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
				manager.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
			}
		});

		Menu menu = menuMgr.createContextMenu(treeViewer.getControl());
		treeViewer.getControl().setMenu(menu);

		// Register menu for extension.
		getSite().registerContextMenu(menuMgr, treeViewer);
	}

	private void doubleClickAction(DoubleClickEvent event) {

		IStructuredSelection selection = ((IStructuredSelection) event.getSelection());
		if (selection.getFirstElement() instanceof IFile) {
			IFile file = (IFile) selection.getFirstElement();
			String playerFilename = store
					.getDefaultString(DefaultPreferences.IMPORT_PLAYER_FILENAME.name());

			if (file.getName().equals(playerFilename)) {
				IViewPart viewPlayerPart;
				IProject project = (IProject) file.getParent();
				try {
					viewPlayerPart = window.getActivePage().showView(ImportPlayerView.ID);
					ImportPlayerView ipView = (ImportPlayerView) viewPlayerPart;
					ipView.setClub(loadClubs((IProject) file.getParent()));
					ipView.setInput(loadPlayers(project));

					ipView.init();
				} catch (PartInitException e) {
					log.error(e, e);
				}
			}

			String clubFilename = store.getDefaultString(DefaultPreferences.IMPORT_CLUB_FILENAME
					.name());
			if (file.getName().equals(clubFilename)) {
				IViewPart viewClubPart;
				IProject project = (IProject) file.getParent();
				try {
					
					viewClubPart = window.getActivePage().showView(ImportClubView.ID);
					ImportClubView icView = (ImportClubView) viewClubPart;
					icView.setInput(loadClubs(project));
					icView.init();

				} catch (PartInitException e) {
					log.error(e, e);
				}
			}

		}
	}

	private Importer loadClubs(IProject project) {
		ClubMapDeclaration mapper = new ClubMapDeclaration();
		String clubFilename = store
				.getDefaultString(DefaultPreferences.IMPORT_CLUB_FILENAME.name());
		Importer importer = getImport(project, clubFilename, mapper);
		return importer;

	}

	private Importer loadPlayers(IProject project) {
		PlayerMapDeclaration mapper = new PlayerMapDeclaration();
		String playerFilename = store.getDefaultString(DefaultPreferences.IMPORT_PLAYER_FILENAME
				.name());
		Importer importer = getImport(project, playerFilename, mapper);
		return importer;
	}

	private Importer getImport(IProject project, String fileName, Mapper mapper) {
		
		CSVLoaderInput loader;
		try {
			loader = new CSVLoaderInput(project.getFile(fileName).getContents());
			Importer importer = new Importer(loader, mapper);
			importer.doImport();

			return importer;
		} catch (CoreException e) {
			log.error(e, e);
			return null;

		}
	}
	
	
}