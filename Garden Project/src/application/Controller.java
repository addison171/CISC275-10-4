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
    
    @Override
    public void start(Stage primaryStage) {
      
    }
    
    public EventHandler insertObstructionClick() {
    	return event -> insertObstructionClicked((MouseEvent) event);
	}
    public void insertObstructionClicked(MouseEvent event) {
    
    }
	
    public EventHandler viewClick() {
    	return event -> viewClicked((MouseEvent) event);
	}
    public void viewClicked(MouseEvent event) {
    
    }
    
    public EventHandler inputDataClick() {
    	return event -> inputDataClicked((MouseEvent) event);
	}
    public void inputDataClicked(MouseEvent event) {
    
    }
    
    public EventHandler previewClick() {
    	return event -> previewClicked((MouseEvent) event);
	}
    public void previewClicked(MouseEvent event) {
    
    }
    
    public EventHandler editCellsClick() {
    	return event -> editCellsClicked((MouseEvent) event);
	}
    public void editCellsClicked(MouseEvent event) {
    
    }
    
    public EventHandler finalViewClick() {
    	return event -> finalViewClicked((MouseEvent) event);
	}
    public void finalViewClicked(MouseEvent event) {
    
    }
    
    public EventHandler saveAllClick() {
    	return event -> saveAllClicked((MouseEvent) event);
	}
    public void saveAllClicked(MouseEvent event) {
    
    }
}
