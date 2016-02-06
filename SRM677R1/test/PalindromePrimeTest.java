import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromePrimeTest {

	@Test
	public void testSample0() {
		assertEquals(2, new PalindromePrime().count(100, 150));
	}

	@Test
	public void testSample1() {
		assertEquals(4, new PalindromePrime().count(1, 9));
	}

	@Test
	public void testSample2() {
		assertEquals(1, new PalindromePrime().count(929, 929));
	}

	@Test
	public void testSample3() {
		assertEquals(0, new PalindromePrime().count(1, 1));
	}

	@Test
	public void testSample4() {
		assertEquals(20, new PalindromePrime().count(1, 1000));
	}

}