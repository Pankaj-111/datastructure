package com.pankaj.datastructue.section1;

import java.util.ArrayList;
import java.util.List;

public class FizBuzz {
	// write a string representation of numbers from 1 to n, if number is multiple
	// of 3 then replace it by "Fizz",
	// if multiple of 5 the "Buzz", if multiple of 3 and 5 then "FizzBuzz" otherwise
	// number

	// solution time complexity is O(n) and space complexity O(n)- construction of
	// list
	public static void numberRepresntation(int n) {
		if (n > 0) {
			List<String> list = new ArrayList<>();
			for (int i = 1; i <= n; i++) {
				list.add(getNumberToString(i));
			}
			System.out.println(list);
		} else {
			System.out.println("Enter any number > 0");
		}
	}

	private static String getNumberToString(int i) {
		if (i % 3 == 0 && i % 5 == 0) {
			return "FizzBuzz";
		}
		if (i % 3 == 0) {
			return "Fizz";
		}
		if (i % 5 == 0) {
			return "Buzz";
		}
		return i + "";
	}

	public static void main(String[] args) {
		numberRepresntation(15);
	}
}
