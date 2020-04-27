/**
 * @author Sohan Gadiraju
 */
package application;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InsertObstructionView {
	Image circle;
	Image rectangle;
	Button gardenViewBtn;
	Button inputDataBtn;
	Button previewBtn;
	Button editCellsBtn;
	Button searchBtn;
	Button finalViewBtn;
	Button saveBtn;
	Button createPlot;
	Button insertObstruction;

	
	BorderPane borderpane;
	Scene scene;
	
	ScrollPane cart;
	
	GridPane gardenGrid;
	ComboBox<String> obstruction;
	TextArea label;
	Group iovRoot = new Group();

	
	//updates the view according to what inputs have been changed
	public InsertObstructionView() {
		//CENTER
		gardenGrid = new GridPane();
		gardenGrid.setPadding(new Insets(10,10,10,10));
		gardenGrid.setGridLinesVisible(true);
		gardenGrid.setPrefWidth(550);
		
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				ImageView iv = new ImageView();
				iv.setFitHeight(40);
				iv.setFitWidth(40);
				gardenGrid.add(iv, i, j);
			}
		}
		//CENTER
		for (int i=5; i<7; i++) {
			for (int j=5; j<7; j++) {
				ImageView iv = new ImageView("images/House.png");
				iv.setFitHeight(40);
				iv.setFitWidth(40);
				gardenGrid.add(iv, i, j);
			}
		}
		for (int i=8; i<10; i++) {
			for (int j=0; j<4; j++) {
				ImageView iv = new ImageView("images/Building.png");
				iv.setFitHeight(40);
				iv.setFitWidth(40);
				gardenGrid.add(iv, i, j);
			}
		}
		
		//TOP
		HBox menu = new HBox();
		menu.setSpacing(5);
		
		//Buttons within the menu HBox
		//InsertObstruction button
		insertObstruction = new Button("Insert Obstruction");
		
		//garden view
		gardenViewBtn = new Button("Garden View");
		
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
		
		menu.getChildren().addAll(inputDataBtn, gardenViewBtn ,previewBtn,editCellsBtn, searchBtn, finalViewBtn,insertObstruction,saveBtn);
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
		
		Text instruct = new Text("Choose the type of obstruction you wish to add");
		
		instruct.setWrappingWidth(350);
		GridPane.setConstraints(instruct, 0, 0, 2, 1 );

		
		//sunlight label
		Label obstructionType = new Label("Obstruction");
		GridPane.setConstraints(obstructionType, 0, 4);
		
		//sunlight combo box
		obstruction = new ComboBox<String>();
		GridPane.setConstraints(obstruction, 1, 4);
		obstruction.getItems().addAll(
				"House",
				"Pond",
				"Lake",
				"Building"
		);
		
		
		
		inputDataBox.getChildren().addAll(instruct, obstructionType, obstruction);
		//inputDataBox.getChildren().addAll(cellFld, cellFld2, sunLbl, sunCbx, waterLbl, waterCbx, soilLbl, soilCbx, saveDataBtn);
		//RIGHT


		//BORDERPANE
		borderpane = new BorderPane();
		
		borderpane.setTop(menu);
		borderpane.setCenter(gardenGrid);
		borderpane.setRight(inputDataBox);
		//borderpane.setLeft(this.cart);
		borderpane.setPadding(new Insets(10,10,10,10));
		
		scene =  new Scene(borderpane);
		
		this.scene.setRoot(borderpane);
		iovRoot.getChildren().add(borderpane);

	}
	
	/**
	 * creates an image on the scene of some shape
	 * @param shape the shape of the obstruction the insert obstruction button will create
	 */
	public void generateShape(Image shape) {
		
		
	}
	
}

