package com.sutemitech.exp;

import java.util.LinkedList;
import java.util.List;

public class TriangleGenerator {

	public int trianglenumber(int ith) {
		int sum = 0;
		for (int i = 1; i <= ith; i++) {
			sum += i;
		}
		return sum;
	}
	
	public List<Integer> triangleSequence(int iterms) {
		List<Integer> seq = new LinkedList<Integer>();
		int sum = 0;
		for (int i = 1; i <= iterms; i++) {
			seq.add(sum += i);
		}
		return seq;
	}
}
