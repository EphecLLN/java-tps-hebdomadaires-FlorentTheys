package tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonneTest {

	@Test
	void testEqualsObject() {
		Personne p1 = new Personne("Theys", "Florent");
		Personne p2 = new Personne("Theys", "Florent");
		Personne p3 = new Personne("Poutou", "Jean");
		assertEquals(true, p1.equals(p2));
		assertEquals(false, p1.equals(p3));
		assertEquals(false, p3.equals(p2));
	}

	@Test
	void testCompareString() {
		Personne p1 = new Personne("Theys", "Florent");
		Personne p2 = new Personne("Theys", "Florent");
		Personne p3 = new Personne("Poutou", "Jean");
		Personne p4 = new Personne("Theys", "Marcel");
		
		assertEquals(0, p1.compareString(p2));
		assertTrue(p1.compareString(p3) > 0);
		assertTrue(p3.compareString(p2) < 0);
		assertTrue(p1.compareString(p4) < 0);
	}

}
