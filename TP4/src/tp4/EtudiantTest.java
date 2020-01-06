package tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EtudiantTest {


	@Test
	void testGetNbEtudiants() {
		Etudiant etu1 = new Etudiant();
		Etudiant etu2 = new Etudiant();
		Etudiant etu3 = new Etudiant();
		Etudiant etu4 = new Etudiant();
		assertEquals(7, etu4.getNbEtudiants());
		assertEquals(7, etu3.getNbEtudiants());
		assertEquals(7, etu2.getNbEtudiants());
		assertEquals(7, etu1.getNbEtudiants());
		assertEquals(7, etu4.getMatricule());
		assertEquals(6, etu3.getMatricule());
		assertEquals(5, etu2.getMatricule());
		assertEquals(4, etu1.getMatricule());
	}
	
	@Test
	void testEqualsObject() {
		Etudiant etu1 = new Etudiant();
		Etudiant etu2 = new Etudiant();
		assertEquals(true, etu1.equals(etu1));
		assertEquals(false, etu2.equals(etu1));
		assertEquals(false, etu1.equals(etu2));
	}

	@Test
	void testCompareTo() {
		Etudiant etu1 = new Etudiant();
		Etudiant etu2 = new Etudiant();
		assertEquals(0, etu1.compareTo(etu1));
		assertEquals(1, etu2.compareTo(etu1));
		assertEquals(-1, etu1.compareTo(etu2));
	}

	@Test
	void testAge() {
		Etudiant etu1 = new Etudiant("Theys", "Florent", "17/02/1992");
		assertEquals(27, etu1.age());
		
	}

}
