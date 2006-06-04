package ch.form105.shuttle.ui.wizard;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

import ch.form105.shuttle.base.generated.tournament.Game;
import ch.form105.shuttle.base.generated.tournament.Games;
import ch.form105.shuttle.base.generated.tournament.Tournament;
import ch.form105.shuttle.base.generated.tournament.types.CategoryType;
import ch.form105.shuttle.base.helper.XMLSaver;
import ch.form105.shuttle.ui.Constants;
import ch.form105.shuttle.ui.ImageFactory;
import ch.form105.shuttle.ui.i18n.wizard.Messages;
import ch.form105.shuttle.ui.wizard.page.ImportPage;
import ch.form105.shuttle.ui.wizard.page.SetCategoryPage;
import ch.form105.shuttle.ui.wizard.page.SetNamePage;
import ch.form105.shuttle.ui.wizard.page.SetProjectTypePage;

public class NewProjectWizard extends Wizard implements INewWizard {
	
	private static final Logger log = Logger.getLogger(NewProjectWizard.class);

	public static final String id = "ShuttleUI.newProjectWizard";

	private WizardNewProjectCreationPage mainPage;

	private ImportPage page0;
	
	private SetNamePage page1;

	private SetProjectTypePage page2;

	private SetCategoryPage page3;

	private ImageDescriptor pageImage = ImageFactory.IMG_CREATE_PROJECT_WIZARD_PAGE
			.getImageDesc();

	public NewProjectWizard() {
		super();

		setWindowTitle(Messages.getString("NewProjectWizard.windowTitle")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
		setDefaultPageImageDescriptor(pageImage);
	}

	public void addPages() {
		page0 = new ImportPage();
		page1 = new SetNamePage();
		page2 = new SetProjectTypePage();
		page3 = new SetCategoryPage();
		addPage(page0);
		addPage(page1);
		addPage(page2);
		addPage(page3);

	}

	@Override
	public boolean performFinish() {

		IProjectDescription projectDesc = page1.getProjectDesc();
		Collection<Game> gameList = page2.getGames();

		Object[] types = page3.getResult();

		// create object model
		Tournament tournament = new Tournament();
		Games games = new Games();
		tournament.setGames(games);
		tournament.setTournamentName(projectDesc.getName());

		for (Game aGame : gameList) {
			for (int i = 0; i < types.length; i++) {
				Game tempGame = new Game();
				tempGame.setName(aGame.getName());
				tempGame.setActive(true);
				tempGame.setTypeId(aGame.getTypeId());
				tempGame.setCategory((CategoryType)types[i]);
				games.addGame(tempGame);
			}
		}

		// create the xml file
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot wsRoot = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = wsRoot.getProject(projectDesc.getName());
		IFile file = project.getFile(Constants.TOURNAMENT_FILE_NAME);
		workspace.addResourceChangeListener(new IResourceChangeListener() {

			public void resourceChanged(IResourceChangeEvent event) {
				System.out.println("Resources changed");
				
			}
			
		});
		try {
			project.create(projectDesc, null);
			project.open(null);
			//file.create(null,IResource.NONE, null);
			System.out.println(file.exists());
		} catch (CoreException e) {
			e.printStackTrace();
		}

		String projectPath = project.getLocation().toOSString();
		String savePath = projectPath + "/"+Constants.TOURNAMENT_FILE_NAME;
		
		
		
		
		log.info(savePath);
		
		
		XMLSaver.run(tournament, savePath);

		return true;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	@Override
	public void dispose() {
		super.dispose();
		pageImage = null;
	}

}
