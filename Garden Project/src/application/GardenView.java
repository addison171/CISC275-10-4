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
	Button view;
	Button inputDataBtn;
	Button previewBtn;
	Button editCellsBtn;
	Button finalViewBtn;
	Button saveBtn;
	Button searchBtn;
	
	HBox menu = new HBox();
	
	BorderPane borderPane = new BorderPane();
	
	Scene scene = new Scene(borderPane);
	
	static Group gardenRoot = new Group();

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
		inputDataBtn = new Button("Input Data");
		
		//preview
		previewBtn = new Button("Preview");
		
		//edit cells
		editCellsBtn = new Button("Edit Cells");
		
		//search all
		searchBtn = new Button("Plants Search");
		
		//final view 
		finalViewBtn = new Button("Final View");
		
		//save button
		saveBtn = new Button("Save");
		
		menu.getChildren().addAll(inputDataBtn,previewBtn,editCellsBtn, searchBtn, finalViewBtn,saveBtn);
		//TOP
		
		
		//LEFT
		/**
		cart = new ScrollPane();
		cartVb = new VBox();
		cart.setContent(cartVb);
		*/
		
		
		//LEFT
		

		BorderPane borderpane = new BorderPane();
		
		borderpane.setTop(menu);
		borderpane.setCenter(gardenGrid);
		borderpane.setPadding(new Insets(10,10,10,10));

		this.scene.setRoot(borderpane);
		
		gardenRoot.getChildren().add(borderpane);
		
		
	}


	/**
	 * updates the screen. Called when something is changed
	 */
	public void update() {
		
	}
}
