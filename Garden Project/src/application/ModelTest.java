package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ModelTest {

	@Test
	void testInputData() {
		Cell[][] cells = new Cell[1][1];
		cells[0][0] = new Cell();
		assertEquals(inputData().compare(cells), false);
	}

	@Test
	void testAddObstruction() {
		fail("Not yet implemented");
	}

	@Test
	void testEditCells() {
		fail("Not yet implemented");
	}

}
