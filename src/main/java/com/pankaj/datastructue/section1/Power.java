package com.pankaj.datastructue.section1;

public class Power {
	// Time Complexity of solution: O(logn)
	public static double getPower(double x, int n) {
		double answer = 1.0;
		double nAbsolute = getAbsolute(n);
		while (nAbsolute > 0) {
			if (nAbsolute % 2 == 0) {
				x = x * x;
				nAbsolute = nAbsolute / 2;
			} else {
				answer = answer * x;
				nAbsolute = nAbsolute - 1;
			}
		}
		return n < 0 ? 1.0 / answer : answer;
	}

	private static double getAbsolute(final double x) {
		if (x < 0) {
			return x * -1;
		}
		return x;
	}

	public static void main(String[] args) {
		System.out.println(getPower(3, -3));
	}
}
