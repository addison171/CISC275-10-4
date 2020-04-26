/**
 * @author Sohan Gadiraju
 */
package application;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class InputDataView {
	ComboBox<String> sunCbx;
	ComboBox<String> waterCbx;
	ComboBox<String> soilCbx;
	Text plotSize;
	Button addData;
	static Group inputDataRoot = new Group();
	
	
	Button inputDataBtn;
	Button previewBtn;
	Button editCellsBtn;
	Button searchBtn;
	Button finalViewBtn;
	Button saveBtn;

	
	static BorderPane borderpane;
	Scene scene;
	
	ScrollPane cart;
	
	Button saveDataBtn;
	
	public InputDataView() {
		
		
		
		//CENTER
		GridPane gardenGrid = new GridPane();
		gardenGrid.setPadding(new Insets(10,10,10,10));
		gardenGrid.setVgap(10);
		gardenGrid.setHgap(10);
		gardenGrid.setGridLinesVisible(true);
		
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				ImageView iv = new ImageView();
				gardenGrid.add(iv, i, j);
			}
		}
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
		
		this.cart = new ScrollPane();
		VBox vb = new VBox();
		cart.setContent(vb);
		cart.setPadding(new Insets(10,10,10,10));
		
		GridPane gp1 = new GridPane();
		Label sun1 = new Label("Sunlight preference");
		GridPane.setConstraints(sun1, 1, 0);
		Label water1 = new Label("Water preference");
		GridPane.setConstraints(water1, 1, 1);
		Label soil1 = new Label("Soil Preference");
		GridPane.setConstraints(soil1, 1, 2);
		
		gp1.getChildren().addAll(sun1,water1,soil1);
		vb.getChildren().add(gp1);
		
		GridPane gp2 = new GridPane();
		Label sun2 = new Label("Sunlight preference");
		GridPane.setConstraints(sun2, 1, 0);
		Label water2 = new Label("Water preference");
		GridPane.setConstraints(water2, 1, 1);
		Label soil2 = new Label("Soil Preference");
		GridPane.setConstraints(soil2, 1, 2);
		
		gp2.getChildren().addAll(sun2,water2,soil2);
		vb.getChildren().add(gp2);
		
		

		
		
		
		//LEFT
		

		//RIGHT
		GridPane inputDataBox = new GridPane();
		inputDataBox.setPadding(new Insets(10,10,10,10));
		inputDataBox.setVgap(10);
		inputDataBox.setHgap(10);
		
		//features within the data input box
		//Label cellsLbl = new Label("Garden Size: ");
		//GridPane.setConstraints(cellsLbl, 0, 0);
		
		//text field
		TextField cellFld = new TextField();
		cellFld.setPromptText("Height");
		cellFld.setPrefWidth(200);
		GridPane.setConstraints(cellFld, 1, 0);
		
		TextField cellFld2 = new TextField();
		cellFld2.setPromptText("Width");
		cellFld2.setPrefWidth(200);
		GridPane.setConstraints(cellFld2, 0, 0);
		
		//sunlight label
		Label sunLbl = new Label("Sunlight Level");
		GridPane.setConstraints(sunLbl, 0, 1);
		
		//sunlight combo box
		sunCbx = new ComboBox<String>();
		GridPane.setConstraints(sunCbx, 1, 1);
		sunCbx.getItems().addAll(
				"High",
				"Medium",
				"Low"
		);
		
		//water label
		Label waterLbl = new Label("Water Level");
		GridPane.setConstraints(waterLbl, 0, 2);
		
		//sunlight combo box
		waterCbx = new ComboBox<String>();
		GridPane.setConstraints(waterCbx, 1, 2);
		waterCbx.getItems().addAll(
				"High",
				"Medium",
				"Low"
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
		
		// enter the data into selected boxes
		this.saveDataBtn = new Button("Enter Data");
		GridPane.setConstraints(saveDataBtn, 1, 4);
		
		
		inputDataBox.getChildren().addAll(cellFld, cellFld2, sunLbl, sunCbx, waterLbl, waterCbx, soilLbl, soilCbx, saveDataBtn);
		//RIGHT


		//BORDERPANE
		borderpane = new BorderPane();
		
		borderpane.setTop(menu);
		borderpane.setCenter(gardenGrid);
		borderpane.setRight(inputDataBox);
		borderpane.setLeft(this.cart);
		borderpane.setPadding(new Insets(10,10,10,10));
		
		scene =  new Scene(borderpane);
		
		this.scene.setRoot(borderpane);
		inputDataRoot.getChildren().add(borderpane);

	}
	
	public void update() {
	}
	
	/**
	 * goes back to the garden view with the settings updated according to the selections.
	 */
	public void view() {
		
	}
}
