/**
 * 
 */
package com.programs.dynamic;

/**
 *
 */
public class ReverseS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "abcde";
		StringBuffer sb = new StringBuffer();
		for (int i = str.length() - 1; i > 0; i--) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb.toString());

		for (int i = 0; i < str.length(); i++) {
			System.out.println("char=" + str.charAt(i));
		}
	}
}
