package lab4.prog4_3_search;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinSearchTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertTrue(BinSearch.search("abcfgwx", 'c'));
	}
	@Test
	public void testFail() {
		//fail("Not yet implemented");
		assertTrue(BinSearch.search("abcfgwx", 'z'));
	}

}
