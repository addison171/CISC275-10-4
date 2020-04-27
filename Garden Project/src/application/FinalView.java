/**
 * @author Addison Kuykendall, Jonni Tran
 */
package application;



import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class FinalView {
	Text scores;
	Text pros;
	Text cons;
	Button saveButton;
	Button editButton;
	Button newgardenButton;
	Group finalRoot = new Group();
	
	Button gardenViewBtn;
	Button inputDataBtn;
	Button previewBtn;
	Button editCellsBtn;
	Button searchBtn;
	Button finalViewBtn;
	Button saveBtn;
	Button searchPlants;
	GridPane gardenGrid;

	
	/**
	 * draws the screen
	 */
	
	public FinalView(){
		
		//TOP
		HBox menu = new HBox();
		menu.setSpacing(5);
		
		//garden view
		gardenViewBtn = new Button("Garden View");		
		
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
		
		menu.getChildren().addAll(inputDataBtn, gardenViewBtn ,previewBtn,editCellsBtn, searchBtn, finalViewBtn,saveBtn);
		//TOP
		
		GridPane gp1 = new GridPane();
		gp1.setPadding(new Insets(10,10,10,10));
		
		Text Pros = new Text("Pros: Plants well spaced			");
		Pros.setFont(Font.font ("Verdana", 20));
		GridPane.setConstraints(Pros, 0, 0);
		
		Text Cons = new Text("Cons: Little Variety");
		Cons.setFont(Font.font ("Verdana", 20));
		GridPane.setConstraints(Cons, 2, 0);
		
		Text space = new Text(" ");
		GridPane.setConstraints(space, 0, 1);

		Text grade = new Text("Overall Grade: C - Decent, but nothing special");
		GridPane.setConstraints(grade, 0, 3);
		grade.setFont(Font.font ("Verdana", 20));

		gp1.getChildren().addAll(Pros,Cons,grade, space);
		
		BorderPane finalviewBP = new BorderPane();

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
			
		finalviewBP.setBottom(gardenGrid);
				
		finalviewBP.setTop(menu);
		finalviewBP.setCenter(gp1);
		
		Scene finalScene = new Scene(finalviewBP);
		finalRoot.getChildren().add(finalviewBP);
		
	}
	
	
	
	
	public void draw() {
		
	}
}
