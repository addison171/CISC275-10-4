package application;

public class Obstruction {
	private String name;
	private String shape;
	
	/**
	 * Setter for the soil in the cell
	 * @param label - String for the name of the Obstruction
	 */
	public void setName(String label) {
		name = label; 
	}
	
	/**
	 * Getter for the name type
	 * @return returns the name type string
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter for the shape.
	 * @param shapeLevel - String for the chosen shape of the Obstruction
	 */
	public void setshape(String s) {
		shape = s; 
	}
	
	/**
	 * Getter for the shape
	 * @return returns the shape string of the Obstruction
	 */
	public String getshape() {
		return shape;
	}	
	
}
