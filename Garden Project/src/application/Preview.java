/**
 * @author Sohan Gadiraju, Addison Kuykendall
 */
package application;

import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Preview {
	Controller control;
	ComboBox<String> timeOfDay;
	ComboBox<String> season;
	Button backToEdit;
	Group previewRoot = new Group();
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
		BorderPane bp;
		bp = new BorderPane();
		this.scene = new Scene(bp);
		
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
		
		//TOP
		HBox menu = new HBox();
		menu.setSpacing(5);
		//gardenGrid = control.gv.gardenGrid;
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
		bp.setTop(menu);
		bp.setRight(previewPane);
		bp.setCenter(gardenGrid);
		
		//scene = new Scene(bp);
		//this.scene.setRoot(bp);
		
		previewRoot.getChildren().add(bp);
	}

	//changes the season that the garden is being viewed in
	public void changeSeason() {
		
	}
	
	//updates the images of plants according to the season selected
	public void updatePlants() {
	}
	
	public void inputGarden(GridPane garden) {
		gardenGrid = garden;   
	}
}

