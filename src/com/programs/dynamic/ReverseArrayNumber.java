package com.programs.dynamic;

import java.util.Arrays;

public class ReverseArrayNumber {
	private void reverse(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {

		ReverseArrayNumber reverse = new ReverseArrayNumber();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		reverse.reverse(arr);
		System.out.println(Arrays.toString(arr));
	}

}
