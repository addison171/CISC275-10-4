/**
 * @author Nick Sabitini
 */
package application;
	
import javafx.application.Application;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
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
	
    public static void main(String[] args) {
        launch(args);
    }
    
    /**
     * Starts the program
     * @param primaryStage - stage from the view
     */
    @Override
    public void start(Stage primaryStage) {
      
    }
    
    /**
     * Clicking to create obstruction from button
     * @return returns event that the obstructions wants to be created from clicking the button
     */
    public EventHandler insertObstructionClick() {
    	return event -> insertObstructionClicked((MouseEvent) event);
	}
    
    /**
     * Transition to insert obstruction ui after button clicked
     * @param event - event object from the insert obstruction button being clicked
     */
    public void insertObstructionClicked(MouseEvent event) {
    
    }
	
    /**
     * Eventhandlier for viewing the garden button being clicked
     * @return returns an event that the view button was clicked
     */
    public EventHandler viewClick() {
    	return event -> viewClicked((MouseEvent) event);
	}
    
    /**
     * Transition to the view garden ui
     * @param event - event object from view button being clicked
     */
    public void viewClicked(MouseEvent event) {
    
    }
    
    /**
     * Eventhandler for input data button being clicked
     * @return returns event object from clicking input data button
     */
    public EventHandler inputDataClick() {
    	return event -> inputDataClicked((MouseEvent) event);
	}
    
    /**
     * Transition to input data screen from button click
     * @param event - event object from input data button being clicked
     */
    public void inputDataClicked(MouseEvent event) {
    
    }
    
    /**
     * The preview button being clicked
     * @return returns event object that preview button was selected
     */
    public EventHandler previewClick() {
    	return event -> previewClicked((MouseEvent) event);
	}
    
    /**
     * Preview button transition
     * @param event - event object for the preview button being clicked
     */
    public void previewClicked(MouseEvent event) {
    
    }
    
    /**
     * The edit cell button being clicked
     * @return return event object for the edit cells button being clicked
     */
    public EventHandler editCellsClick() {
    	return event -> editCellsClicked((MouseEvent) event);
	}
    
    /**
     * Transition to edit cells ui from the button being clicked
     * @param event - event object confirming the editcells button was clicked
     */
    public void editCellsClicked(MouseEvent event) {
    
    }
    
    /**
     * The final view button being clicked
     * @return returns object that finalview button was clicked
     */
    public EventHandler finalViewClick() {
    	return event -> finalViewClicked((MouseEvent) event);
	}
    
    /**
     * View transition to final view screen
     * @param event - event object confirming the finalview button was clicked
     */
    public void finalViewClicked(MouseEvent event) {
    
    }
    
    /**
     * The save all button being clicked
     * @return returns events object that saveall button was clicked
     */
    public EventHandler saveAllClick() {
    	return event -> saveAllClicked((MouseEvent) event);
	}
    
    /**
     * Saved all progress after button click
     * @param event - event object that confirms the saveall button was clicked
     */
    public void saveAllClicked(MouseEvent event) {
    
    }
}
