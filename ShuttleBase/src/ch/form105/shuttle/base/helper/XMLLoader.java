/*
 * XMLLoader.java
 *
 * Created on March 2, 2006, 9:06 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ch.form105.shuttle.base.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import org.apache.log4j.Logger;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.InputSource;

import ch.form105.shuttle.base.generated.tournament.Tournament;

/**
 * 
 * @author heiko
 */
public class XMLLoader {

	static Logger log = Logger.getLogger(XMLLoader.class);

	
	File file = null;

	Tournament tournament = null;
	InputStream iStream;

	public XMLLoader(File file) {
		this.file = file;
	}
	
	public XMLLoader(InputStream iStream) {
		this.iStream = iStream;
	}

	public synchronized void run() {

		/*if (file == null) {
			return;
		}*/

		try {
			InputSource iSource = new InputSource();
			iSource.setByteStream(iStream);
			//InputStream iStream = new FileInputStream(file);
			//FileReader fReader = new FileReader(file);
			tournament = (Tournament) Unmarshaller.unmarshal(Tournament.class,
					iSource);
			//iSource.close();
		} /*catch (FileNotFoundException ex) {
			log.error("File not found: " + file);
			log.info(ex.getStackTrace());
			ex.printStackTrace();
		}*/ catch (MarshalException ex) {
			log.error("MarshalException occured while loading Tournament");
			ex.printStackTrace();
		} catch (ValidationException ex) {
			log.error("ValidationException occured while loading Tournament");
			log.info(ex.getStackTrace());
		}/* catch (IOException ioe) {
			log.error("IOException occured while loading Tournament");
			log.info(ioe.getStackTrace());
		}*/

	}

	/** Creates a new instance of XMLLoader */
	public XMLLoader() {
	}

	public Tournament getTournament(File file) {
		if (tournament == null) {
			this.file = file;
			run();
		}
		return tournament;
	}
	
	public Tournament getTournament(InputStream iStream) {
		if (tournament == null) {
			this.iStream = iStream;
			run();
		}
		return tournament;
	}
	
	public Tournament getTournament() {
		run();
		return tournament;
	}

	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
	}
	
	

}
