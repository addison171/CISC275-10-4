/**
 * @author Addison Kuykendall
 */
package application;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class SearchAllView {

	ComboBox<String> sunCbx;
	ComboBox<String> waterCbx;
	ComboBox<String> soilCbx;
	ComboBox<String> bloomCbx;
	ComboBox<String> nativeCbx;
	ComboBox<String> filterCbx;
	
	BorderPane borderpane = new BorderPane();
	Scene scene = new Scene(borderpane);
	
	public SearchAllView() {
		
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
		cellFld.setPrefWidth(200);
		GridPane.setConstraints(cellFld, 1, 0);
		
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
		
		Label descLbl = new Label("Trying to make this description long enough so that it wraps....fja sklflfhda jfklhdkljfh djasklfhdja klf hjdklfhjaklfdhjaklfhjkdalfhjdklafhdjklahfjdklahfjdklsahfdjklfahjfdklahjfklashfjkldahfdklfhadjl");
		GridPane.setConstraints(descLbl, 0, 4);
		descLbl.setWrapText(true);
		descLbl.setPrefWidth(100);
		
	
		filterPane.getChildren().addAll(cellsLbl, cellFld, sunLbl, sunCbx, waterLbl, waterCbx, soilLbl, soilCbx, descLbl);
		//RIGHT

		//BORDERPANE
		BorderPane borderpane = new BorderPane();
		
		borderpane.setTop(menu);
		borderpane.setRight(filterPane);
		borderpane.setPadding(new Insets(10,10,10,10));
		
		this.scene.setRoot(borderpane);

		
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
