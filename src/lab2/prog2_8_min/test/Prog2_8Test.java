package lab2.prog2_8_min.test;

import static org.junit.Assert.*;
import lab2.prog2_8_min.Prog2_8;

import org.junit.Test;

public class Prog2_8Test {

	@Test
	public void testMin() {
		int min=Prog2_8.min(new int[]{2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22});
		assertEquals(-22, min);
	}

}
