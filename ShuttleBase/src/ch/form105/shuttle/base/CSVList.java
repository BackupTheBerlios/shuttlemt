package ch.form105.shuttle.base;

import java.util.ArrayList;

/**
 * Holds a csv table as lines of objects
 * @author Heiko Kundlacz
 */
public class CSVList {
	
	ArrayList lineList;
	
	/**
	 * Adding lines to the list
	 * @param line array of objects
	 */
	public void add(Object[] line) {
		lineList.add(line);
	}
	
	/**
	 * Getting the list of lines
	 * @return The line list
	 */
	public ArrayList getStringList() {
		return lineList;
	}

	/**
	 * Setting the list of lines
	 * @param lineList
	 */
	public void setStringList(ArrayList lineList) {
		this.lineList = lineList;
	}
	
	

}
