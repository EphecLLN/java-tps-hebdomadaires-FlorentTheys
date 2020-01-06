package tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CercleTest {

	private Cercle cer1 = new Cercle(2.25);
	private Cercle cer2 = new Cercle(0);
	private Cercle cer3 = new Cercle(5);
	
	@Test
	void testCalculerAire() {
		assertEquals(15.9, cer1.calculerAire(), 0.01);
		assertEquals(0, cer2.calculerAire());
		assertEquals(78.53, cer3.calculerAire(), 0.01);
		
	}

	@Test
	void testCalculerPerimetre() {
		assertEquals(14.13 , cer1.calculerPerimetre(), 0.01);
		assertEquals(0 , cer2.calculerPerimetre());
		assertEquals(31.41 , cer3.calculerPerimetre(), 0.01);
	}

}
