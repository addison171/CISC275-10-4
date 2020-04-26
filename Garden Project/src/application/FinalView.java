/**
 * @author Jonni Tran
 */
package application;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;

public class FinalView {
	Text scores;
	Text pros;
	Text cons;
	Button saveButton;
	Button editButton;
	Button newgardenButton;
	static Group finalRoot = new Group();
	
	
	
	/**
	 * draws the screen
	 */
	
	public FinalView(){
		
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
		
		editButton.setPadding(editButton,new Insets(2,2,2,2));
		saveButton.setPadding(saveButton, new Insets(2,2,2,2));
		newgardenButton.setPadding(newgardenButton, new Insets(2,2,2,2));
		
		
		
		Scene finalScene = new Scene(finalviewBP);

		
	}
	
	
	
	
	public void draw() {
		
	}
}