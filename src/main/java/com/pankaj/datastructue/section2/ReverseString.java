package com.pankaj.datastructue.section2;

public class ReverseString {

	public static String reverse(String original) {
		if (original != null) {
			int left = 0;
			char temp;
			int right = original.length() - 1;
			char[] arr = original.toCharArray();
			while (left < right) {
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
			return String.copyValueOf(arr);
		}
		return original;
	}

	public static void main(String[] args) {
		System.out.println(reverse("Hello"));
		System.out.println(reverse("abcd"));
	}
}
