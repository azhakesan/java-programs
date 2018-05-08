package com.programs.dynamic;

import java.util.Arrays;

public class FindKthSmallestElement {
	private void findKthEle(int k) {

		int[] arr = { 8, 4, 3, 5, 1, 7, 9 };
		Arrays.sort(arr);
		int i = 0;
		while (i < k) {
			System.out.print(arr[i] + " ");
			i++;
		}
	}
	public static void main(String[] args) {
		FindKthSmallestElement kth = new FindKthSmallestElement();
		// Find Kth Small Element
		kth.findKthEle(3);
	}
}
