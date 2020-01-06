package bibliotheque;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LivreTest {

	@Test
	void testEqualsObject() {
		Livre liv1 = new Livre("Florent Theys", "Bonjour le livre", 2016, new String[]{"aaa aaa", "bbb bbb", "ccc ccc", "ddd ddd"}); 
		Livre liv2 = new Livre("Florent Theys", "Bonjour le livre", 2016, new String[]{"aaa aaa", "bbb bbb", "ccc ccc", "ddd ddd"}); 
		Livre liv3 = new Livre("Florent Theys", "Bonjour le livre", 2015, new String[]{"aaa aaa", "bbb bbb", "ccc ccc", "ddd ddd"}); 
		Livre liv4 = new Livre("Marcel Poutou", "Ceci n'est pas un livre", 1995, new String[]{"zzz zzz", "yyy yyy", "xxx xxx", "www www"}); 
		assertEquals(true, liv1.equals(liv2));
		assertEquals(false, liv1.equals(liv3));
		assertEquals(false, liv2.equals(liv4));		
	}



	@Test
	void testGetPage() {
		Livre liv1 = new Livre("Florent Theys", "Bonjour le livre", 2016, new String[]{"aaa aaa", "bbb bbb", "ccc ccc", "ddd ddd"}); 
		Livre liv2 = new Livre("Marcel Poutou", "Ceci n'est pas un livre", 1995, new String[]{"zzz zzz", "yyy yyy", "xxx xxx", "www www"}); 
		assertEquals("aaa aaa", liv1.getPage(0));
		assertEquals("yyy yyy", liv2.getPage(1));
	}

	@Test
	void testSetPage() {
		Livre liv1 = new Livre("Florent Theys", "Bonjour le livre", 2016, new String[]{"aaa aaa", "bbb bbb", "ccc ccc", "ddd ddd"}); 
		assertEquals("aaa aaa", liv1.setPage(0, "lll lll"));
		assertEquals("lll lll", liv1.setPage(0, "aaa aaa"));
	}
	
	@Test
	void testGetFirstPage() {
		Livre liv1 = new Livre("Florent Theys", "Bonjour le livre", 2016, new String[]{"aaa aaa", "bbb bbb", "ccc ccc", "ddd ddd"}); 
		Livre liv2 = new Livre("Marcel Poutou", "Ceci n'est pas un livre", 1995, new String[]{"zzz zzz", "yyy yyy", "xxx xxx", "www www"}); 
		assertEquals("aaa aaa", liv1.getFirstPage());
		assertEquals("zzz zzz", liv2.getFirstPage());

	}
}
