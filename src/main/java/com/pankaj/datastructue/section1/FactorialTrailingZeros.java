package com.pankaj.datastructue.section1;

public class FactorialTrailingZeros {
// Find number of zeros in a factorial of a number.
// Solution is count number of 5
	public static int findTrailingZeros(int n) {
		int count = 0;
		while (n > 0) {
			count += n / 5;
			n = n / 5;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(findTrailingZeros(5));
		System.out.println(findTrailingZeros(25));
	}
}
