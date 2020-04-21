package application;

import java.util.ArrayList;

public class Filter {

	private ArrayList<Plant> plants;
	private String season;
	private String soil;
	private String lightLevel;
	private String water;
	
	public Filter(ArrayList<Plant> p,String seas, String soilType, String light, String waterLevel) {
		this.plants = p;
		this.season = seas;
		this.soil = soilType;
		this.lightLevel = light;
		this.water = waterLevel;
	}
	
	//Will compare all plants in ArrayList to chosen data and return a new ArrayList of plants
	//	only contining the plants that suit the data
	public ArrayList<Plant> search(ArrayList<Plant> plants){
		return plants;
	}

}
