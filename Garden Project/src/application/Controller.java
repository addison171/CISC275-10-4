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
	private GardenView gv;
	private HomeView hv;
	private InputDataView idv;
	private InsertObstructionView iov;
	private Preview pv;
	private EditCellsView ecv;
	private SearchAllView searchv;
	private FinalView fv;
	private SaveAsView sav;
	String name;
	
    public static void main(String[] args) {
        launch(args);
    }
    
    /**
     * Starts the program. Instaniates each view so the program can switch screens.
     * Sets all the buttons to the associate button handlers.
     * @param primaryStage - stage from the view
     */
    @Override
    public void start(Stage primaryStage) {
    	view = new View(primaryStage);
    	model = new Model(view.getWidth(), view.getHeight());
    	model.allPlants = model.readPlantsFromCSV("PlantData.csv");
    	//The home view
    	this.hv = new HomeView();
    	hv.createNew.setOnAction(saveAsClick());   
    	
    	primaryStage.setScene(hv.scene);
    	
    	iov = new InsertObstructionView();
    	iov.inputDataBtn.setOnAction(inputDataClick());
    	iov.editCellsBtn.setOnAction(editCellsClick());
    	iov.finalViewBtn.setOnAction(finalViewClick());
    	iov.previewBtn.setOnAction(previewClick());
    	iov.searchBtn.setOnAction(searchClick());
    	iov.saveBtn.setOnAction(saveAllClick());
    	iov.gardenViewBtn.setOnAction(gardenViewClick());
    	
    	//The SaveAsView
    	sav = new SaveAsView();
    	sav.openBtn.setOnAction(openExistingClick());
    	sav.saveAsBtn.setOnAction(openNewClick());
    	
    	//The garden View
        this.gv = new GardenView();
		gv.inputDataBtn.setOnAction(inputDataClick());
		gv.editCellsBtn.setOnAction(editCellsClick());
		gv.finalViewBtn.setOnAction(finalViewClick());
		gv.previewBtn.setOnAction(previewClick());
		gv.searchBtn.setOnAction(searchClick());
		gv.insertObstruction.setOnAction(insertObstructionClick());
		
		//The preview View
    	this.pv = new Preview();
		pv.inputGarden(gv.gardenGrid);

    	pv.inputDataBtn.setOnAction(inputDataClick());
    	pv.editCellsBtn.setOnAction(editCellsClick());
    	pv.finalViewBtn.setOnAction(finalViewClick());
    	pv.previewBtn.setOnAction(previewClick());
		pv.searchBtn.setOnAction(searchClick());
		pv.saveBtn.setOnAction(saveAllClick());
		pv.gardenView.setOnAction(gardenViewClick());
		pv.insertObstruction.setOnAction(insertObstructionClick());

        //The InputDataView
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
		idv.insertObstruction.setOnAction(insertObstructionClick());

		//The search view
        this.searchv = new SearchAllView(this);
		searchv.inputDataBtn.setOnAction(inputDataClick());
		searchv.editCellsBtn.setOnAction(editCellsClick());
		searchv.finalViewBtn.setOnAction(finalViewClick());
		searchv.previewBtn.setOnAction(previewClick());
		searchv.searchBtn.setOnAction(searchClick());
        searchv.searchPlantsBtn.setOnAction(searchPlantsClick());
		searchv.gardenViewBtn.setOnAction(gardenViewClick());
		searchv.insertObstruction.setOnAction(insertObstructionClick());

        //The Edit cells view
        this.ecv = new EditCellsView();
        ecv.saveDataBtn.setOnAction(SelectCellsClick());
		ecv.inputDataBtn.setOnAction(inputDataClick());
		ecv.editCellsBtn.setOnAction(editCellsClick());
		ecv.finalViewBtn.setOnAction(finalViewClick());
		ecv.previewBtn.setOnAction(previewClick());
		ecv.searchBtn.setOnAction(searchClick());
		ecv.gardenViewBtn.setOnAction(gardenViewClick());
		ecv.insertObstruction.setOnAction(insertObstructionClick());

		//The final view
		this.fv = new FinalView();
		fv.editCellsBtn.setOnAction(editCellsClick());
		fv.finalViewBtn.setOnAction(finalViewClick());
		fv.previewBtn.setOnAction(previewClick());
		fv.searchBtn.setOnAction(searchClick());
		fv.saveBtn.setOnAction(saveAllClick());
		fv.gardenViewBtn.setOnAction(gardenViewClick());
		fv.inputDataBtn.setOnAction(inputDataClick());
		fv.insertObstruction.setOnAction(insertObstructionClick());

		
		//Importing the plant images
        view.importImages(model.allPlants);
		
		primaryStage.show();
    }
    
    /**
     * Event handler for opening a new garden
     * @return the method called
     */
    public EventHandler<ActionEvent> openNewClick(){
    	name = sav.newCellFld.getText();
    	return event ->openNewClicked();
    }

    public void openNewClicked() {
    	view.changeScene(idv.inputDataRoot);
    }
    
    /**
     * Event handler for opening an existing garden
     * @return The method called
     */
    public EventHandler<ActionEvent> openExistingClick(){
    	return event ->openExistingClicked();
    }
    
    public void openExistingClicked() {
    	model.open();
    	//view.changeScene(idv.inputDataRoot);
    }
    
    /**
     * Event handler for going from the home screen to opening a project
     * @return the method called
     */
    public EventHandler<ActionEvent> saveAsClick(){
    	return event ->saveAsClicked();
    }
    
    public void saveAsClicked() {
    	view.changeScene(sav.saveAsRoot);
    }
    
    /**
     * Handler for when the user inputs cells that they would like to change the information
     * @return the Method called
     */
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
    
    
    /**
     * Handler to move to the garden view
     * @return The method called
     */
    public EventHandler<ActionEvent> gardenViewClick(){
    	return event ->gardenViewClicked();
    }
    
    public void gardenViewClicked() {
    	view.changeScene(gv.gardenRoot);
    }
    
    
    /**
     * Handler for when the user inputs the size of the plot
     * @return The method called
     */
    public EventHandler<ActionEvent> createPlotClick(){
    	return event ->createPlotClicked();
    }
    
    public void createPlotClicked() {
    	String tx = idv.x.getText();
    	String ty = idv.y.getText();
    	model.plotX = Integer.parseInt(tx);
    	model.plotY = Integer.parseInt(ty);
    	model.cells = new Cell[model.plotX][model.plotY];
    	idv.displayPlot(model.plotX, model.plotY);
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
    	view.changeScene(iov.iovRoot);
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
    	view.changeScene(fv.finalRoot);
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
    	view.changeScene(fv.finalRoot);
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
    	//model.saveAll();
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
    /**
     * Event handler for when plants are added to the cart
     * @return the method called
     */
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
