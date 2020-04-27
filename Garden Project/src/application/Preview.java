/**
 * @author Nick Sabitini
 */
package application;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Preview {
	Controller control;
	ComboBox<String> timeOfDay;
	ComboBox<String> season;
	Button backToEdit;
	static Group previewRoot = new Group();
	BorderPane borderpane;
	Scene scene;
	
	Button inputDataBtn;
	Button previewBtn;
	Button editCellsBtn;
	Button searchBtn;
	Button finalViewBtn;
	Button saveBtn;
	Button searchPlants;
	GridPane gardenGrid;

	public Preview() {
		this.borderpane = new BorderPane();
		this.scene = new Scene(borderpane);

		
		//TOP
		HBox menu = new HBox();
		menu.setSpacing(5);
		gardenGrid =control.gv.gardenGrid;
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
		
		GridPane previewPane = new GridPane();
		//Time of Day
		Label timeOfDayLbl = new Label("Time Of Day");
		GridPane.setConstraints(timeOfDayLbl, 0, 1);
		
		timeOfDay = new ComboBox<String>();
		GridPane.setConstraints(timeOfDay, 1, 1);
		timeOfDay.getItems().addAll(
				"Morning",
				"Afternoon",
				"Night"
		);

		//Season
		Label seasonLbl = new Label("Season Level");
		GridPane.setConstraints(seasonLbl, 0, 2);
		
		season = new ComboBox<String>();
		GridPane.setConstraints(season, 1, 2);
		season.getItems().addAll(
				"Spring",
				"Summer",
				"Fall",
				"Winter"
		);
		previewPane.getChildren().addAll(timeOfDayLbl, seasonLbl, timeOfDay, season);
		borderpane.setTop(menu);
		borderpane.setRight(previewPane);
		borderpane.setCenter(gardenGrid);
		
		scene = new Scene(borderpane);
		this.scene.setRoot(borderpane);
		
		previewRoot.getChildren().add(borderpane);
	}

	//changes the season that the garden is being viewed in
	public void changeSeason() {
		
	}
	
	//updates the images of plants according to the season selected
	public void updatePlants() {
	}
}

