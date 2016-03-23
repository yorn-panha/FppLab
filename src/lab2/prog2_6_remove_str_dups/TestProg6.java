package lab2.prog2_6_remove_str_dups;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestProg6 {

	@Test
	public void testRemoveDups() {
		String[] testData={"horse", "dog", "cat", "horse","dog"};
		String[] testNoData={"horse", "dog", "cat"};
		String[] result=Prog6.removeDups(testData);
		for(int i=0;i<testNoData.length;i++){
			assertTrue(testNoData[i].equals(result[i]));
		}
	}
}
