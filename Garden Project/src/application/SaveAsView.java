/**
 * @author addison Kuykendall
 */
package application;
import javafx.scene.Node;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class SaveAsView {
	static Group saveAsRoot = new Group();
	BorderPane borderpane;
	Scene scene;
	
	Button openBtn;
	Button saveAsBtn;
	
	
	public SaveAsView() {
		this.borderpane = new BorderPane();
		this.scene = new Scene(borderpane);
		
		openBtn = new Button("Open Existing Project");
		saveAsBtn = new Button("Save New Project As");
		
		TextField newCellFld = new TextField();
		newCellFld.setPromptText("Name of New File");
		TextField existingCellFld = new TextField();
		newCellFld.setPromptText("Name of Existing File");
		
		GridPane menu = new GridPane();
		menu.setPadding(new Insets(10,10,10,10));
		menu.setVgap(10);
		menu.setHgap(10);
		
		//GridPane.setConstraints(arg0, arg1, arg2);
		menu.getChildren().addAll(openBtn, saveAsBtn);
		
		
	}

}
