package application;

import java.io.File;
import java.util.ArrayList;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * 
 * @author Maksim
 *
 */
public class StudyPlanDriver implements StudyPlanDriverInterface {

	//VARIABLES NEEDED 
	String examObjectives;
	String book;
	String date;
	String notes; 
	
	
	/**
	 * Constractor
	 */
	public StudyPlanDriver(String examObjectives, String book, String date
			, String notes){
		
		this.examObjectives = examObjectives;
		this.book = book;
		this.date = date;
		this.notes= notes;
		
	}
	
	/**
	 * Empty Constractor 
	 */
	public StudyPlanDriver(){
		this.examObjectives ="";
		this.book = "";
		this.date = "";
		this.notes = "";
	}
	
	
	
	
	/**
	 * 
	 * @return
	 */
	public String getExamObjectives() {
		return examObjectives;
	}

	/**
	 * 
	 * @param examObjectives
	 */
	public void setExamObjectives(String examObjectives) {
		this.examObjectives = examObjectives;
	}

	/**
	 * 
	 * @return
	 */
	public String getDate() {
		return date;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * 
	 * @return
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * 
	 * @param notes
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getBook(){
		return book;
	}
	
	/**
	 * 
	 * @param book
	 */
	public void setBook(String book){
		this.book = book;
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
	
	/**
	 * 
	 * @param table
	 * @return
	 */
	public static ArrayList<TableColumn<StudyPlanDriver,?>> getColumn(TableView table){
		
		int i;
		ArrayList<TableColumn<StudyPlanDriver, ?>> columns = new ArrayList<TableColumn<StudyPlanDriver,?>>();
		
		String[] columnNames = {"Exam Objectives", "Book Chapter", "Date", "Notes"};
		String[] variableNames = {"examObjectives", "book", "date", "notes"};
		Integer[] column_width = {25, 25, 25, 25};
		
		i = 0;
		TableColumn<StudyPlanDriver, String> examObjectivesCol = new TableColumn<>(columnNames[i++]); 
		TableColumn<StudyPlanDriver, String> bookCol = new TableColumn<>(columnNames[i++]); 
		TableColumn<StudyPlanDriver, String> dateCol = new TableColumn<>(columnNames[i++]); 
		TableColumn<StudyPlanDriver, String> notesCol = new TableColumn<>(columnNames[i++]); 
		
		i=0;
		examObjectivesCol.prefWidthProperty().bind(table.widthProperty().divide(100/column_width[i++]));
		bookCol.prefWidthProperty().bind(table.widthProperty().divide(100/column_width[i++]));
		dateCol.prefWidthProperty().bind(table.widthProperty().divide(100/column_width[i++]));
		notesCol.prefWidthProperty().bind(table.widthProperty().divide(100/column_width[i++]));
		
		i =0;
		examObjectivesCol.setCellValueFactory(new PropertyValueFactory<StudyPlanDriver, String>(variableNames[i++]));
		bookCol.setCellValueFactory(new PropertyValueFactory<StudyPlanDriver, String>(variableNames[i++]));
		dateCol.setCellValueFactory(new PropertyValueFactory<StudyPlanDriver, String>(variableNames[i++]));
		notesCol.setCellValueFactory(new PropertyValueFactory<StudyPlanDriver, String>(variableNames[i++]));
		
		
		columns.add(examObjectivesCol);
		columns.add(bookCol);
		columns.add(dateCol);
		columns.add(notesCol);
		
		return  columns;
		
	}
	

}
