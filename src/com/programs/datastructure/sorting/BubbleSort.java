/**
 * 
 */
package com.programs.datastructure.sorting;

/**
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nums[] = new int[5];
		nums[0] = 10;
		nums[1] = 2;
		nums[2] = 5;
		nums[3] = 3;
		nums[4] = 7;
		int len = nums.length;
		int temp = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 1; j < (len - i); j++) {
				if (nums[j - 1] > nums[j]) {
					temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		for (int k = 0; k < nums.length; k++) {
			System.out.print(" " + nums[k]);
		}

	}

}
