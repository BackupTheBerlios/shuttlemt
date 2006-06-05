package ch.form105.shuttle.ui.view.project;

import java.io.File;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import ch.form105.shuttle.base.generated.tournament.Game;
import ch.form105.shuttle.base.generated.tournament.Tournament;
import ch.form105.shuttle.base.helper.XMLLoader;
import ch.form105.shuttle.ui.Constants;
import ch.form105.shuttle.ui.ShuttleUIPlugin;
import ch.form105.shuttle.ui.application.DefaultPreferences;



public class ProjectContentProvider implements ITreeContentProvider {
	
	private static final Logger log = Logger.getLogger(ProjectContentProvider.class);
	private IPreferenceStore store = ShuttleUIPlugin.getDefault().getPreferenceStore();
	
	private Tournament tour = null;

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

	public Object[] getChildren(Object parentElement) {
		ArrayList list = new ArrayList();
		if (parentElement instanceof IProject) {
			IProject project = (IProject)parentElement;
			
			
			try {
				IResource[] resources = project.members();
				for (int i = 0; i < resources.length; i++) {
				
					String databaseFileName = store.getDefaultString(DefaultPreferences.DATABASE_FILE.name());
					if (resources[i].getName().equals(databaseFileName)) {
						list.add(resources[i]);
					}
					String playerFileName = store.getDefaultString(DefaultPreferences.IMPORT_PLAYER_FILENAME.name());
					if (resources[i].getName().equals(playerFileName)) {
						list.add(resources[i]);
					}
					String clubFileName = store.getDefaultString(DefaultPreferences.IMPORT_CLUB_FILENAME.name());
					if (resources[i].getName().equals(clubFileName)) {
						list.add(resources[i]);
					}
				}
				return list.toArray();
			} catch (CoreException e) {
				log.error(e.fillInStackTrace().toString());
			}
			
			
		}
		
		if (parentElement instanceof IFile) {
			String databaseFileName = store.getDefaultString(DefaultPreferences.DATABASE_FILE.name());
			IFile file = (IFile) parentElement;
			if (file.getName().equals(databaseFileName)) {
				//loading xml tournament file
				log.info(ResourcesPlugin.getWorkspace().getRoot().getFullPath());
				File jFile = file.getFullPath().toFile();
				
				XMLLoader loader = new XMLLoader();
				
				try {
					tour = loader.getTournament(file.getContents());
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Game[] games = tour.getGame();
				ArrayList gameList = new ArrayList();
				for (int i = 0; i < games.length; i++) {
					if (! gameList.contains(games[i].getTypeId())) {
						gameList.add(games[i]);
						
					}
				}
				log.info("gamelist: "+gameList.size());
				return tour.getGame();
			}
		}

		return null;
	}

	public Object getParent(Object element) {

		return null;
	}

	public boolean hasChildren(Object element) {
		log.info("hasChildren: "+element);
		
		if (element instanceof IProject) {
			IProject project = (IProject)element;
			IFile file = project.getFile(Constants.TOURNAMENT_FILE_NAME);
			return file.exists();
		}
		
		if (element instanceof IFile) {
			IFile file = ((IFile) element);
			String databaseFileName = store.getDefaultString(DefaultPreferences.DATABASE_FILE.name());
			if (file.getName().equals(databaseFileName)) {
				return true;
			}
			
		}
		return false;
		
	}

	public Object[] getElements(Object inputElement) {
		log.info("inputElement: "+inputElement);

		if (inputElement instanceof IProject[]) {
			return (Object[])inputElement;
		}
		
		if (inputElement instanceof Game[]) {
			IFile file = ((IFile) inputElement);
			String databaseFileName = store.getDefaultString(DefaultPreferences.DATABASE_FILE.name());
			if (file.getName().equals(databaseFileName)) {
				return tour.getGame();
			}
		}
		
		return null;
	}
	
	/**
	 * Getting the tournament
	 * @return the tournament
	 */
	public Tournament getTournament() {
		return tour;
	}

}
