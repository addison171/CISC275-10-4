/**
 * @author Jonni Tran
 */
package application;



import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class FinalView {
	Text scores;
	Text pros;
	Text cons;
	Button saveButton;
	Button editButton;
	Button newgardenButton;
	static Group finalRoot = new Group();
	
	Button gardenViewBtn;
	Button inputDataBtn;
	Button previewBtn;
	Button editCellsBtn;
	Button searchBtn;
	Button finalViewBtn;
	Button saveBtn;
	Button searchPlants;
	
	/**
	 * draws the screen
	 */
	
	public FinalView(){
		
		//TOP
		HBox menu = new HBox();
		menu.setSpacing(5);
		
		//garden view
		gardenViewBtn = new Button("Garden View");		
		
		//input data
		inputDataBtn = new Button("Input Data");

		//preview
		previewBtn = new Button("Preview");
		//previewBtn.setonAction
		
		//edit cells
		editCellsBtn = new Button("Edit Cells");
		
		//search all
		searchBtn = new Button("Plants Search");
		
		//final view 
		finalViewBtn = new Button("Final View");
		
		//save button
		saveBtn = new Button("Save");
		
		menu.getChildren().addAll(inputDataBtn, gardenViewBtn ,previewBtn,editCellsBtn, searchBtn, finalViewBtn,saveBtn);
		//TOP
		
		BorderPane finalviewBP = new BorderPane();
		
		
		
		TextArea scores = new TextArea();
		
		TextArea pros = new TextArea();

		TextArea cons = new TextArea();

		
		Label scoresLabel = new Label("Score");
		Label consLabel = new Label("Cons");
		Label prosLabel = new Label("Pros");
		
	
		scores.setText("B+");
		
		pros.setText("Diverse amount of plants for food");
		
		
		cons.setText("Too much grass");
		
		//Buttons within the menu HBox
				
		//Edit garden button
		editButton  = new Button("Edit");

		//Save garden button
		saveButton = new Button("Save");
		
		//New garden button
		newgardenButton = new Button ("New Design");
		
		//Creates the scene
		
		//Text goes top of borderpane
		finalviewBP.setTop(scores);
		finalviewBP.setTop(pros);
		finalviewBP.setTop(cons);

		
		finalviewBP.setMargin(scores,new Insets(2,2,2,2));
		finalviewBP.setMargin(pros,new Insets(2,2,2,2));
		finalviewBP.setMargin(cons,new Insets(2,2,2,2));
		
		//Buttons at bottom of borderpane
		finalviewBP.setBottom(editButton);
		finalviewBP.setBottom(saveButton);
		finalviewBP.setBottom(newgardenButton);
		
		editButton.setPadding(new Insets(2,2,2,2));
		saveButton.setPadding(new Insets(2,2,2,2));
		newgardenButton.setPadding(new Insets(2,2,2,2));
		
		
		finalviewBP.setTop(menu);
		Scene finalScene = new Scene(finalviewBP);

		
	}
	
	
	
	
	public void draw() {
		
	}
}
