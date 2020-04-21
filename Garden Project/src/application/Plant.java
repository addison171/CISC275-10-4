package application;

import javafx.scene.image.Image;

class Plant {
	private String name;
	private String idealSoil;
	private String idealWaterLevel;
	private String idealSunlightLevel;
	private String bloomTime;
	private Image[] stagesOfPlant;
	
	public Plant(String n, String soil,String sun, String water, String bloom){
		this.name = n;
		this.idealSoil = soil;
		this.idealSunlightLevel = sun;
		this.idealWaterLevel = water;
		this.bloomTime = bloom;
		
	}
	
	
	  // Setter
	public void setName(String newName) {
		    this.name = newName;
	}
	
	public String getName() {
	    return this.name;
	}

	public void setSoil(String soil) {
	    this.idealSoil = soil;
	}
	
	public String getSoil() {
	    return this.idealSoil;
	}
	
	public void setWater(String water) {
	    this.idealWaterLevel = water;
	}
	
	public String getWater() {
	    return this.idealWaterLevel;
	}
	
	public void setBloom(String bloom) {
	    this.bloomTime = bloom;
	}
	
	public String setBloom() {
	    return this.bloomTime;
	}
	
	public void setNonBloom(Image nonBloom) {
	    this.stagesOfPlant[0] = nonBloom;
	}
	
	public Image getNonBloom() {
	    return this.stagesOfPlant[0];
	}
	
	public void setBloom(Image bloom) {
	    this.stagesOfPlant[1] = bloom;
	}
	
	public Image getBloom() {
	    return this.stagesOfPlant[1];
	}
	
	public void setSunlight(String sun) {
	    this.idealSunlightLevel = sun;
	}
	
	public String getSunlight() {
	    return this.idealSunlightLevel;
	}

}


