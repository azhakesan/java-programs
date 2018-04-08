package com.programs.dynamic;

import java.util.Arrays;

/**
 * Add 1 number represented Array Option 1: Option 2: recursive
 */
public class ArrayAddByOne {
	public static void addByOne(int[] arr, int addBy) {
		int i, sum = 0, carry = 0;
		for (i = arr.length - 1; i >= 0; i--) {
			if (i == arr.length - 1) {
				sum = arr[i] + addBy;
			} else {
				sum = arr[i] + carry;
			}
			if (sum < 10) {
				arr[i] = sum;

			} else if (sum == 10) {
				carry = 1;
				arr[i] = 0;
			} else {
				carry = 1;
				int val = (sum % 10);
				arr[i] = val;
			}
		}

		if (i <= 0 && carry != 0) {
			int[] newArr = new int[arr.length + 1];
			newArr[0] = carry;
			for (int k = 0; k < arr.length; k++) {
				newArr[k + 1] = arr[k];
			}
			System.out.println("New Array=" + Arrays.toString(newArr));
		}
		System.out.println("Actual Array=" + Arrays.toString(arr));
	}

	/**
	 * 
	 * @param arr
	 */
	private static void addByOneOption2(int[] arr, int len) {
		int sum;
		while (len > 0) {
			sum = arr[len - 1] + 1;
			if (sum < 9) {
				arr[len] = arr[len] + 1;
				return;
			}
			arr[len - 1] = 0;
			len--;
			addByOneOption2(arr, len);
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 9, 9 };
		// addByOne(arr, 4);
		addByOneOption2(arr, arr.length);
	}
}