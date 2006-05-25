/*
 * XMLLoader.java
 *
 * Created on March 2, 2006, 9:06 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ch.form105.shuttle.base.helper;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.ValidationException;

import ch.form105.shuttle.base.generated.tournament.Tournament;

/**
 *
 * @author heiko
 */
public class XMLSaver {
  
  static Logger log = Logger.getLogger(XMLSaver.class);
  
  ArrayList tourList = new ArrayList();
  
  public static synchronized void run(Tournament tour, String sFile) {

    try {
      FileWriter fWriter = new FileWriter(sFile);
      Marshaller.marshal(tour, fWriter);
      fWriter.close();
    } catch (FileNotFoundException ex) {
      log.error("File not found: "+sFile);
      log.info(ex.getStackTrace());
      ex.printStackTrace();
    } catch (MarshalException ex) {
      log.error("MarshalException occured while loading Tournament");
      ex.printStackTrace(); 
    } catch (ValidationException ex) {
      log.error("ValidationException occured while loading Tournament");
      log.info(ex.getStackTrace().toString());
      ex.printStackTrace();
      System.out.println(ex.getCause());
    } catch (IOException ioe) {
      log.error("IOException occured while loading Tournament");
      log.info(ioe.getStackTrace());
    }
    
  }
  
  /** Creates a new instance of XMLLoader */
  public XMLSaver() {
  }
  
}
