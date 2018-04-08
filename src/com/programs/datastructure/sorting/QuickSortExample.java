package com.programs.datastructure.sorting;

import java.util.Arrays;

/**
 * 
 * Quick Sort
 *
 */
public class QuickSortExample {
	private int[] quickSort(int[] arr, int left, int right) {
		int i = left;
		int j = right;
		int temp = 0;
		int pivot = (int) (left + right) / 2;
		int mid = arr[pivot];
		while (i < j) {
			while (arr[i] < mid) {
				i++;
			}
			while (arr[i] > mid) {
				j--;
			}
			if (i <= j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			if (left < j) {
				quickSort(arr, left, j);
			}
			if (i < right) {
				quickSort(arr, i, right);
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 8, 3, 4, 5, 6, 7 };
		QuickSortExample qs = new QuickSortExample();
		qs.quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
