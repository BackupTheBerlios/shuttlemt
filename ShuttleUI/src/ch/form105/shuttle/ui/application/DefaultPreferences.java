package ch.form105.shuttle.ui.application;

import org.eclipse.jface.preference.IPreferenceStore;

import ch.form105.shuttle.ui.ShuttleUIPlugin;

public enum DefaultPreferences {
	
	IMPORT_PLAYER_FILENAME("players_no_adr.sb"),
	IMPORT_CLUB_FILENAME("Clubs.sb"),
	
	DATABASE_FILE("tournament.xml");
	

	Object o;
	
	
	private DefaultPreferences(Integer iParameter) {
	    o = iParameter;
	}

	private DefaultPreferences(String sParameter) {
	    o = sParameter;
	}

	private DefaultPreferences(Boolean bParameter) {
	    o = bParameter;
	}

	private DefaultPreferences(Long lParameter) {
	    o = lParameter;
	}
	
	
	public static void init() {
        IPreferenceStore store = ShuttleUIPlugin.getDefault().getPreferenceStore();
        DefaultPreferences[] prefs = values();

        for (int i = 0; i < prefs.length; i++) {
            
            if (prefs[i].getObject() instanceof Integer) {
                store.setDefault(prefs[i].name(), (Integer) prefs[i].getObject());
            }

            if (prefs[i].getObject() instanceof String) {
                store.setDefault(prefs[i].name(), (String) prefs[i].getObject());
            }

            if (prefs[i].getObject() instanceof Boolean) {
                store.setDefault(prefs[i].name(), (Boolean) prefs[i].getObject());
            }

            if (prefs[i].getObject() instanceof Long) {
                store.setDefault(prefs[i].name(), (Long) prefs[i].getObject());
            }
        }

    }
	
	private Object getObject() {
		return o;
	}
}
