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
		Model m = new Model(2, 2);
		m.soilType = "sandy";
		m.sunLight = "high";
		m.waterLevel = "high";
		m.cells = m.inputData();
		for(Cell[] innerArray : m.cells) {
			for(Cell val: innerArray) {
				assertEquals(val.getSoil(), ("sandy"));
				assertEquals(val.getSun(), ("high"));
				assertEquals(val.getWater(), ("high"));
			}
		}
	}
	
	@Test
	public void testAddObject() {
		Model m = new Model(3,3);
		Plant plant = new Plant("a", "b", "c", "w", "b","d");
		m.addObject(m.cells, 0, 0, 1, 1, plant);
		assertEquals(m.cells[0][0].getPlant(), plant);
		
	}

	@Test
	public void testEditCells() {
		Model m = new Model(3,3);
		m.waterLevel = "low";
		m.soilType = "sandy";
		m.sunLight = "low";
		m.inputData();
		assertEquals(m.cells[0][0].getSoil(), "sandy");
		m.editCells(m.cells, 0, 0, 1, 1, "clay", "high", "high");
		assertEquals(m.cells[0][0].getSoil(), "clay");
		}	
		
	@Test
	public void testPlantGrader() {
		Model m = new Model();
		ArrayList<Plant> p = new ArrayList<Plant>();
		p.add(new Plant("Blue Oak", "Clay","Shade", "Wet", "Spring", "desc"));
		m.soilType = "Clay";
		m.waterLevel = "Wet";
		m.sunLight = "Shade";
		int score = 3;
		assertEquals(score, m.plantGrader(p));	
	}	
	@Test
	public void testTotalScore() {
		Model m = new Model(3,3);
		Plant plant = new Plant("a", "b", "c", "w", "b","d");
		ArrayList<Plant> p = new ArrayList<Plant>();
		p.add(plant);
		assertEquals(m.totalScore(p), 3);
	}
	
}

