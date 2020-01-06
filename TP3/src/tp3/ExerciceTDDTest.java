package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ExerciceTDDTest {

	@Test
	void testIsEven() {
		ExerciceTDD even = new ExerciceTDD();
		assertEquals(true, even.isEven(0));
		assertEquals(false, even.isEven(1));
		assertEquals(true, even.isEven(2));
		assertEquals(false, even.isEven(-1));
		assertEquals(true, even.isEven(-2));
	}

	@Test
	void testGetSquarePerimeter() {
		ExerciceTDD perimeter = new ExerciceTDD();
		assertEquals(0, perimeter.getSquarePerimeter(0));
		assertEquals(2, perimeter.getSquarePerimeter(0.5));
		assertEquals(12, perimeter.getSquarePerimeter(3));
		assertEquals(-1, perimeter.getSquarePerimeter(-2));
	}

	@Test
	void testCheckCharInString() {
		ExerciceTDD strChar = new ExerciceTDD();
		assertEquals(true, strChar.checkCharInString("Salut alpha66", "a"));
		assertEquals(true, strChar.checkCharInString("Salut alpha66", "6"));
		assertEquals(false, strChar.checkCharInString("Salut alpha66", "s"));
		assertEquals(true, strChar.checkCharInString("Salut alpha66", "S"));
		assertEquals(false, strChar.checkCharInString("Salut alpha66", "e"));
		assertEquals(false, strChar.checkCharInString("Salut alpha66", "9"));
		assertEquals(false, strChar.checkCharInString("123456", "t"));
		assertEquals(true, strChar.checkCharInString("123456", "3"));
		assertEquals(false, strChar.checkCharInString("123456", "7"));
		
	}

}
