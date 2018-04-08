package com.programs.dynamic;

public class PolindromeExample {

	public static void main(String[] args) {
		String str = "MADAM";
		int len = str.length();
		boolean polindrome = true;
		for (int i = 0; i < (len / 2); i++) {
			System.out.println(str.charAt(i) + " " + str.charAt(len - i - 1));
			if (str.charAt(i) != str.charAt(len - i - 1)) {
				System.out.println("NOT");
			}
		}
	}

}
