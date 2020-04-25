/**
 * @author Sohan Gadiraju
 */
package application;

import java.util.ArrayList;
import java.io.Serializable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Model implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<Plant> plants;
	ArrayList<Plant> allPlants;
	Filter f;
	File saveFile;
	int score;
	Cell[][] cells;
	String soilType;
	String waterLevel;
	String sunLight;
	double canvasHeight;
	double canvasWidth;
	
	public Model(double width, double height) {
		ArrayList<Plant> plants = new ArrayList<Plant>();
		canvasHeight = height;
		canvasWidth = width;
		cells = new Cell[(int)canvasHeight][(int)canvasWidth];
	}
	
	/**
	 * Saves the garden
	 */
	public void saveAll() {
		try {
		   FileOutputStream fos = new FileOutputStream(saveFile);
		   ObjectOutputStream outputStream = new ObjectOutputStream(fos);
		   outputStream.writeObject(plants);
		   outputStream.close();
		} 
		catch (IOException ex) {
		   System.err.println(ex);
		}
	}
	/**
	 * opens file browser to open a new garden
	 * @return - A previously saved Model
	 */
	public Model open() {
		Model savedModel = null;
		 
	    try {
	        FileInputStream fis = new FileInputStream(saveFile);
	        ObjectInputStream inputStream = new ObjectInputStream(fis);
	        savedModel = (Model) inputStream.readObject();
	        inputStream.close();
	    } 
	    catch (IOException | ClassNotFoundException ex) {
	        System.err.println(ex);
	    }
	 
	    return savedModel;
	}
	/**
	 * allows user to change the data for all cells.
	 * @return returns the new updated cell array
	 */
	public Cell[][] inputData() {
		for (Cell[] innerArray : cells)
	      {
	         for (Cell val : innerArray)
	         {
	            val.setSoil(soilType);
	            val.setSunlight(sunLight);
	            val.setWater(waterLevel);
	         }
	      }
		
		return cells;
	}
	/**
	 * Allows user to add an object of either a plant or obstruction by changing the cells in the parameter
	 * @param cellChange - what cells the obstruction covers
	 * @return - the new updated cell array
	 */
	public Cell[][] addObject(Cell[][] startColumn) {
		
		
		return cells;
	}
	/**
	 * Allows user to change the data in selected cells
	 * @param startCell - first cell selected
	 * @param endCell - last cell selected
	 * @param newSoil - the new soil needed to be assigned to highlighted cells
	 * @param newWater - the new water level needed to be assigned to highlighted cells
	 * @param newSun - the new sunlight level needed to be assigned to highlighted cells
	 * @return - the updated list of cells
	 */
	public Cell[][] editCells(Cell[][] startCell, Cell[][] endCell, String newSoil, String newWater, String newSun) {
		return cells;
	}
	/**
	 * allows user to change the data pertaining to seasons
	 * @param timeOfDay - timeOfDay selected by User
	 * @param season - Season selected by user
	 */
	public void preview(String timeOfDay, String season) {
		
	}
	/**
	 * gathers all data needed to enter final screen
	 */
	public void finalScreen() {
			
	}
	/**
	 * Grades plants depending on attributes of garden and the plants own attributes (1 point added for every common attribute)
	 * @param plants - ArrayList of all plants in the garden
	 * @return - the score of the garden as an integer
	 */
	public int plantGrader(ArrayList<Plant> plants) {
		int score = 0;
		
		for(Plant p: plants) {
			if (p.getSoil().equals(soilType)) {
				score++;
			}
			if (p.getWater().equals(waterLevel)) {
				score++;
			}
			if (p.getSunlight().equals(sunLight)) {
				score++;
			}
		}
		
		return score;
	}
	/**
	 * Calculates the total possible points available for garden based on amount of plants placed in Garden
	 * @param plants - ArrayList of all plants in the garden
	 * @return - the total possible score of the garden as an integer
	 */
	public int totalScore (ArrayList<Plant> plants) {
		int total = 0;
		total = plants.size() * 3;
		return total;
	}
}
	
