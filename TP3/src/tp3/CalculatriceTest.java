package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatriceTest {

	@Test
	void testCarre() {
		Calculatrice calc = new Calculatrice();
		assertEquals(0, calc.carre(0));
		assertEquals(1, calc.carre(1));
		assertEquals(1, calc.carre(-1));
		assertEquals(4, calc.carre(-2));
		assertEquals(4, calc.carre(2));
	}

}
