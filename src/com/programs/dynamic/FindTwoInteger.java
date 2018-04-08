package com.programs.dynamic;

/**
 * Problem: Find two integer that multiple by 20
 * 
 */
public class FindTwoInteger {
	public static void findTheInteger(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (arr[i] * arr[j] == 20) {
					System.out.println(arr[i] + " " + arr[j]);
					return;
				}
			}
		}
		return;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 6, 5, 40, -1 };
		findTheInteger(arr);
	}
}
