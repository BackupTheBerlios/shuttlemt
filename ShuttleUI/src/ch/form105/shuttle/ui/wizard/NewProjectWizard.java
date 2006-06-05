package ch.form105.shuttle.ui.wizard;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import ch.form105.shuttle.base.generated.tournament.Game;
import ch.form105.shuttle.base.generated.tournament.Tournament;
import ch.form105.shuttle.base.generated.tournament.types.CategoryType;
import ch.form105.shuttle.base.helper.XMLSaver;
import ch.form105.shuttle.ui.ImageFactory;
import ch.form105.shuttle.ui.ShuttleUIPlugin;
import ch.form105.shuttle.ui.application.DefaultPreferences;
import ch.form105.shuttle.ui.i18n.wizard.Messages;
import ch.form105.shuttle.ui.wizard.page.ImportPage;
import ch.form105.shuttle.ui.wizard.page.SetCategoryPage;
import ch.form105.shuttle.ui.wizard.page.SetNamePage;
import ch.form105.shuttle.ui.wizard.page.SetProjectTypePage;

public class NewProjectWizard extends Wizard implements INewWizard {

	private static final Logger log = Logger.getLogger(NewProjectWizard.class);

	public static final String id = "ShuttleUI.newProjectWizard";

	private ImportPage page0;
	private SetNamePage page1;
	private SetProjectTypePage page2;
	private SetCategoryPage page3;
	
	private IPreferenceStore store = ShuttleUIPlugin.getDefault().getPreferenceStore();

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
		String tourFileName = store.getDefaultString(DefaultPreferences.DATABASE_FILE.name());
		String playerFileName = store.getDefaultString(DefaultPreferences.IMPORT_PLAYER_FILENAME.name());
		String clubFileName = store.getDefaultString(DefaultPreferences.IMPORT_CLUB_FILENAME.name());

		IProjectDescription projectDesc = page1.getProjectDesc();
		Collection<Game> gameList = page2.getGames();

		Object[] types = page3.getResult();

		// create object model
		Tournament tournament = new Tournament();
		tournament.setTournamentName(projectDesc.getName());

		for (Game aGame : gameList) {
			for (int i = 0; i < types.length; i++) {
				Game tempGame = new Game();
				tempGame.setName(aGame.getName());
				tempGame.setActive(true);
				tempGame.setTypeId(aGame.getTypeId());
				tempGame.setCategory((CategoryType) types[i]);
				tournament.addGame(tempGame);
			}
		}

		// create the xml file
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot wsRoot = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = wsRoot.getProject(projectDesc.getName());
		IFile file = project.getFile(tourFileName);
		workspace.addResourceChangeListener(new IResourceChangeListener() {
			public void resourceChanged(IResourceChangeEvent event) {
				log.info("Resources changed");
			}
		});
		try {
			project.create(projectDesc, null);
			project.open(null);
		} catch (CoreException e) {
			e.printStackTrace();
		}

		String projectPath = project.getLocation().toOSString();
		String savePath = projectPath + "/" + tourFileName;

		XMLSaver.run(tournament, savePath);
		
		//importing files
		
		importFiles(project, page0.getPlayerFilePath(), playerFileName);
		importFiles(project, page0.getClubFilePath(), clubFileName);
		try {
			project.refreshLocal(project.DEPTH_ONE, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	@Override
	public void dispose() {
		super.dispose();
		pageImage = null;
	}
	
	private void importFiles(IProject project, String importFile, String fileName) {
		FileInputStream fileStream = null;
		try {
			fileStream = new FileInputStream(importFile);
		} catch (FileNotFoundException e) {
			log.error("Can't find file: "+importFile);
		}
		//create new File
		IFile newFile = project.getFile(fileName);
		try {
			newFile.create(fileStream, false, null);
			
		} catch (CoreException e) {
			log.error("CoreException occured: "+e.fillInStackTrace().toString());
		}
		
		
		
		
		
	}

}
