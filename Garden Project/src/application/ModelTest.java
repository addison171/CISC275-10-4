package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ModelTest {

	@Test
	void testInputData() {
		Cell[][] cells = new Cell[1][1];
		cells[0][0] = new Cell();
		Model m = new Model();
		assertEquals(m.inputData().equals(cells), false);
	}

	@Test
	void testAddObstruction() {
		Cell[][] cells = new Cell[5][5];	
		Model m = new Model();
		assertEquals(m.addObstruction().equals(cells), false);	}

	@Test
	void testEditCells() {
		fail("Not yet implemented");
	}

}
