/**
 * @author Addison Kuykendall
 */
package application;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.util.ArrayList;

public class View {
	Controller control;
	Canvas canvas;
	Stage theStage;
	Scene theScene;
	Plant[][] plants;
	int canvasWidth = 1350;
	int canvasHeight = 950;
    GraphicsContext gc;
    public Button test;
    Image[] plantImages;
	
	/**
	 * 
	 * @param theStage primary stage being created for the view, an object of stage
	 */
	public View(Stage aStage) {
		theStage = aStage;
		theStage.setTitle("Garden");
		
		Group root = new Group();
		theScene = new Scene(root);
		theStage.setScene(theScene);
		
		Canvas canvas = new Canvas(canvasWidth, canvasHeight);
		root.getChildren().add(canvas);
		gc = canvas.getGraphicsContext2D();

	}
	/**
	 * Creates array of Images filled with images of plants
	 * @param plants - an arraylist of plants
	 */
	public void importImages(ArrayList<Plant> plants) {
		plantImages= new Image[plants.size()];
        // Eclipse will look for <path/to/project>/bin/<relative path specified>
        String img_name = "images/";
        String ext = ".png";
        for(int i= 0; i<plants.size();i++) {
			plantImages[i]=createImage(img_name + plants.get(i).getName() + ext);
		}
       
	}
	/**
	 * Switches screens
	 * @param n - the new root. Usually a group
	 */
	public void changeScene(Parent n) {
		theStage.getScene().setRoot(n);
		//theStage.setScene(n);
	}
	/**
	 * Displays the image (usually to display plants)
	 * @param img - image to be displayed
	 */
	public Image createImage(String img) {
		Image image = new Image(img);
		return image;
	}
	/**
	 * Adds a button 
	 * @param b - button being added
	 */
	public void addButton(Button b) {
		
	}
	public int getWidth() {
		return canvasWidth;
	}
	
	public int getHeight() {
		return canvasHeight;
	}
}
