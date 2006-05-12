/*
 * Created on March 5, 2006
 * Copyright (C) 2006 Heiko Kundlacz
 *
 * File:    Properties.java
 * EMail:   puschteblume@dev.java.net
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package ch.form105.shuttle.base.helper;


import ch.form105.shuttle.base.Constants;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.PropertyResourceBundle;
import org.apache.log4j.Logger;

/**
 * Loads a properties file in a static way and lets
 * access properties
 */
public class Properties {
    
    private static final Logger log = Logger.getLogger(Properties.class);
    private static PropertyResourceBundle prop = null;
    
    /** Creates a new instance of Properties */
    public Properties() {
    }
    
    /**
     * Accesses a property and returns a value
     * @param key A key to search for in properties
     * @return The value for a key
     */
    public static String getProp(String key) {
        if (prop != null) {
            return prop.getString(key);
        } else {
            try {
                PropertyResourceBundle prop = new PropertyResourceBundle(new FileInputStream(Constants.propertiesFile));
                return prop.getString(key);
            } catch (FileNotFoundException ex) {
                log.error("Can't find file:"+Constants.propertiesFile);
                log.info(ex.getStackTrace());
                return null;
            } catch (IOException ex) {
                log.error("IOException occured while loading Properties from "+Constants.propertiesFile);
                log.info(ex.getStackTrace());
                return null;
            }
        }
        
        
    }
    
}
