package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EtudiantTest {

	@Test
	void testGetAverage() {
		Etudiant etu = new Etudiant();
		assertEquals(-1, etu.getAverage(new double[]{10, 12.5, 5, -10, 0, -5.25, 3.75}), 0.01);
		assertEquals(11.83, etu.getAverage(new double[]{5, 10, 16, 13, 12, 15}), 0.01);
		assertEquals(11.21, etu.getAverage(new double[]{12.5, 4.65, 17.2, 10.5}), 0.01);
		assertEquals(-1, etu.getAverage(new double[]{20, 12.5, 25}), 0.01);	
	}

	@Test
	void testToString() {
		Etudiant str = new Etudiant(new Date(17, 2, 1992), "Theys", "Florent", 201661, new double[]{5, 10, 16, 13, 12,15});
		assertEquals("Etudiant:\n nom= Theys \n prénom= Florent \n date de naissance= 17/2/1992 \n matricule= 201661 \n moyenne des résultats= 11,83",
				str.toString());
	}
}
