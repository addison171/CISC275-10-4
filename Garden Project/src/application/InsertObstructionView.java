/**
 * @author Addison Kuykendall
 */
package application;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.Group;
import javafx.scene.control.*;

import javafx.scene.image.Image;
import javafx.stage.Stage;

public class InsertObstructionView {
	Image circle;
	Image rectangle;
	ComboBox shapes;
	TextArea label;
	static Button add = new Button("add");
	static Group iovRoot = new Group();

	
	//updates the view according to what inputs have been changed
	static public void update() {
	    iovRoot.getChildren().add(add);
	    add.setTranslateY(.5*940);
	}
	/**
	 * creates an image on the scene of some shape
	 * @param shape the shape of the obstruction the insert obstruction button will create
	 */
	public void generateShape(Image shape) {
		
		
	}
	
}

