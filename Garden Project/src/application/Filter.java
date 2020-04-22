/**
 * @author Jonni Tran
 */

package application;

import java.util.ArrayList;

public class Filter {

	private ArrayList<Plant> plants;
	private String season;
	private String soil;
	private String lightLevel;
	private String water;
	/**
	 * @param p 			arraylist of all plant objects data such as trees, flowers, bushes, 
	 * @param seas 			String to specify the season a plant grows in when filtering through plants
	 * @param soilType 		String specifying the soil type of a plant when using filter
	 * @param light 		String to specify the light level of plants when using filter
	 * @param waterLevel 	String to specify the water level a plant needs when using the filter
	 */
	public Filter(ArrayList<Plant> p,String seas, String soilType, String light, String waterLevel) {
		this.plants = p;
		this.season = seas;
		this.soil = soilType;
		this.lightLevel = light;
		this.water = waterLevel;
	}
	
	
	/**
	 * Will compare all plants in ArrayList to chosen data and return a new ArrayList of plants
		only containing the plants that suit the data
	 * @param plants the arraylist that contains all the plant data
	 * @return the plant object the filter sifts for.
	 */
	public ArrayList<Plant> search(ArrayList<Plant> plants){
		return plants;
	}

}
