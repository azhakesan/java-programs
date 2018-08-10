package com.programs.dynamic;

import java.util.Hashtable;

public class FizzBuzz {

	public static void main(String[] args) {
		int c = 100;
		for (int i = 1; i <= c; i++) {
			if (i % 15 == 0) {
				System.out.println(i + " FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println(i + " Fizz");
			} else if (i % 5 == 0) {
				System.out.println(i + " Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
