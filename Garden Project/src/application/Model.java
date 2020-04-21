package application;

import java.util.ArrayList;

public class Model {
	ArrayList<Plant> plants;
	Filter f;
	int score;
	Cell[][] cells;
	String soilType;
	String waterLevel;
	String sunLight; 
	/**
	 * Saves the garden
	 */
	public void saveAll() {
		
	}
	/**
	 * opens file browser to open a new garden
	 */
	public void open() {
		
	}
	/**
	 * allows user to change the data for all cells.
	 * @return returns the new updated cell array
	 */
	public Cell[][] inputData() {
		return cells;
	}
	/**
	 * Allows user to add obstruction by changing the cells in the parameter
	 * @param cellChange - what cells the obstruction covers
	 * @return - the new updated cell array
	 */
	public Cell[][] addObstruction(Cell[][] cellChange) {
		return cells;
	}
	/**
	 * Allows user to change the data in selected cells
	 * @param cellChange - the cells being changed
	 * @return - the updated list of cells
	 */
	public Cell[][] editCells(Cell[][] cellChange) {
		return cells;
	}
}
