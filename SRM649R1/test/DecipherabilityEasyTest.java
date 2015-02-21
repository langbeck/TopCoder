import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecipherabilityEasyTest {

	@Test
	public void testSample0() {
		assertEquals("Possible",
				new DecipherabilityEasy().check("sunuke", "snuke"));
	}

	@Test
	public void testSample1() {
		assertEquals("Impossible",
				new DecipherabilityEasy().check("snuke", "skue"));
	}

	@Test
	public void testSample2() {
		assertEquals("Impossible",
				new DecipherabilityEasy().check("snuke", "snuke"));
	}

	@Test
	public void testSample3() {
		assertEquals("Impossible",
				new DecipherabilityEasy().check("snukent", "snuke"));
	}

	@Test
	public void testSample4() {
		assertEquals("Possible",
				new DecipherabilityEasy().check("aaaaa", "aaaa"));
	}

	@Test
	public void testSample5() {
		assertEquals("Impossible",
				new DecipherabilityEasy().check("aaaaa", "aaa"));
	}

	@Test
	public void testSample6() {
		assertEquals("Possible",
				new DecipherabilityEasy().check("topcoder", "tpcoder"));
	}

	@Test
	public void testSample7() {
		assertEquals("Impossible", new DecipherabilityEasy().check(
				"singleroundmatch", "singeroundmatc"));
	}

}