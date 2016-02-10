import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CoinFlipsDiv2Test {

	@Test
	public void testSample0() {
		assertEquals(2, new CoinFlipsDiv2().countCoins("HT"));
	}

	@Test
	public void testSample1() {
		assertEquals(0, new CoinFlipsDiv2().countCoins("T"));
	}

	@Test
	public void testSample2() {
		assertEquals(0, new CoinFlipsDiv2().countCoins("HHH"));
	}

	@Test
	public void testSample3() {
		assertEquals(3, new CoinFlipsDiv2().countCoins("HHTHHH"));
	}

	@Test
	public void testSample4() {
		assertEquals(12, new CoinFlipsDiv2().countCoins("HHHTTTHHHTTTHTHTH"));
	}

}