import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TaroJiroDividingTest {

	@Test
	public void testSample0() {
		assertEquals(3, new TaroJiroDividing().getNumber(8, 4));
	}

	@Test
	public void testSample1() {
		assertEquals(0, new TaroJiroDividing().getNumber(4, 7));
	}

	@Test
	public void testSample2() {
		assertEquals(3, new TaroJiroDividing().getNumber(12, 12));
	}

	@Test
	public void testSample3() {
		assertEquals(4, new TaroJiroDividing().getNumber(24, 96));
	}

	@Test
	public void testSample4() {
		assertEquals(0, new TaroJiroDividing().getNumber(1000000000, 999999999));
	}

}