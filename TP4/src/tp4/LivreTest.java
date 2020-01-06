package tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LivreTest {

	@Test
	void testEqualsObject() {
		Livre liv1 = new Livre("Coucou", "Florent Theys", "A1");
		Livre liv2 = new Livre("Coucou", "Florent Theys", "A2");
		Livre liv3 = new Livre("Coucou", "Florent Theys", "F25");
		Livre liv4 = new Livre("Coucou", "Florent Theys", "A1");
		assertEquals(true, liv1.equals(liv4));
		assertEquals(false, liv1.equals(liv2));
		assertEquals(false, liv3.equals(liv4));

	}

	@Test
	void testCompareString() {
		Livre liv1 = new Livre("Coucou", "Florent Theys", "A1");
		Livre liv2 = new Livre("Coucou", "Florent Theys", "A2");
		Livre liv3 = new Livre("Coucou", "Florent Theys", "F25");
		Livre liv4 = new Livre("Coucou", "Florent Theys", "A1");
		assertEquals(0, liv1.compareString(liv4));
		assertEquals(1, liv3.compareString(liv2));
		assertEquals(-1, liv1.compareString(liv2));
		assertEquals(1, liv2.compareString(liv4));
		assertEquals(-1, liv2.compareString(liv3));
	}

}
