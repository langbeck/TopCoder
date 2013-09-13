package com.gcoelho.TopCoder.SRM590R1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FoxAndGomokuTest {

	@Test
	public void testSample0() {
		final String[] board = { "....o.", "...o..", "..o...", ".o....",
				"o.....", "......" };
		assertTrue(new FoxAndGomoku().win(board).equals("found"));
	};

	@Test
	public void testSample1() {
		final String[] board = { "oooo.", ".oooo", "oooo.", ".oooo", "....." };
		assertTrue(new FoxAndGomoku().win(board).equals("not found"));
	};

	@Test
	public void testSample2() {
		final String[] board = { "oooo.", ".oooo", "oooo.", ".oooo", "....o" };
		assertTrue(new FoxAndGomoku().win(board).equals("found"));
	};

	@Test
	public void testSample3() {
		final String[] board = { "o.....", ".o....", "..o...", "...o..",
				"....o.", "......" };
		assertTrue(new FoxAndGomoku().win(board).equals("found"));
	};

	@Test
	public void testSample4() {
		final String[] board = { "o....", "o.o..", "o.o.o", "o.o..", "o...." };
		assertTrue(new FoxAndGomoku().win(board).equals("found"));
	};

	@Test
	public void testSample5() {
		final String[] board = { "..........", "..........", "..oooooo..",
				"..o.......", "..o.......", "..oooooo..", ".......o..",
				".......o..", "..oooooo..", ".........." };
		assertTrue(new FoxAndGomoku().win(board).equals("found"));
	};

	@Test
	public void testSample6() {
		final String[] board = { "..........", "..........", "..oooo.o..",
				"..o.......", "..o.......", "..o.oooo..", ".......o..",
				".......o..", "..oooo.o..", ".........." };
		assertTrue(new FoxAndGomoku().win(board).equals("not found"));
	};

	@Test
	public void testSample7() {
		final String[] board = { "ooooo", "ooooo", "ooooo", "ooooo", "ooooo" };
		assertTrue(new FoxAndGomoku().win(board).equals("found"));
	};

	@Test
	public void testSample8() {
		final String[] board = { ".....", ".....", ".....", ".....", "....." };
		assertTrue(new FoxAndGomoku().win(board).equals("not found"));
	};

};