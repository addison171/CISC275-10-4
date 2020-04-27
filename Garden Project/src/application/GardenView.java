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
	Button view;
	Button gardenViewBtn;
	Button inputDataBtn;
	Button previewBtn;
	Button editCellsBtn;
	Button finalViewBtn;
	Button saveBtn;
	Button searchBtn;
	HBox menu = new HBox();
	
	ScrollPane cart;
	VBox cartVb;
	ArrayList<GridPane> cartItems;
	Label cartLbl;
	
	BorderPane borderpane;
	Scene scene;
	
	static Group gardenRoot = new Group();

	public GardenView() {
		
		this.borderpane = new BorderPane();
		this.scene = new Scene(borderpane);

		
		//CENTER
		GridPane gardenGrid = new GridPane();
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

		
		//TOP
		HBox menu = new HBox();
		menu.setSpacing(5);
		
		//Buttons within the menu HBox
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
		
		menu.getChildren().addAll(gardenViewBtn, inputDataBtn,previewBtn,editCellsBtn, searchBtn, finalViewBtn,saveBtn);
		//TOP
		
		
		//LEFT
		this.cart = new ScrollPane();
		this.cartVb = new VBox();
		this.cartItems = new ArrayList<GridPane>();
		cart.setContent(cartVb);
		cart.setPadding(new Insets(10,10,10,10));
		cartVb.setSpacing(10);
		
		this.cartLbl = new Label("Cart");
		this.cartVb.getChildren().add(cartLbl);
		this.cart.setMinWidth(200);
		
		GridPane cartgp = new GridPane();
		Label sun = new Label("Sun");
		GridPane.setConstraints(sun, 1, 0);
		Label water = new Label("Water");
		GridPane.setConstraints(water, 1, 1);
		Label soil = new Label("Soil");
		GridPane.setConstraints(soil, 1, 2);
		Button remove = new Button("Remove from cart");
		GridPane.setConstraints(remove, 1, 3);
		cartgp.getChildren().addAll(sun, water, soil, remove);
		
		cartgp.setPadding(new Insets(5,5,5,5));
		this.cartItems.add(cartgp);
		
		cartVb.getChildren().add(cartgp);
		cart.setContent(cartVb);
		//LEFT
		
		
		
		//RIGHT
		
		
		//RIGHT
		

		BorderPane borderpane = new BorderPane();
		
		borderpane.setTop(menu);
		borderpane.setCenter(gardenGrid);
		borderpane.setLeft(cart);
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
