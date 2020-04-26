/**
 * @author Sohan Gadiraju
 */


package application;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HomeView {
	
	
	GridPane grid = new GridPane();
	Scene scene = new Scene(grid);
	
	Button createNew;
	Button editExisting;

	public HomeView() {
		
		grid.setPadding(new Insets(150,450,150,450));
		grid.setVgap(10);
		grid.setHgap(10);
				
		//create new label
		Label create = new Label("Create New");
		GridPane.setConstraints(create, 0, 0);

		
		//edit existing label
		Label edit = new Label("Edit Existing");
		GridPane.setConstraints(edit, 0, 1);
		
		//create new button
		createNew = new Button("Lets get started");
		GridPane.setConstraints(createNew, 1, 0);
		
		//edit existing button
		Button editExisting = new Button("Lets keep working");
		GridPane.setConstraints(editExisting, 1, 1);
		
		grid.getChildren().addAll(create, edit, createNew, editExisting);
		
		this.scene.setRoot(grid);
		
	}
}
