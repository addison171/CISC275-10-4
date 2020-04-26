/**
 * @author Addison Kuykendall
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
    	
    	this.hv = new HomeView();
    	primaryStage.setScene(hv.scene);
    	        
        this.gv = new GardenView();
        primaryStage.setScene(gv.scene);
        
        this.idv = new InputDataView();
        primaryStage.setScene(idv.scene);
        
        idv.searchBtn.setOnAction(searchClick());

        this.searchv = new SearchAllView();
        primaryStage.setScene(searchv.scene);
        
		searchv.inputDataBtn.setOnAction(inputDataClick());
		searchv.editCellsBtn.setOnAction(editCellsClick());
		searchv.finalViewBtn.setOnAction(finalViewClick());
		searchv.previewBtn.setOnAction(previewClick());
		searchv.searchBtn.setOnAction(searchClick());

		primaryStage.show();
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
    	view.changeScene(SearchAllView.borderpane);
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
    	view.changeScene(InputDataView.inputDataRoot);
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
    	//view.changeScene(Preview.previewRoot);
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
    	//view.changeScene(EditCellsView.editCellsRoot);
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
    	//view.changeScene(FinalView.finalRoot);
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
    
    }
}
