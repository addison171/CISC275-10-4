/**
 * @author Addison Kuykendall
 * #
 */
package application;
	
import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
 
public class Controller extends Application {
	private Model model;
	private View view;
	GardenView gv;
	private HomeView hv;
	private InputDataView idv;
	private InsertObstructionView iov;
	private Preview pv;
	private EditCellsView ecv;
	private SearchAllView searchv;
	private FinalView fv;
	
    public static void main(String[] args) {
        launch(args);
    }
    
    /**
     * Starts the program
     * @param primaryStage - stage from the view
     */
    @Override
    public void start(Stage primaryStage) {
    	view = new View(primaryStage);
    	model = new Model(view.getWidth(), view.getHeight());
    	model.allPlants = model.readPlantsFromCSV("PlantData.csv");
    	this.hv = new HomeView();
    	hv.createNew.setOnAction(inputDataClick());    	
    	
        this.gv = new GardenView();
		gv.inputDataBtn.setOnAction(inputDataClick());
		gv.editCellsBtn.setOnAction(editCellsClick());
		gv.finalViewBtn.setOnAction(finalViewClick());
		gv.previewBtn.setOnAction(previewClick());
		gv.searchBtn.setOnAction(searchClick());
		
		//gv.gardenGrid 
    	this.pv = new Preview();
		pv.inputGarden(gv.gardenGrid);

    	pv.inputDataBtn.setOnAction(inputDataClick());
    	pv.editCellsBtn.setOnAction(editCellsClick());
    	pv.finalViewBtn.setOnAction(finalViewClick());
    	pv.previewBtn.setOnAction(previewClick());
		pv.searchBtn.setOnAction(searchClick());
		pv.saveBtn.setOnAction(saveAllClick());
		pv.gardenView.setOnAction(gardenViewClick());

        
        this.idv = new InputDataView();        
		idv.inputDataBtn.setOnAction(inputDataClick());
		idv.editCellsBtn.setOnAction(editCellsClick());
		idv.finalViewBtn.setOnAction(finalViewClick());
		idv.previewBtn.setOnAction(previewClick());
		idv.searchBtn.setOnAction(searchClick());
		idv.saveBtn.setOnAction(saveAllClick());
		idv.saveDataBtn.setOnAction(saveAllClick());
		idv.createPlot.setOnAction(createPlotClick());
		idv.gardenViewBtn.setOnAction(gardenViewClick());

        this.searchv = new SearchAllView(this);
        primaryStage.setScene(searchv.scene);
        
    	primaryStage.setScene(hv.scene);


		searchv.inputDataBtn.setOnAction(inputDataClick());
		searchv.editCellsBtn.setOnAction(editCellsClick());
		searchv.finalViewBtn.setOnAction(finalViewClick());
		searchv.previewBtn.setOnAction(previewClick());
		searchv.searchBtn.setOnAction(searchClick());
        searchv.searchPlantsBtn.setOnAction(searchPlantsClick());
        
        this.ecv = new EditCellsView();
        ecv.saveDataBtn.setOnAction(SelectCellsClick());
        
		ecv.inputDataBtn.setOnAction(inputDataClick());
		ecv.editCellsBtn.setOnAction(editCellsClick());
		ecv.finalViewBtn.setOnAction(finalViewClick());
		ecv.previewBtn.setOnAction(previewClick());
		ecv.searchBtn.setOnAction(searchClick());
        
		searchv.inputDataBtn.setOnAction(inputDataClick());
		searchv.editCellsBtn.setOnAction(editCellsClick());
		searchv.finalViewBtn.setOnAction(finalViewClick());
		searchv.previewBtn.setOnAction(previewClick());
		searchv.searchBtn.setOnAction(searchClick());
        searchv.searchPlantsBtn.setOnAction(searchPlantsClick());

        view.importImages(model.allPlants);
		
		primaryStage.show();
    }
    
    public EventHandler<ActionEvent> SelectCellsClick(){
    	return event -> SelectCellsClicked();
    }
    
    public void SelectCellsClicked() {
    	String coordinates = ecv.cellFld.getText();
    	String[] splitC = coordinates.split(",");
    	int x1 = Integer.parseInt(splitC[0]);
    	int y1 = Integer.parseInt(splitC[1]);
    	int x2 = Integer.parseInt(splitC[2]);
    	int y2 = Integer.parseInt(splitC[3]);
    	model.editCells(model.cells, x1, y1, x2, y2, ecv.soilCbx.getValue(), ecv.waterCbx.getValue(), ecv.sunCbx.getValue());
    	System.out.println(model.cells[1][1].getSoil());
    }
    
    public EventHandler<ActionEvent> gardenViewClick(){
    	return event ->gardenViewClicked();
    }
    
    public void gardenViewClicked() {
    	view.changeScene(gv.gardenRoot);
    }
    
    public EventHandler<ActionEvent> createPlotClick(){
    	return event ->createPlotClicked();
    }
    
    public void createPlotClicked() {
    	String tx = idv.x.getText();
    	String ty = idv.y.getText();
    	int x = Integer.parseInt(tx);
    	int y = Integer.parseInt(ty);
    	model.cells = new Cell[x][y];
    }
    
    public EventHandler<ActionEvent> newClick(){
    	return event -> newClicked();
    }
    
    public void newClicked() {
    	view.changeScene(gv.gardenRoot);
    }
    
    /**
     * Clicking to search all 
     * @return returns event that the search goes to when clicked
     */
    
    public EventHandler<ActionEvent> searchClick() {
    	return event -> searchClicked();
	}
    
    
    /**
     * Transition to search UI
     * 
     */
    public void searchClicked() {
    	view.changeScene(searchv.searchRoot);
    }
    
    /**
     * Clicking to insert obstructions
     * @return returns event that leads to obstructions
     */
    public EventHandler<ActionEvent> insertObstructionClick() {
    	return event -> insertObstructionClicked();
	}
    
    
    /**
     * Transition to insert obstruction ui after button clicked
     * @param event - event object from the insert obstruction button being clicked
     */
    public void insertObstructionClicked() {
    	InsertObstructionView.update();
    	//view.changeScene(InsertObstructionView.iovRoot);
    }
	
    /**
     * Eventhandlier for viewing the garden button being clicked
     * @return returns an event that the view button was clicked
     */
    public EventHandler<ActionEvent> viewClick() {
    	return event -> viewClicked();
	}
    
    /**
     * Transition to the view garden ui
     * @param event - event object from view button being clicked
     */
    public void viewClicked() {
    	//view.changeScene(FinalView.finalRoot);
    }
    
    /**
     * Eventhandler for input data button being clicked
     * @return returns event object from clicking input data button
     */
    public EventHandler<ActionEvent> inputDataClick() {
    	return event -> inputDataClicked();
	}		

    
    /**
     * Transition to input data screen from button click
     * @param event - event object from input data button being clicked
     */
    public void inputDataClicked() {
    	view.changeScene(idv.inputDataRoot);
    }
    
    /**
     * The preview button being clicked
     * @return returns event object that preview button was selected
     */
    public EventHandler<ActionEvent> previewClick() {
    	return event -> previewClicked();
	}
    
    /**
     * Preview button transition
     * @param event - event object for the preview button being clicked
     */
    public void previewClicked() {
    	view.changeScene(pv.previewRoot);
    }
    
    /**
     * The edit cell button being clicked
     * @return return event object for the edit cells button being clicked
     */
    public EventHandler<ActionEvent> editCellsClick() {
    	return event -> editCellsClicked();
	}
    
    /**
     * Transition to edit cells ui from the button being clicked
     * @param event - event object confirming the editcells button was clicked
     */
    public void editCellsClicked() {
    	view.changeScene(ecv.editCellsRoot);
    }
    
    /**
     * The final view button being clicked
     * @return returns object that finalview button was clicked
     */
    public EventHandler<ActionEvent> finalViewClick() {
    	return event -> finalViewClicked();
	}
    
    /**
     * View transition to final view screen
     * @param event - event object confirming the finalview button was clicked
     */
    public void finalViewClicked() {
    	view.changeScene(FinalView.finalRoot);
    }
    
    /**
     * The save all button being clicked
     * @return returns events object that saveall button was clicked
     */
    public EventHandler<ActionEvent> saveAllClick() {
    	return event -> saveAllClicked();
	}
    
    /**
     * Saved all progress after button click
     * @param event - event object that confirms the saveall button was clicked
     */
    public void saveAllClicked() {
    	
    	model.soilType = idv.soilCbx.getValue();
    	model.sunLight = idv.sunCbx.getValue();
    	model.waterLevel = idv.waterCbx.getValue();
    	model.cells = model.inputData();    	
    }

    /**
     * Calls the search plant clicked function when the button is clicked
     * @return The function that should happen
     */
    public EventHandler<ActionEvent> searchPlantsClick() {
    	return event -> searchPlantsClicked();
    }
    /**
     * event handler for what should happen when searchPlants is clicked
     */
    public void searchPlantsClicked() {
    	System.out.println("Search Plants Clicked");
    	model.f = new Filter(searchv.bloomCbx.getValue().toString(), searchv.soilCbx.getValue().toString(), 
    						 searchv.sunCbx.getValue().toString(), searchv.waterCbx.getValue().toString());
    	ArrayList<Plant> filteredPlants = model.f.search(model.allPlants);
    	
    	for (Plant p : filteredPlants) {
    		System.out.println(p.getName());
    	}
    	
    	for (Plant p : model.allPlants) {
    		System.out.println(p.getName());
    	}

    	
    	this.searchv.displayResults(filteredPlants);
    }
    
    public EventHandler<MouseEvent> getAddToCartBtnHandler(){
    	return event -> addToCartBtnClicked(event);
    }
    
    public void addToCartBtnClicked(MouseEvent e) {
    	System.out.println("Add to cart button clicked");
    	Button thisBtn = (Button)e.getSource();
    	System.out.println(thisBtn.getId() + "jfdsafdhjkfahdjfkla");
    	
    	this.model.cartPlants.add(this.model.plantMap.get(thisBtn.getId()));
    	this.searchv.displayCart(model.cartPlants);
    }
    
}
