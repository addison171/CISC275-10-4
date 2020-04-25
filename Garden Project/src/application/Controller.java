/**
 * @author Nick Sabitini, Addison Kuykendall
 * #
 */
package application;
	
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
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
    	view = new View(primaryStage);
    	model = new Model(view.getWidth(), view.getHeight());
        primaryStage.show();
        view.test.setOnAction(insertObstructionClick());
    }
    
    /**
     * Clicking to create obstruction from button
     * @return returns event that the obstructions wants to be created from clicking the button
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
    	view.changeScene(InsertObstructionView.iovRoot);
    }
	
    /**
     * Eventhandlier for viewing the garden button being clicked
     * @return returns an event that the view button was clicked
     */
    public EventHandler<MouseEvent> viewClick() {
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
    public EventHandler<MouseEvent> inputDataClick() {
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
    public EventHandler<MouseEvent> previewClick() {
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
    public EventHandler<MouseEvent> editCellsClick() {
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
    public EventHandler<MouseEvent> finalViewClick() {
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
    public EventHandler<MouseEvent> saveAllClick() {
    	return event -> saveAllClicked((MouseEvent) event);
	}
    
    /**
     * Saved all progress after button click
     * @param event - event object that confirms the saveall button was clicked
     */
    public void saveAllClicked(MouseEvent event) {
    
    }
}
