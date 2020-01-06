package tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

	@Test
	void testDateString() {
		Date date1 = new Date("17/02/1992");
		assertEquals(17, date1.getJour());
		assertEquals(02, date1.getMois());
		assertEquals(1992, date1.getAnnee());
	}

	@Test
	void testEqualsObject() {
		Date date1 = new Date(17, 02, 1992);
		Date date2 = new Date(17, 02, 1992);
		Date date3 = new Date(16, 02, 1992);
		assertEquals(true, date1.equals(date2));
		assertEquals(false, date1.equals(date3));
		assertEquals(false, date3.equals(date2));
			
	}

	@Test
	void testCompareTo() {
		Date date1 = new Date(17, 02, 1992);
		Date date2 = new Date(17, 02, 1992);
		Date date3 = new Date(16, 02, 1992);
		Date date4 = new Date(17, 03, 1992);
		Date date5 = new Date(25, 12, 2012);
		assertEquals(0, date1.compareTo(date2));
		assertEquals(1, date1.compareTo(date3));
		assertEquals(-1, date3.compareTo(date1));
		assertEquals(-1, date2.compareTo(date4));
		assertEquals(1, date5.compareTo(date3));
		assertEquals(-1, date4.compareTo(date5));		
	}
}
