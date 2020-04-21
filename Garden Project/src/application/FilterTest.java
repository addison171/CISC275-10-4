package application;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class FilterTest {

	@Test
	public void searchTest() {
		ArrayList<Plant> plants1 = new ArrayList<Plant>();
		ArrayList<Plant> plants2 = new ArrayList<Plant>();
		Filter f = new Filter(plants1, "Fall", "Clay", "Sunny" , "Dry");
		plants1.add(new Plant("Blue Oak", "Clay","Shade", "Wet", "Spring"));
		plants1.add(new Plant("Red Oak", "Clay","Sunny", "Dry", "Fall"));
		assertEquals(plants2,f.search(plants1));
		plants2.add(new Plant("Red Oak", "Clay","Sunny", "Dry", "Fall"));
		assertEquals(plants2,f.search(plants1));
	}
	
}
