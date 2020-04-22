/**
 * @author Addison Kuykendall
 */
package application;

public class Cell {
	private String soil;
	private String water;
	private String sunlight;
	private Plant plant; 
	private boolean obstruction;
	
	/**
	 * Setter for the soil in the cell
	 * @param soilType - String for the soil type of cell
	 */
	public void setSoil(String soilType) {
		soil = soilType; 
	}
	
	/**
	 * Getter for the soil type
	 * @return returns the soil type string
	 */
	public String getSoil() {
		return soil;
	}
	
	/**
	 * Setter for the water level.
	 * @param waterLevel - String for the water level of the cell
	 */
	public void setWater(String waterLevel) {
		water = waterLevel; 
	}
	
	/**
	 * Getter for the water level
	 * @return returns the water level string of the cell
	 */
	public String getWater() {
		return water;
	}	
	
	/**
	 * Setter for the sunlight level of a cell
	 * @param sunLevel - String for the sunlight level of a cell
	 */
	public void setSunlight(String sunLevel) {
		sunlight = sunLevel; 
	}
	
	/**
	 * Getter for the sunlight level of a cell
	 * @return returns the cells sunlight level
	 */
	public String getSun() {
		return sunlight;
	}
	
	/**
	 * Setter to create a new plant in a cell
	 * @param newPlant - the new plant to be inserted in the cell
	 */
	public void setPlant(Plant newPlant) {
		plant = newPlant;
	}
	
	/**
	 * Getter for the new plant
	 * @return returns the plant object that was inserted in the cell
	 */
	public Plant getPlant() {
		return plant;
	}
	
	/**
	 * Setter for obstruction in a cell
	 * @param obs - condition of whether or not the cell contains an obstruction
	 */
	public void setObstruction(boolean obs) {
		obstruction = obs;
	}
	
	/**
	 * Getter for obstruction in a cell
	 * @return returns whether or not cell contains an obstruction
	 */
	public boolean getObstruction() {
		return obstruction;
	}
}