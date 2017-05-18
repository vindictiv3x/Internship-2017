package application;

import java.io.File;

/**
 * Interface for the StudyPlanDriver
 * @author Maksim Ekin Eren
 */

public interface StudyPlanDriverInterface {
	
	/**
	 * Reads Study Plan into the gui 
	 * @param file the file that will be read
	 */
	public void readFile(File file);
	
	/**
	 * Writes the study plan into the file 
	 * @param file the file the study plan to be written 
	 */
	public void writeFile(File file);
	
	
	/**
	 * Creates a string representation of the object 
	 * @return String that represents all the objects in the ArrayList
	 */
	public String toString();

}
