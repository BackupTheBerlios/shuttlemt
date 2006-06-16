package ch.form105.shuttle.ui.view.project;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import ch.form105.shuttle.base.generated.tournament.Category;
import ch.form105.shuttle.base.generated.tournament.Game;
import ch.form105.shuttle.ui.ImageFactory;
import ch.form105.shuttle.ui.ShuttleUIPlugin;
import ch.form105.shuttle.ui.application.DefaultPreferences;
import ch.form105.shuttle.ui.i18n.MainMessages;

public class ProjectLabelProvider implements ILabelProvider {

	private static final Logger log = Logger
			.getLogger(ProjectLabelProvider.class);

	// Images
	Image importUserImg = ImageFactory.IMG_IMPORT_USER.getImageDesc().createImage();
	Image importClubsImg = ImageFactory.IMG_IMPORT_CLUB.getImageDesc().createImage();
	Image tournamentImg = ImageFactory.IMG_TOURNAMENT.getImageDesc().createImage();
	
	private IPreferenceStore store = ShuttleUIPlugin.getDefault()
			.getPreferenceStore();

	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	public Image getImage(Object element) {
		if (element instanceof IProject) {
			return ImageFactory.IMG_TOURNAMENT_PROJECT_SMALL.getImageDesc()
					.createImage();
		}
		
		if (element instanceof IFile) {
			String labelText = ((IFile) element).getName();
			
			if (labelText.equals(store.getString(DefaultPreferences.IMPORT_PLAYER_FILENAME.name()))) {
				return importUserImg;
			}
			if (labelText.equals(store.getString(DefaultPreferences.IMPORT_CLUB_FILENAME.name()))) {
				return importClubsImg;
			}
			if (labelText.equals(store.getString(DefaultPreferences.DATABASE_FILE.name()))) {
				return tournamentImg;
			}
		}
		
		if (element instanceof Game) {
			//((Game) element).getTypeId()
		}

		return null;
	}

	public String getText(Object element) {

		if (element instanceof IProject) {
			return ((IProject) element).getName();
		}

		if (element instanceof IFile) {
			String labelText = ((IFile) element).getName();
		
			if (labelText.equals(store.getString(DefaultPreferences.IMPORT_PLAYER_FILENAME.name()))) {
				return MainMessages.getString("projectTree.licensedUsers.label");
			}
			if (labelText.equals(store.getString(DefaultPreferences.IMPORT_CLUB_FILENAME.name()))) {
				return MainMessages.getString("projectTree.licensedClubs.label");
			}
			if (labelText.equals(store.getString(DefaultPreferences.DATABASE_FILE.name()))) {
				return MainMessages.getString("projectTree.tournament.label");
			}
		}
		
		if (element instanceof Game) {
			return ((Game) element).getGameId().toString();
		}
		
		if (element instanceof Category) {
			Category category = (Category) element;
			return "Category "+"- "+category.getCatId().toString();
		}

		// TODO Auto-generated method stub
		return element.toString();
	}

	public void dispose() {
		importUserImg.dispose();
		importUserImg = null;
		importClubsImg.dispose();
		importClubsImg = null;
		tournamentImg.dispose();
		tournamentImg = null;
	}

}
