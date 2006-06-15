package ch.form105.shuttle.base.importer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import ch.form105.shuttle.base.Constants;

public class CSVLoaderInput extends LoaderInput {

	private static final Logger log = Logger.getLogger(CSVLoaderInput.class);

	private String file = "import/players_no_adr.sb";

	private BufferedReader reader;
	private Object[] header = null;
	private String[] headerLine = null;
	
	private InputStream input;

	public CSVLoaderInput() {
		this("import/players_no_adr.sb");
	}

	public CSVLoaderInput(String file) {
		this.file = file;
		
	}
	
	public CSVLoaderInput(InputStream input) {
		this.input = input;
		file = null;
	}

	public Object[] getInput() {
		load();
		ArrayList list = new ArrayList();
		String line;

		try {
			// ignore first line = headerline
			// reader.readLine();
			while ((line = reader.readLine()) != null) {
				if (line.length() > 1  && !line.startsWith("LIZNR") && !line.startsWith("#")) {
					String[] sLine = line.split(";");
					log.debug("readed line: " + line);
					list.add(sLine);
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return list.toArray();
	}

	public void load() {
		if (file == null) {
			reader = new BufferedReader(new InputStreamReader(input));
			return;
		}
		
		try {
			reader = new BufferedReader(new FileReader(new File(file)));
			//reader = new BufferedReader(new InputStreamReader(input));
		} catch (FileNotFoundException ex) {
			log.error("Can't find file:" + Constants.propertiesFile);
			log.info(ex.getStackTrace());
		} catch (IOException ioe) {
			log.error("IOException occured while reading lines from CSV file "
					+ file);
			log.info(ioe.getStackTrace());
		}

	}
}
