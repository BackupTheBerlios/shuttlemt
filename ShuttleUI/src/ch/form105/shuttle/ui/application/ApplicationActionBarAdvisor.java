package ch.form105.shuttle.ui.application;

import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ContributionItemFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

/**
 * An action bar advisor is responsible for creating, adding, and disposing of
 * the actions added to a workbench window. Each window will be populated with
 * new actions.
 */
public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	// Actions - important to allocate these only in makeActions, and then use
	// them
	// in the fill methods. This ensures that the actions aren't recreated
	// when fillActionBars is called with FILL_PROXY.
	private IWorkbenchAction exitAction;
	private IWorkbenchAction preferenceAction;
	private IWorkbenchAction openAction;
	private IWorkbenchAction newAction;
	private IWorkbenchAction aboutAction;


	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}

	protected void makeActions(final IWorkbenchWindow window) {
		// Creates the actions and registers them.
		// Registering is needed to ensure that key bindings work.
		// The corresponding commands keybindings are defined in the plugin.xml
		// file.
		// Registering also provides automatic disposal of the actions when
		// the window is closed.

		exitAction = ActionFactory.QUIT.create(window);
		openAction = ActionFactory.OPEN_NEW_WINDOW.create(window);
		
		preferenceAction = ActionFactory.PREFERENCES.create(window);
		aboutAction = ActionFactory.ABOUT.create(window);
		register(exitAction);
	}

	protected void fillMenuBar(IMenuManager menuBar) {
		MenuManager fileMenu = new MenuManager("&File",
				IWorkbenchActionConstants.M_FILE);
		fileMenu.add(new GroupMarker(IWorkbenchActionConstants.FILE_START)); 
		
		MenuManager windowMenu = new MenuManager("&Window",
				IWorkbenchActionConstants.M_WINDOW);
		menuBar.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
		MenuManager helpMenu = new MenuManager("&Help", IWorkbenchActionConstants.M_HELP);
		
		menuBar.add(fileMenu);
		menuBar.add(windowMenu);
		menuBar.add(helpMenu);
		fileMenu.add(openAction);
		
		fileMenu.add(exitAction);
		
		windowMenu.add(preferenceAction);
		helpMenu.add(aboutAction);
	}
	
	private MenuManager createWindowMenu(IWorkbenchWindow window) {
		MenuManager menu = new MenuManager("Window", //$NON-NLS-1$
				IWorkbenchActionConstants.M_WINDOW);

		menu.add(ActionFactory.OPEN_NEW_WINDOW.create(window));

		menu.add(new Separator());
		MenuManager perspectiveMenu = new MenuManager(
				"Open_Perspective", "openPerspective"); //$NON-NLS-1$ //$NON-NLS-2$
		IContributionItem perspectiveList = ContributionItemFactory.PERSPECTIVES_SHORTLIST
				.create(window);
		perspectiveMenu.add(perspectiveList);
		menu.add(perspectiveMenu);

		MenuManager viewMenu = new MenuManager("Show_View"); //$NON-NLS-1$
		IContributionItem viewList = ContributionItemFactory.VIEWS_SHORTLIST
				.create(window);
		viewMenu.add(viewList);
		menu.add(viewMenu);

		menu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));

		menu.add(ActionFactory.PREFERENCES.create(window));

		menu.add(ContributionItemFactory.OPEN_WINDOWS.create(window));

		return menu;
	}

}
