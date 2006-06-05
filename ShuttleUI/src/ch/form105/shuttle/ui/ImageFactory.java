package ch.form105.shuttle.ui;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;

public enum ImageFactory {
	IMG_TOURNAMENT_SMALL(
			"image/tango-icon-theme-0.7.2/16x16/categories/applications-games.png"), //$NON-NLS-1$
	IMG_TOURNAMENT_PROJECT_SMALL(
			"image/tango-icon-theme-0.7.2/16x16/categories/applications-other.png"), //$NON-NLS-1$
	IMG_CREATE_PROJECT_WIZARD_PAGE("image/new_wiz.gif"),
	IMG_IMPORT_USER("image/tango-icon-theme-0.7.2/16x16/apps/system-users.png"),
	IMG_IMPORT_CLUB("image/tango-icon-theme-0.7.2/16x16/mimetypes/application-certificate.png"),
	IMG_TOURNAMENT("image/tango-icon-theme-0.7.2/16x16/actions/view-fullscreen.png"); //$NON-NLS-1$

	
	
	private String path;

	private ImageFactory(String path) {

		this.path = path;
	}

	private ImageDescriptor getImage() {
		URL url = null;
		try {
			url = new URL(ShuttleUIPlugin.getDefault().getDescriptor()
					.getInstallURL(), path);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		ImageDescriptor img = ImageDescriptor.createFromURL(url);

		return img;
	}
	
	public ImageDescriptor getImageDesc() {
		return getImage();
	}
}
