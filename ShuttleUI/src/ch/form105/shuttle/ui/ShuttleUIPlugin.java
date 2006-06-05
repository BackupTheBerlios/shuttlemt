package ch.form105.shuttle.ui;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import ch.form105.shuttle.ui.application.DefaultPreferences;

/**
 * The main plugin class to be used in the desktop.
 */
public class ShuttleUIPlugin extends AbstractUIPlugin {

	// The shared instance.
	private static ShuttleUIPlugin plugin;

	/**
	 * The constructor.
	 */
	public ShuttleUIPlugin() {
		plugin = this;
	}

	/**
	 * This method is called upon plug-in activation
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/**
	 * This method is called when the plug-in is stopped
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}

	/**
	 * Returns the shared instance.
	 */
	public static ShuttleUIPlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path.
	 * 
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin("ShuttleUI", path);
	}

	protected void initializeDefaultPreferences(IPreferenceStore store) {
		DefaultPreferences.init();
	}
}
