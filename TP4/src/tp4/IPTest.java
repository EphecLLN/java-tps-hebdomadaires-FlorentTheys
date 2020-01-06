package tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IPTest {

	@Test
	void testEqualsObject() {
		IP adr1 = new IP(168, 250, 10, 0);
		IP adr2 = new IP(168, 250, 10, 0);
		IP adr3 = new IP(168, 250, 10, 1);
		IP adr4 = new IP(168, 168, 10, 0);
		assertEquals(true, adr1.equals(adr2));
		assertEquals(false, adr1.equals(adr3));
		assertEquals(false, adr2.equals(adr4));
		assertEquals(false, adr4.equals(adr3));
	
	}

	@Test
	void testCompareTo() {
		IP adr1 = new IP(168, 250, 10, 0);
		IP adr2 = new IP(168, 250, 10, 0);
		IP adr3 = new IP(168, 250, 10, 1);
		IP adr4 = new IP(168, 168, 10, 0);
		IP adr5 = new IP(28, 168, 10, 0);
		assertEquals(0, adr1.compareTo(adr2));
		assertEquals(1, adr1.compareTo(adr5));
		assertEquals(-1, adr1.compareTo(adr3));
		assertEquals(1, adr2.compareTo(adr4));
		assertEquals(-1, adr4.compareTo(adr1));
	}
	
	@Test
	void testIPString() {
		IP adr1 = new IP("168.250.10.0");
		assertEquals(168, adr1.getA());
		assertEquals(250, adr1.getB());
		assertEquals(10, adr1.getC());
		assertEquals(0, adr1.getD());
	}

}
