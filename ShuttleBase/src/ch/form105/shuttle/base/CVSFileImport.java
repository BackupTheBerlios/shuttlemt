/*
 * Created on March 5, 2006
 * Copyright (C) 2006 Heiko Kundlacz
 *
 * File:    CVSFileImport.java
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

package ch.form105.shuttle.base;

import ch.form105.shuttle.base.helper.Properties;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.log4j.Logger;

/**
 * Import a csv file and fill a table with the data. A file
 * seperator is configurable by the property app.import.csv.seperator
 * in the application properties file.
 */
public class CVSFileImport extends FileImport {
    
    private static final Logger log = Logger.getLogger(CVSFileImport.class);
    private String sep = Properties.getProp("app.import.csv.seperator");
    private CSVList csv = new CSVList();
    
    /**
     * Creates a new instance of CVSFileImport
     * @param file The file to import
     */
    public CVSFileImport(File file) {
        super(file);
    }
    
    
    /**
     * Loads the file into a tablemodel
     */
    public void loading() {
        BufferedReader reader = null;
        String line;
        try {
            reader = new BufferedReader(new FileReader(super.getImpFile()));
        } catch (FileNotFoundException ex) {
            log.error("Can't find file:"+Constants.propertiesFile);
            log.info(ex.getStackTrace());
        } catch (IOException ioe) {
            log.error("IOException occured while reading lines from CSV file "+super.getImpFile());
            log.info(ioe.getStackTrace());
        }
        try {
            while ((line = reader.readLine()) != null) {
                String[] sLine = line.split(";");
                csv.add(sLine);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    

    /**
     * Get the seperator
     * @return The seperator used in the csv file
     */
    public String getSep() {
        return sep;
    }

    /**
     * Set the seperator to use in the csv file
     * @param sep The parameter to use
     */
    public void setSep(String sep) {
        this.sep = sep;
    }
}
