/**
 * @author Sohan Gadiraju
 */
package application;

import javafx.scene.image.Image;

class Plant {
	private String name;
	private String idealSoil;
	private String idealWaterLevel;
	private String idealSunlightLevel;
	private String bloomTime;
	private Image[] stagesOfPlant;	
	/**
	 * 
	 * @param n String for the name of plant
	 * @param soil String for the plant's soil
	 * @param sun String for the plants sun level needed
	 * @param water string for the water level the plant needs
	 * @param bloom string of the bloom time of the plant
	 */
	public Plant(String n, String soil,String sun, String water, String bloom){
		this.name = n;
		this.idealSoil = soil;
		this.idealSunlightLevel = sun;
		this.idealWaterLevel = water;
		this.bloomTime = bloom;
		
	}
	
	
	 /**
	  * Setter for name string
	  * @param newName the name of the plant to set
	  */
	public void setName(String newName) {
		    this.name = newName;
	}
	/**
	 * getter for name string
	 * @return returns the string for name
	 */
	public String getName() {
	    return this.name;
	}
	/**
	 * setter for the soil string
	 * @param soil - the soil of the plant
	 */
	public void setSoil(String soil) {
	    this.idealSoil = soil;
	}
	
	/**
	 * getter for the soil string
	 * @return returns the string for the soil type of the plant
	 */
	public String getSoil() {
	    return this.idealSoil;
	}
	/**
	 * Setter for the water string
	 * @param water - the water level string of the plant
	 */
	public void setWater(String water) {
	    this.idealWaterLevel = water;
	}

	/**
	 * getter for water string
	 * @return returns the string for the ideal water level the plant needs
	 */
	public String getWater() {
	    return this.idealWaterLevel;
	}
	
	public void setSunlight(String sun) {
	    this.idealSunlightLevel = sun;
	}

	/**
	 * Getter for sunlight level
	 * @return returns the sunlight level of a plant.
	 */
	public String getSunlight() {
	    return this.idealSunlightLevel;
	}

}


