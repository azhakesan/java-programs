/**
 * 
 */
package com.programs.dynamic;

/**
 *
 */
public class ReverseNumberExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 1230;
		int reverse = 0;
		while (num != 0) {
		//	System.out.println((reverse * 10) + " " + num % 10);
			reverse = (reverse * 10) + num % 10;
			num = num / 10;
			//System.out.println(num);
		}
		System.out.println(reverse);
	}

}
