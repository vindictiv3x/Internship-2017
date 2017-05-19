
//Internship CMSC 269

package application;

//The import files needed for the project 
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

 

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
	
	//Table
	public TableView<StudyPlanDriver> table;
	
	
	
	@Override
	public void init(){
		table = new TableView<StudyPlanDriver>();
		
		table.getColumns().addAll(StudyPlanDriver.getColumn(table));
		
		table.setItems(getStudyPlanDummy());
		
		table.setOnMouseClicked(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent event) {
				if(event.getClickCount()> 0){
					if(table.getSelectionModel().getSelectedIndex() >= 0){
						System.out.println(table.getSelectionModel().getSelectedItem().getBook());
					}
				}
				
			}
			
		});
		
		
		
	}
	
	
	//The GUI
	public void start(Stage primaryStage) {
		
		table.setPrefSize(1250, 500);
	
		
		//Creating the Group Object 
		Group root = new Group(table);
		
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
	
	/**
	 * 
	 * @return
	 */
	public static ObservableList<StudyPlanDriver> getStudyPlanDummy(){
		ObservableList<StudyPlanDriver> data = FXCollections.observableArrayList();
		
		data.addAll(new StudyPlanDriver("", "1", "", ""));
		data.addAll(new StudyPlanDriver("", "Review questions", "", ""));
		data.addAll(new StudyPlanDriver("", "2", "", ""));
		data.addAll(new StudyPlanDriver("", "Review questions", "", ""));
		data.addAll(new StudyPlanDriver("", "3", "", ""));
		data.addAll(new StudyPlanDriver("", "Review questions", "", ""));
		data.addAll(new StudyPlanDriver("", "4", "", ""));
		data.addAll(new StudyPlanDriver("", "Review questions", "", ""));
		data.addAll(new StudyPlanDriver("", "5", "", ""));
		data.addAll(new StudyPlanDriver("", "Review questions", "", ""));
		data.addAll(new StudyPlanDriver("", "6", "", ""));
		data.addAll(new StudyPlanDriver("", "Review questions", "", ""));
		data.addAll(new StudyPlanDriver("", "Take Free Oracle\nPractice Exam", "", ""));
		data.addAll(new StudyPlanDriver("", "Take Practice Exam\navailable in the book\nused to study", "", ""));
		data.addAll(new StudyPlanDriver("", "Use flashcards to \npractice", "", ""));
		data.addAll(new StudyPlanDriver("", "Take Test", "", ""));
		return data;
	}

}
