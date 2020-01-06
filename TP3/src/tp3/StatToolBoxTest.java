package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StatToolBoxTest {

	@Test
	void testMoyenne() {
		StatToolBox moyenne = new StatToolBox(new int[]{1, 6, 3, 4, 5});
		assertEquals(3.8, moyenne.moyenne());

		
	}

}
