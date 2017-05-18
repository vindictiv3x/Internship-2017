package application;

import java.io.File;
import java.util.ArrayList;

/**
 * 
 * @author Maksim
 *
 */
public class StudyPlanDriver implements StudyPlanDriverInterface {

	//VARIABLES NEEDED 
	String examObjectives;
	String bookChapter;
	String date;
	String notes; 
	
	
	/**
	 * Empty Constructor 
	 */
	public StudyPlanDriver(String examObjectives, String bookChapter, String date
			, String notes){
		
		this.examObjectives = examObjectives;
		this.bookChapter = bookChapter;
		this.date = date;
		this.notes= notes;
		
	}
	
	
	
	/**
	 * Reads Study Plan
	 * @param file the file to read
	 */
	public void readFile(File file) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Writes the Study plan to a file 
	 * @param file the file to write to
	 */
	public void writeFile(File file) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Returns the Study Plan as string 
	 * @return String the Study Plan
	 */
	public String toString(){
		
		return"";
	}
	

}
