/**
 * @author Nick Sabitini
 */
package application;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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

	public Preview() {
		this.borderpane = new BorderPane();
		this.scene = new Scene(borderpane);
		GridPane gardenGrid = control.gv.gardenGrid;
		
		//TOP
		HBox menu = new HBox();
		menu.setSpacing(2);
		
		//Time of Day
		timeOfDay = new ComboBox<String>();
		GridPane.setConstraints(timeOfDay, 1, 1);
		timeOfDay.getItems().addAll(
				"Morning",
				"Afternoon",
				"Night"
		);

		//Season
		season = new ComboBox<String>();
		GridPane.setConstraints(season, 1, 1);
		season.getItems().addAll(
				"Spring",
				"Summer",
				"Fall",
				"Winter"
		);
		menu.getChildren().addAll(timeOfDay, season);
		borderpane.setTop(menu);
		borderpane.setCenter(gardenGrid);
		
		this.scene.setRoot(borderpane);
		
		previewRoot.getChildren().add(borderpane);
	}
	//shows the preview of the garden to the user
	public void display() {
	}

	//changes the season that the garden is being viewed in
	public void changeSeason() {
	}
	
	//updates the images of plants according to the season selected
	public void updatePlants() {
	}
}

