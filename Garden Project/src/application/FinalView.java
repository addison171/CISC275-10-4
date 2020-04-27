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
import javafx.scene.text.Text;

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
		
		GridPane buttonsGP = new GridPane();
		GridPane scoringGP = new GridPane();
		
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
		
		
		GridPane.setConstraints(scoresLabel,2,1);
		GridPane.setConstraints(consLabel,1,3);
		GridPane.setConstraints(prosLabel,3,3);
		
		GridPane.setConstraints(scores,2,2);
		GridPane.setConstraints(pros,1,4);
		GridPane.setConstraints(cons,3,4);
		
		GridPane.setConstraints(editButton,1,1);
		GridPane.setConstraints(saveButon,1,2);
		GridPane.setConstraints(newgardenButton,1,3);

		
		//GridPane 
		buttonsGP.getChildren().addAll(editButton,saveButton,newgardenButton);
		scoringGP.getChildren().addAll(scoresLabel,consLabel,prosLabel,scores,pros,cons);
		
		//Text goes top of borderpane
		finalviewBP.setTop(scoringGP);
		finalviewBP.setTop(buttonsGP);

		
		//Buttons at bottom of borderpane
		
		
		
		Scene finalScene = new Scene(finalviewBP);

		this.finalScene.setRoot(finalviewBP);
		finalRoot.getChildren().add(finalviewBP);
	}
	
	
	
	
	public void draw() {
		
	}
}
