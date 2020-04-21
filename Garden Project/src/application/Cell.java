package application;

public class Cell {
	private String soil;
	private String water;
	private String sunlight;
	private Plant plant; 
	private boolean obstruction;
	
	public void setSoil(String soilType) {
		soil = soilType; 
	}
	public String getSoil() {
		return soil;
	}
	public void setWater(String waterLevel) {
		water = waterLevel; 
	}
	public String getWater() {
		return water;
	}	
	public void setSunlight(String sunLevel) {
		sunlight = sunLevel; 
	}
	public String getSun() {
		return sunlight;
	}
	public void setPlant(Plant newPlant) {
		plant = newPlant;
	}
	public Plant getPlant() {
		return plant;
	}
	public void setObstruction(boolean obs) {
		obstruction = obs;
	}
	public boolean getObstruction() {
		return obstruction;
	}
}