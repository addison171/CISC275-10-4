/**
 * @author Jonni Tran
 */
package application;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class GardenView {
			
	Button insertObstruction = new Button("Insert Obstruction");
	Button view = new Button();
	Button inputData = new Button();
	Button preview = new Button();
	Button editCells = new Button();
	Button finalView = new Button();
	Button saveAll = new Button();
	
	HBox menu = new HBox();
	
	BorderPane borderPane = new BorderPane();
	
	Scene scene = new Scene(borderPane);

	public GardenView() {
		
		//CENTER
		GridPane gardenGrid = new GridPane();
		gardenGrid.setPadding(new Insets(10,10,10,10));
		gardenGrid.setVgap(10);
		gardenGrid.setHgap(10);
		//CENTER

		
		//TOP
		HBox menu = new HBox();
		menu.setSpacing(5);
		
		//Buttons within the menu HBox
		//input data
		Button inputDataBtn = new Button("Input Data");
		
		//preview
		Button previewBtn = new Button("Preview");
		
		//edit cells
		Button editCellsBtn = new Button("Edit Cells");
		
		//search all
		Button searchBtn = new Button("Plants Search");
		
		//final view 
		Button finalViewBtn = new Button("Final View");
		
		//save button
		Button saveBtn = new Button("Save");
		
		menu.getChildren().addAll(inputDataBtn,previewBtn,editCellsBtn, searchBtn, finalViewBtn,saveBtn);
		//TOP
		

				
		BorderPane borderpane = new BorderPane();
		
		borderpane.setTop(menu);
		borderpane.setCenter(gardenGrid);
		borderpane.setPadding(new Insets(10,10,10,10));

		this.scene.setRoot(borderpane);
		
		
	}

	static Group GardenRoot = new Group();

	/**
	 * updates the screen. Called when something is changed
	 */
	public void update() {
		
	}
}
