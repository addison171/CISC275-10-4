package application;

	/**
	 * @author addison Kuykendall
	 */
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
		Group saveAsRoot = new Group();
		BorderPane borderpane;
		Scene scene;
		GridPane gp1;
		
		TextField newCellFld;
		
		Button openBtn;
		Button saveAsBtn;
		
		/**
		 * Save as view. Has a button for opening new vs existing file
		 */
		public SaveAsView() {
			borderpane = new BorderPane();
			this.scene = new Scene(borderpane);
			
			openBtn = new Button("Open Existing Project");
			saveAsBtn = new Button("Save New Project As");
			
			gp1 = new GridPane();
			
			newCellFld = new TextField();
			newCellFld.setPromptText("Name of New File");
			GridPane.setConstraints(newCellFld, 0, 0);
			TextField existingCellFld = new TextField();
			existingCellFld.setPromptText("Name of Existing File");
			GridPane.setConstraints(existingCellFld, 0, 3);
			
			Text space = new Text(" ");
			GridPane.setConstraints(space, 0, 1);
			
			GridPane.setConstraints(openBtn, 1,3);
			
			GridPane.setConstraints(saveAsBtn, 1, 0);

			gp1.getChildren().addAll(newCellFld, existingCellFld, space, openBtn, saveAsBtn);
			
			BorderPane borderpane = new BorderPane();
						
			borderpane.setCenter(gp1);
						
			this.scene.setRoot(borderpane);
			
			saveAsRoot.getChildren().add(borderpane);
			
			
		}

	}
