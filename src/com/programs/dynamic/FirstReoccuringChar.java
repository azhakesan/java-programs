package com.programs.dynamic;

import java.util.HashSet;

/**
 * 
 * Using HashSet find the first repeated char in given string
  * Another option using HashMap
 *
 */
public class FirstReoccuringChar {

	public static void main(String[] args) {
		String str = "DBCABA";
		char[] charArr = str.toCharArray();
		HashSet<Character> hs = new HashSet<>();
		for (char c : charArr) {
			if (hs.contains(c)) {
				System.out.println("First Repeated Char is=" + c);
				break;
			} else {
				hs.add(c);
			}
		}
	}

}
