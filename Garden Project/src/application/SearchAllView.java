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
		
		GridPane cartgp1 = new GridPane();
		Label sun1 = new Label("Sunlight preference");
		GridPane.setConstraints(sun1, 1, 0);
		Label water1 = new Label("Water preference");
		GridPane.setConstraints(water1, 1, 1);
		Label soil1 = new Label("Soil Preference");
		GridPane.setConstraints(soil1, 1, 2);
		cartgp1.getChildren().addAll(sun1,water1,soil1);
		
		GridPane cartgp2 = new GridPane();
		Label sun2 = new Label("Sunlight preference");
		GridPane.setConstraints(sun2, 1, 0);
		Label water2 = new Label("Water preference");
		GridPane.setConstraints(water2, 1, 1);
		Label soil2 = new Label("Soil Preference");
		GridPane.setConstraints(soil2, 1, 2);
		cartgp2.getChildren().addAll(sun2,water2,soil2);
		
		GridPane cartgp3 = new GridPane();
		Label sun3 = new Label("Sunlight preference");
		GridPane.setConstraints(sun3, 1, 0);
		Label water3 = new Label("Water preference");
		GridPane.setConstraints(water3, 1, 1);
		Label soil3 = new Label("Soil Preference");
		GridPane.setConstraints(soil3, 1, 2);
		cartgp3.getChildren().addAll(sun3,water3,soil3);

		
		GridPane cartgp4 = new GridPane();
		Label sun4 = new Label("Sunlight prfsfsadeference");
		GridPane.setConstraints(sun4, 1, 0);
		Label water4 = new Label("Water preference");
		GridPane.setConstraints(water4, 1, 1);
		Label soil4 = new Label("Soil Preference");
		GridPane.setConstraints(soil4, 1, 2);
		cartgp4.getChildren().addAll(sun4,water4,soil4);
		
		this.cartItems.add(cartgp1);
		this.cartItems.add(cartgp2);
		this.cartItems.add(cartgp3);
		this.cartItems.add(cartgp4);
		
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
		
		//sunlight combo box
		waterCbx = new ComboBox<String>();
		GridPane.setConstraints(waterCbx, 1, 2);
		waterCbx.getItems().addAll(
				"Wet",
				"Medium",
				"Dry"
		);
		
		//water label
		Label soilLbl = new Label("Soil Type");
		GridPane.setConstraints(soilLbl, 0, 3);
		
		//sunlight combo box
		soilCbx = new ComboBox<String>();
		GridPane.setConstraints(soilCbx, 1, 3);
		soilCbx.getItems().addAll(
				"Clay",
				"Mix",
				"Sandy"
		);
		
		//Search button
		searchPlants = new Button("Search");
		GridPane.setConstraints(searchPlants, 1, 4);
		
		filterPane.getChildren().addAll(cellsLbl, cellFld, sunLbl, sunCbx, waterLbl, waterCbx, soilLbl, soilCbx, searchPlants);
		//RIGHT

		
		
		//CENTER
		this.results = new ScrollPane();
		this.resultsVb = new VBox();
		results.setContent(resultsVb);
		results.setPadding(new Insets(10,10,10,10));
		resultsVb.setSpacing(10);
		
		GridPane gp1 = new GridPane();
		Text descFlw1 = new Text();
		descFlw1.setText("This is a very long description of a plant.  fjkdfjadskfjaskljdfkasl djsfkldashfjklfhads hfdjaklfhdkl afdhajkl hjdskalfh ");
		descFlw1.setWrappingWidth(600);
		GridPane.setConstraints(descFlw1, 1, 0);
		gp1.getChildren().add(descFlw1);
		
		GridPane gp2 = new GridPane();
		Text descFlw2 = new Text();
		descFlw2.setText("This is a very long description of a plant.  fjkdfjadskfjaskljdfkasl djsfkldashfjklfhads hfdjaklfhdkl afdhajkl hjdskalfh ");
		descFlw2.setWrappingWidth(600);
		GridPane.setConstraints(descFlw2, 1, 0);
		gp2.getChildren().add(descFlw2);

		GridPane gp3 = new GridPane();
		Text descFlw3 = new Text();
		descFlw3.setText("This is a very long description of a plant.  fjkdfjadskfjaskljdfkasl djsfkldashfjklfhads hfdjaklfhdkl afdhajkl hjdskalfh ");
		descFlw3.setWrappingWidth(600);
		GridPane.setConstraints(descFlw3, 1, 0);
		gp3.getChildren().add(descFlw3);
		
		GridPane gp4 = new GridPane();
		Text descFlw4 = new Text();
		descFlw4.setText("This is a very long description of a plant.  fjkdfjadskfjaskljdfkasl djsfkldashfjklfhads hfdjaklfhdkl afdhajkl hjdskalfh ");
		descFlw4.setWrappingWidth(600);
		GridPane.setConstraints(descFlw4, 1, 0);
		gp4.getChildren().add(descFlw4);
		
		GridPane gp5 = new GridPane();
		Text descFlw5 = new Text();
		descFlw5.setText("This is a very long description of a plant.  fjkdfjadskfjaskljdfkasl djsfkldashfjklfhads hfdjaklfhdkl afdhajkl hjdskalfh ");
		descFlw5.setWrappingWidth(600);
		GridPane.setConstraints(descFlw5, 1, 0);
		gp5.getChildren().add(descFlw5);

		GridPane gp6 = new GridPane();
		Text descFlw6 = new Text();
		descFlw6.setText("This is a very long description of a plant.  fjkdfjadskfjaskljdfkasl djsfkldashfjklfhads hfdjaklfhdkl afdhajkl hjdskalfh ");
		descFlw6.setWrappingWidth(600);
		GridPane.setConstraints(descFlw6, 1, 0);
		gp6.getChildren().add(descFlw6);

		
		this.plantItems = new ArrayList<GridPane>();
		
		plantItems.add(gp1);
		plantItems.add(gp2);
		plantItems.add(gp3);
		plantItems.add(gp4);
		plantItems.add(gp5);
		plantItems.add(gp6);

		for (GridPane gp : plantItems) {
			gp.setPadding(new Insets(5,5,5,5));
		}

		resultsVb.getChildren().addAll(plantItems);
		resultsVb.setPadding(new Insets(10,10,10,10));
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
	
	public void addResult(String description) {
		
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
