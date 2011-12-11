package com.sutemitech.exp;

import java.util.List;

public class ExpMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TriangleGenerator tg = new TriangleGenerator();
		
		System.out.println("100th triangle number is: " + tg.trianglenumber(100));
		
		List<Integer> triseq = tg.triangleSequence(15);
		System.out.println("Sequence of triangle numbers");
		for (Integer next:triseq) {
			System.out.println("   " + next);
		}
	}

}
