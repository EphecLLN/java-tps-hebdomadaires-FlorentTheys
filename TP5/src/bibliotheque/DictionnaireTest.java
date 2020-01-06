package bibliotheque;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DictionnaireTest {

	@Test
	void testGetPage() {
		Dictionnaire dico1 = new Dictionnaire("Florent Theys", "Robert", 2017, "Français", new String[][]{{"aaa aaa", "bbb bbb"},{"ccc ccc", "ddd ddd"}});
		Dictionnaire dico2 = new Dictionnaire("Marcel Poutou", "Larousse", 1954, "Français", new String[][]{{"zzz zzz", "yyy yyy"},{"xxx xxx", "www www"}});
		assertEquals("aaa aaa\nbbb bbb\n", dico1.getPage(0));
		assertEquals("xxx xxx\nwww www\n", dico2.getPage(1));
	}

	@Test
	void testGetFirstPage() {
		Dictionnaire dico1 = new Dictionnaire("Florent Theys", "Robert", 2017, "Français", new String[][]{{"aaa aaa", "bbb bbb"},{"ccc ccc", "ddd ddd"}});
		Dictionnaire dico2 = new Dictionnaire("Marcel Poutou", "Larousse", 1954, "Français", new String[][]{{"zzz zzz", "yyy yyy"},{"xxx xxx", "www www"}});
		assertEquals("aaa aaa\nbbb bbb\n", dico1.getFirstPage());
		assertEquals("zzz zzz\nyyy yyy\n", dico2.getFirstPage());
	}

	@Test
	void testGetExtrait() {
		Dictionnaire dico1 = new Dictionnaire("Florent Theys", "Robert", 2017, "Français", new String[][]{{"aaa aaa", "bbb bbb"},{"ccc ccc", "ddd ddd"}});
		Dictionnaire dico2 = new Dictionnaire("Marcel Poutou", "Larousse", 1954, "Français", new String[][]{{"zzz zzz", "yyy yyy"},{"xxx xxx", "www www"}});
		assertEquals("aaa aaa", dico1.getExtrait());
		assertEquals("zzz zzz", dico2.getExtrait());
	}

	@Test
	void testSetDefinition() {
		Dictionnaire dico1 = new Dictionnaire("Florent Theys", "Robert", 2017, "Français", new String[][]{{"aaa aaa", "bbb bbb"},{"ccc ccc", "ddd ddd"}});
		Dictionnaire dico2 = new Dictionnaire("Marcel Poutou", "Larousse", 1954, "Français", new String[][]{{"zzz zzz", "yyy yyy"},{"xxx xxx", "www www"}});
		assertEquals("aaa aaa", dico1.SetDefinition(0, 0, "fff fff"));
		assertEquals("fff fff", dico1.SetDefinition(0, 0, "aaa aaa"));
		assertEquals("www www", dico2.SetDefinition(1, 1, "lll lll"));
		assertEquals("lll lll", dico2.SetDefinition(1, 1, "www www"));
	}

	@Test
	void testGetDefinition() {
		Dictionnaire dico1 = new Dictionnaire("Florent Theys", "Robert", 2017, "Français", new String[][]{{"aaa aaa", "bbb bbb"},{"ccc ccc", "ddd ddd"}});
		Dictionnaire dico2 = new Dictionnaire("Marcel Poutou", "Larousse", 1954, "Français", new String[][]{{"zzz zzz", "yyy yyy"},{"xxx xxx", "www www"}});
		assertEquals("ccc ccc", dico1.getDefinition(1, 0));
		assertEquals("zzz zzz", dico2.getDefinition(0, 0));
		assertEquals("bbb bbb", dico1.getDefinition(0, 1));
	}

}
