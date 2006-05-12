/*
 * XMLLoader.java
 *
 * Created on March 2, 2006, 9:06 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ch.form105.shuttle.base;

import ch.form105.shuttle.base.generated.tournament.Tournament;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;

/**
 *
 * @author heiko
 */
public class XMLLoader {
  
  Logger log = Logger.getLogger(XMLLoader.class);
  
  ArrayList tourList = new ArrayList();
  
  public void load(String sFile) {
    Tournament tournament = null;
    try {
      FileReader fReader = new FileReader(sFile);
      tournament = (Tournament) Unmarshaller.unmarshal(Tournament.class, fReader);
      fReader.close();
    } catch (FileNotFoundException ex) {
      log.error("File not found: "+sFile);
      log.info(ex.getStackTrace());
      ex.printStackTrace();
    } catch (MarshalException ex) {
      log.error("MarshalException occured while loading Tournament");
      ex.printStackTrace(); 
    } catch (ValidationException ex) {
      log.error("ValidationException occured while loading Tournament");
      log.info(ex.getStackTrace());
    } catch (IOException ioe) {
      log.error("IOException occured while loading Tournament");
      log.info(ioe.getStackTrace());
    }
    
  }
  
  /** Creates a new instance of XMLLoader */
  public XMLLoader() {
  }
  
}
