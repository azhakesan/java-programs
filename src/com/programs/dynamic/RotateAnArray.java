package com.programs.dynamic;

import java.util.Arrays;

public class RotateAnArray {

	public static void main(String arg[]) {
		int[] arr = { 1, 2, 3, 4, 5, 5, 6 };
		rotateArray(arr, 3);
		System.out.println(Arrays.toString(arr));
	}

	private static void rotateArray(int[] arr, int times) {
		int c = 0;
		while (c < times) {
			int i, temp = 0;
			temp = arr[0];
			for (i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[i] = temp;
			c++;
		}
	}
}
