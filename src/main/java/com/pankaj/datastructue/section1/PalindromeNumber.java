package com.pankaj.datastructue.section1;

public class PalindromeNumber {
	// time complexity O(n), space complexity O(1)
	public static boolean checkIfNumberIsPalindrome(int number) {
		// if a number is negative and ends with 0 not a palindrome.
		if (number < 0 || number % 10 == 0) {
			return false;
		}

		int reversedNum = 0;
		while (number > reversedNum) {
			int pop = number % 10;
			reversedNum = reversedNum * 10 + pop;
			number = number / 10;
		}
		// number will palindrome if reverse == number or number == reverse without last
		// digit
		return reversedNum == number || number == reversedNum / 10;
	}

	public static void main(String[] args) {
		System.out.println(checkIfNumberIsPalindrome(1221));
	}
}
