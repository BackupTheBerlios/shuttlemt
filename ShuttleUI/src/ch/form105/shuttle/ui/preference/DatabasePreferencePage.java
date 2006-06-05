package ch.form105.shuttle.ui.preference;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import ch.form105.shuttle.ui.ShuttleUIPlugin;
import ch.form105.shuttle.ui.application.DefaultPreferences;
import ch.form105.shuttle.ui.i18n.preference.Messages;

public class DatabasePreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {
	
	public DatabasePreferencePage() {
		super(DatabasePreferencePage.GRID);
	}



	public void init(IWorkbench workbench) {
		IPreferenceStore store = ShuttleUIPlugin.getDefault()
				.getPreferenceStore();
		setPreferenceStore(store);
	}

	/*
	 *  (non-Javadoc)
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors()
	 */
	public void createFieldEditors() {
		StringFieldEditor playerField = new StringFieldEditor(DefaultPreferences.DATABASE_FILE.name(),
				Messages.getString("preferences.database.filename"), getFieldEditorParent());
		addField(playerField);


	}

}