
//Internship CMSC 269

package application;

//The import files needed for the project 
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
 

/**
* The Gui Driver Class 
* @author Maksim Ekin Eren 
*
*/

public class Main extends Application {
	//Launch the gui
	public static void main(String[] args) {
		launch(args);
	}
	
	//BUTTONS NEEDED
	static Button exit = new Button("Exit");
	
	//RADIO BUTTONS NEEDED
	static RadioButton readStudyRB = new RadioButton("Read Study Plan");
	static RadioButton newStudyRB = new RadioButton("Create New Study Plan");
	
	//Table
	public TableView table = new TableView();
	
	
	//The GUI
	public void start(Stage primaryStage) {
		
		
		
		//Organize the radio buttons 
		HBox radioButtons1 = new HBox(20);
		//Create toggle group for the radio buttons
		ToggleGroup group = new ToggleGroup();
		readStudyRB.setToggleGroup(group);
		newStudyRB.setToggleGroup(group);
		//Add the radio buttons to the hbox
		radioButtons1.getChildren().addAll(readStudyRB, newStudyRB);

		//Set Location of the Radio Buttons
		radioButtons1.setLayoutX(900);
		radioButtons1.setLayoutY(100);	
		
		//Set the Location of the exit button
		exit.setLayoutX(2050);
		exit.setLayoutY(1100);
		
		//Set the header to the gui 
		final Label studyPlanlabel = new Label("Study Plan");
		studyPlanlabel.setFont(new Font("Arial" , 20));
		
		//Set the table editable
		table.setEditable(true);
		
		//CREATE TABLE COLUMNS
		TableColumn examObjectivesCol = new TableColumn("Exam Objectives");
		TableColumn bookChapterCol = new TableColumn("Book Chapter");
		TableColumn dateCol = new TableColumn("Date");
		TableColumn notesCol = new TableColumn("Notes");
		
		
		//Add the columns to the table
		table.getColumns().addAll(examObjectivesCol, bookChapterCol, dateCol, notesCol);
		
		//Set the size and the location of the table 
		table.setLayoutX(600);
		table.setLayoutY(160);
		table.setPrefSize(1000, 900);
		
		
		
		//Exit when the exit button is pressed
		exit.addEventFilter(MouseEvent.MOUSE_CLICKED,
				new EventHandler<MouseEvent>(){
			public void handle(MouseEvent event){
				System.exit(0);
				return;
			}
		});
		
		//Creating the Group Object 
		Group root = new Group(exit, radioButtons1, studyPlanlabel,table);
		
		//Creating a scene object
		Scene scene = new Scene(root);
		
		//Setting the title to the Stage
		primaryStage.setTitle("A++");
		
		//Maximize the stage
		primaryStage.setMaximized(true);
		
		//Adding the scene to the stage 
		primaryStage.setScene(scene);
		
		//Displaying the contents of the stage
		primaryStage.show();
		
		
		
	}
	

}
