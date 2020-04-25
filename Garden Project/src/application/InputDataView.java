/**
 * @author Sohan Gadiraju
 */
package application;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.text.Text;

public class InputDataView {
	ComboBox<String> sunLightLevel;
	ComboBox<String> waterLevel;
	Text plotSize;
	ComboBox<String> soilType;
	Button addData;
	static Group inputDataRoot = new Group();

	
	/**
	 * goes back to the garden view with the settings updated according to the selections.
	 */
	public void view() {
		
	}
}
