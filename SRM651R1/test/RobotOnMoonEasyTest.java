import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RobotOnMoonEasyTest {

	@Test
	public void testSample0() {
		assertEquals(
				"Alive",
				new RobotOnMoonEasy().isSafeCommand(new String[] { ".....",
						".###.", "..S#.", "...#." }, "URURURURUR"));
	}

	@Test
	public void testSample1() {
		assertEquals(
				"Dead",
				new RobotOnMoonEasy().isSafeCommand(new String[] { ".....",
						".###.", "..S..", "...#." }, "URURURURUR"));
	}

	@Test
	public void testSample2() {
		assertEquals(
				"Alive",
				new RobotOnMoonEasy().isSafeCommand(new String[] { ".....",
						".###.", "..S..", "...#." }, "URURU"));
	}

	@Test
	public void testSample3() {
		assertEquals("Alive", new RobotOnMoonEasy().isSafeCommand(new String[] {
				"#####", "#...#", "#.S.#", "#...#", "#####" },
				"DRULURLDRULRUDLRULDLRULDRLURLUUUURRRRDDLLDD"));
	}

	@Test
	public void testSample4() {
		assertEquals("Dead", new RobotOnMoonEasy().isSafeCommand(new String[] {
				"#####", "#...#", "#.S.#", "#...#", "#.###" },
				"DRULURLDRULRUDLRULDLRULDRLURLUUUURRRRDDLLDD"));
	}

	@Test
	public void testSample5() {
		assertEquals("Dead",
				new RobotOnMoonEasy().isSafeCommand(new String[] { "S" }, "R"));
	}

}