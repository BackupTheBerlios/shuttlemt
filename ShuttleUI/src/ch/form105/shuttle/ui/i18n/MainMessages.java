package ch.form105.shuttle.ui.i18n;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class MainMessages {

	private static final String BUNDLE_NAME = "ch.form105.shuttle.ui.i18n.mainMessages"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private MainMessages() {
	}

	public static String getString(String key) {
		// TODO Auto-generated method stub
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

}
