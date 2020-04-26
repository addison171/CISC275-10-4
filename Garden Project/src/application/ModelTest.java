/**
 * @author Addison Kuykendall
 */
package application;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class ModelTest {

	@Test
	public void testInputData() {
		Cell[][] cells = new Cell[1][1];
		cells[0][0] = new Cell();
		Model m = new Model();
		m.cells = new Cell[5][5];
		assertEquals(m.inputData().equals((cells)), true);
	}

	@Test
	public void testAddObstruction() {
		Cell[][] cells = new Cell[5][5];	
		Model m = new Model();
		m.cells = new Cell[5][5];
		boolean equality = m.addObstruction(cells)==cells; 
		assertEquals(equality, true);	}

	@Test
	public void testEditCells() {
		Cell[][] cells = new Cell[5][5];	
		Model m = new Model();
		m.cells = new Cell[5][5];
		boolean equality2 = m.editCells(cells)==cells; 
		assertEquals(equality2, true);	}	
	@Test
	public void testPlantGrader() {
		Model m = new Model();
		ArrayList<Plant> p = new ArrayList<Plant>();
		p.add(new Plant("Blue Oak", "Clay","Shade", "Wet", "Spring"));
		m.soilType = "Clay";
		m.waterLevel = "Wet";
		m.sunLight = "Shade";
		int score = 3;
		assertEquals(score, m.plantGrader(p));	
	}	
	@Test
	public void testTotalScore() {
		Model m = new Model();
	}
	
}

