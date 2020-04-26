/**
 * @author Jonni Tran
 */
package application;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

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
	
	ScrollPane suggestions;
	VBox suggestionsVb;
	ArrayList<GridPane> suggestedItems;
	
	ScrollPane cart;
	VBox cartVb;

	public GardenView() {
		
		//CENTER
		GridPane gardenGrid = new GridPane();
		gardenGrid.setPadding(new Insets(10,10,10,10));
		gardenGrid.setVgap(10);
		gardenGrid.setHgap(10);
		gardenGrid.setGridLinesVisible(true);
		
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				ImageView iv = new ImageView();
				GridPane.setConstraints(iv, i, j);
				gardenGrid.getChildren().add(iv);
			}
		}
		
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
		
		
		//LEFT
		
		cart = new ScrollPane();
		cartVb = new VBox();
		cart.setContent(cartVb);
		
		
		
		//LEFT
		
		
		//RIGHT
		
		this.suggestions = new ScrollPane();
		this.suggestionsVb = new VBox();
		this.suggestedItems = new ArrayList<GridPane>();
		suggestions.setContent(suggestionsVb);
		
		Label suggestionsLbl = new Label("Suggestions");
		
		suggestionsVb.getChildren().add(suggestionsLbl);
		
		//RIGHT
		

		BorderPane borderpane = new BorderPane();
		
		borderpane.setTop(menu);
		borderpane.setCenter(gardenGrid);
		borderpane.setRight(suggestions);
		borderpane.setPadding(new Insets(10,10,10,10));

		this.scene.setRoot(borderpane);
		
		
		
	}

	static Group GardenRoot = new Group();

	
	public void addCartItem() {
		
	}
	
	
	/**
	 * updates the screen. Called when something is changed
	 */
	public void update() {
		
	}
}
