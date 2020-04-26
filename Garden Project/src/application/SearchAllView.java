/**
 * @author Addison Kuykendall 
 * @author Sohan 
 */
package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class SearchAllView {

	ComboBox<String> sunCbx;
	ComboBox<String> waterCbx;
	ComboBox<String> soilCbx;
	ComboBox<String> bloomCbx;
	ComboBox<String> nativeCbx;
	ComboBox<String> filterCbx;
	Button searchPlantsBtn;
	
	Button inputDataBtn;
	Button previewBtn;
	Button editCellsBtn;
	Button searchBtn;
	Button finalViewBtn;
	Button saveBtn;
	Button searchPlants;
	
	ArrayList<GridPane> plantItems;
	ArrayList<GridPane> cartItems;
	
	ScrollPane results;
	VBox resultsVb;
	
	ScrollPane cart;
	VBox cartVb;
	
	BorderPane borderpane;
	Scene scene;
	
	GridPane gp;
	
	static Group searchRoot = new Group();
	
	public SearchAllView() {
		
		this.borderpane = new BorderPane();
		this.scene = new Scene(borderpane);

		
		//TOP
		HBox menu = new HBox();
		menu.setSpacing(5);
		
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
		
		menu.getChildren().addAll(inputDataBtn,previewBtn,editCellsBtn, searchBtn, finalViewBtn,saveBtn);
		//TOP
		
		
		//LEFT
		this.cart = new ScrollPane();
		this.cartVb = new VBox();
		this.cartItems = new ArrayList<GridPane>();
		cart.setContent(cartVb);
		cart.setPadding(new Insets(10,10,10,10));
		cartVb.setSpacing(10);
		

		
		GridPane cartgp4 = new GridPane();
		Label sun4 = new Label("Sunlight prfsfsadeference");
		GridPane.setConstraints(sun4, 1, 0);
		Label water4 = new Label("Water preference");
		GridPane.setConstraints(water4, 1, 1);
		Label soil4 = new Label("Soil Preference");
		GridPane.setConstraints(soil4, 1, 2);
		cartgp4.getChildren().addAll(sun4,water4,soil4);
		
		
		cartVb.getChildren().addAll(cartItems);
		cart.setContent(cartVb);
		//LEFT
		
		
		//RIGHT
		GridPane filterPane = new GridPane();
		filterPane.setPadding(new Insets(10,10,10,10));
		filterPane.setVgap(10);
		filterPane.setHgap(10);
		
		//features within the data input box
		Label cellsLbl = new Label("Search");
		GridPane.setConstraints(cellsLbl, 0, 0);
		
		//text field
		TextField cellFld = new TextField();
		cellFld.setPromptText("Keywords");
		cellFld.setPrefWidth(150);
		GridPane.setConstraints(cellFld, 1, 0);
		
		//sunlight label
		Label sunLbl = new Label("Sunlight Level");
		GridPane.setConstraints(sunLbl, 0, 1);
		
		//sunlight combo box
		sunCbx = new ComboBox<String>();
		GridPane.setConstraints(sunCbx, 1, 1);
		sunCbx.getItems().addAll(
				"Sunny",
				"Medium",
				"Shady"
		);
		
		//water label
		Label waterLbl = new Label("Water Level");
		GridPane.setConstraints(waterLbl, 0, 2);
		
		//water combo box
		waterCbx = new ComboBox<String>();
		GridPane.setConstraints(waterCbx, 1, 2);
		waterCbx.getItems().addAll(
				"Wet",
				"Medium",
				"Dry"
		);
		
		//soil label
		Label soilLbl = new Label("Soil Type");
		GridPane.setConstraints(soilLbl, 0, 3);
		
		//soil combo box
		soilCbx = new ComboBox<String>();
		GridPane.setConstraints(soilCbx, 1, 3);
		soilCbx.getItems().addAll(
				"Clay",
				"Mix",
				"Sandy"
		);
		
		//bloom label
		Label bloomLbl = new Label("Bloom Season");
		GridPane.setConstraints(bloomLbl, 0, 4);
		
		//bloom combo box
		bloomCbx = new ComboBox<String>();
		GridPane.setConstraints(bloomCbx, 1, 4);
		bloomCbx.getItems().addAll(
				"Spring",
				"Summer",
				"Fall",
				"Winter"
		);
		
		//Search button
		searchPlantsBtn = new Button("Search Plants");
		GridPane.setConstraints(searchPlantsBtn, 1, 5);
		
		filterPane.getChildren().addAll(cellsLbl, cellFld, sunLbl, sunCbx, waterLbl, waterCbx, soilLbl, soilCbx, bloomLbl, bloomCbx, searchPlantsBtn);
		//RIGHT

		
		
		//CENTER
		this.results = new ScrollPane();
		this.resultsVb = new VBox();
		
		results.setContent(resultsVb);
		results.setPadding(new Insets(10,10,10,10));
		resultsVb.setSpacing(10);
		resultsVb.setPadding(new Insets(10,10,10,10));
		resultsVb.setPrefWidth(550);

		this.borderpane.setCenter(this.results);
		
		this.plantItems = new ArrayList<GridPane>();
		
		//CENTER
		
	
		
	
		//BORDERPANE
		this.borderpane = new BorderPane();
		
		borderpane.setTop(menu);
		borderpane.setRight(filterPane);
		borderpane.setCenter(results);
		borderpane.setLeft(cart);
		borderpane.setPadding(new Insets(10,10,10,10));
			
		
		scene = new Scene(borderpane);
		this.scene.setRoot(borderpane);	
		
		searchRoot.getChildren().add(borderpane);
		
	}
	
	public void displayResults(ArrayList<Plant> plants) {
		
		this.plantItems.clear();
		this.resultsVb.getChildren().clear();
		
		for (Plant p : plants) {
			
			gp = new GridPane();
			Text descFlw = new Text();
			Button addToCartBtn = new Button("Add to Cart");
			
			descFlw.setText(p.getName() + ": " + "A plant that blooms in the " + p.getBloom() + " and thrives in " + p.getSunlight() + " and " +
					p.getSoil() + " soil. This plant can be described with the phrase, '" + p.getDescription() + ".'"  );
			descFlw.setWrappingWidth(400);
			GridPane.setConstraints(descFlw, 1, 0);
						
			GridPane.setConstraints(addToCartBtn, 2, 0);
			
			gp.getChildren().addAll(descFlw, addToCartBtn);
			gp.setPadding(new Insets(5,5,5,5));
			this.plantItems.add(gp);
			
		}
		
		resultsVb.getChildren().addAll(plantItems);
		results.setContent(resultsVb);
		borderpane.setCenter(results);
	}
	
	public void displayCart(ArrayList<Plant> plants) {
		
		this.cartItems.clear();
		this.cartVb.getChildren().clear();

		ScrollPane cart = new ScrollPane();
		
		for (Plant p : plants) {
			
			GridPane cartgp = new GridPane();
			Label sun = new Label(p.getSunlight());
			GridPane.setConstraints(sun, 1, 0);
			Label water = new Label(p.getWater());
			GridPane.setConstraints(water, 1, 1);
			Label soil = new Label(p.getSoil());
			GridPane.setConstraints(soil, 1, 2);
			cartgp.getChildren().addAll(sun, water, soil);
			
			cartgp.setPadding(new Insets(10,10,10,10));
			this.cartItems.add(gp);
		}
		
		cartVb.getChildren().addAll(cartItems);
		cart.setContent(cartVb);
		borderpane.setCenter(cart);

	}
	
	//displays the search all view on the scene
	public void display() {
	}
	
	//changes the images of plants displayed depending on season(bloomage)
	public void changeSeason() {
	}
	
	//updates the plants on the screen based on criteria.  Basically a "search" button.
	public void updatePlants() {
	}
	
}
