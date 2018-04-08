package com.programs.datastructure;

/**
 * Binary Search Example
  */
public class BinarySearchExample {

	private int binarySearch(int arr[], int ele) {
		int low = 0;
		int high = arr.length - 1;
		int result = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == ele) {
				result = ele;
				high = mid - 1;
				return ele;
			} else if (ele < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 3, 4 };
		BinarySearchExample bs = new BinarySearchExample();
		System.out.println(bs.binarySearch(arr, 4));
	}
}
