package tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatriceTest {

	@Test
	void testEqualsObject() {
		Calculatrice calc1 = new Calculatrice(5);
		Calculatrice calc2 = new Calculatrice(5);
		Calculatrice calc3 = new Calculatrice(4);
		assertEquals(true, calc1.equals(calc2));
		assertEquals(false, calc1.equals(calc3));
		assertEquals(false, calc3.equals(calc2));
		assertEquals(true, calc2.equals(calc1));
	}

	@Test
	void testCompareTo() {
		Calculatrice calc1 = new Calculatrice(5);
		Calculatrice calc2 = new Calculatrice(5);
		Calculatrice calc3 = new Calculatrice(4);
		assertEquals(0, calc1.compareTo(calc2));
		assertEquals(1, calc1.compareTo(calc3));
		assertEquals(-1, calc3.compareTo(calc2));
	}

}
