/**
 * @author Addison Kuykendall
 */
package application;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class View {
	Canvas canvas;
	Stage theStage;
	Scene theScene;
	Plant[][] plants;
	int canvasWidth = 1380;
	int canvasHeight = 940;
    GraphicsContext gc;
	
	/**
	 * 
	 * @param theStage primary stage being created for the view, an object of stage
	 */
	public View(Stage theStage) {
		theStage.setTitle("Garden");
		
		Group root = new Group();
		theScene = new Scene(root);
		theStage.setScene(theScene);
		
		Canvas canvas = new Canvas(canvasWidth, canvasHeight);
		root.getChildren().add(canvas);
		gc = canvas.getGraphicsContext2D();
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
