package com.sutemitech.exp;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.sutemitech.exp.TriangleGenerator;

public class TriangleGeneratorTest {

	TriangleGenerator tg = new TriangleGenerator();
	
	@Test
	public void testSingleTriangle() {
		assertEquals(1,tg.trianglenumber(1));
		assertEquals(3,tg.trianglenumber(2));
		assertEquals(6,tg.trianglenumber(3));
		assertEquals(10,tg.trianglenumber(4));
		assertEquals(15,tg.trianglenumber(5));
	}	

	@Test
	public void testNegativeSingleTriangle() {
		assertEquals(0,tg.trianglenumber(-5));
	}
	
	@Test
	public void testTriangleSequence() {
		List<Integer> seq = tg.triangleSequence(5);
		assertEquals(5, seq.size());
		assertTrue(seq.contains(1));
		assertTrue(seq.contains(3));
		assertTrue(seq.contains(6));
		assertTrue(seq.contains(10));
		assertTrue(seq.contains(15));
	}
	
}
