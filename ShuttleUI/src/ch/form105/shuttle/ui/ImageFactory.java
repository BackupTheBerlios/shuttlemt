package ch.form105.shuttle.ui;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

public class ImageFactory {
	
	private ImageFactory() {
		
	}
	
	public enum Images {
		IMG_TOURNAMENT_SMALL("image/tango-icon-theme-0.7.1/16x16/categories/applications-games.png"), //$NON-NLS-1$
		IMG_TOURNAMENT_PROJECT_SMALL("image/tango-icon-theme-0.7.1/16x16/categories/applications-other.png"), //$NON-NLS-1$
		IMG_IMPORT_USER("image/user.gif"); //$NON-NLS-1$
		
		String path;
		private Images(String path) {

				
			this.path = path;
		}

		private Image getImage() {
			URL url = null;
			try {
				url = new URL(ShuttleUIPlugin.getDefault().getDescriptor().getInstallURL(),path);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}

			ImageDescriptor img = ImageDescriptor.createFromURL(url);
			
			return img.createImage();
		}
	}
	
	public static Image getImage(String id) {
		return Images.valueOf(id).getImage();
		
		
	}
}
