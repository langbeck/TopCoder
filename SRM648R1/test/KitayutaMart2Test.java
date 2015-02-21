import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KitayutaMart2Test {

	@Test
	public void testSample0() {
		assertEquals(1, new KitayutaMart2().numBought(100, 100));
	}

	@Test
	public void testSample1() {
		assertEquals(2, new KitayutaMart2().numBought(100, 300));
	}

	@Test
	public void testSample2() {
		assertEquals(3, new KitayutaMart2().numBought(150, 1050));
	}

	@Test
	public void testSample3() {
		assertEquals(10, new KitayutaMart2().numBought(160, 163680));
	}

}