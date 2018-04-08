package com.programs.dynamic;

public class FizzBuzz {

	public static void main(String[] args) {
		int c = 100;
		for (int i = 0; i < c; i++) {
			String str = "";
			if (i % 3 == 0) {
				System.out.println(i + " Fizz");
			}  if (i % 5 == 0) {
				System.out.println(i + " Buzz");
			}  if (i % 15 == 0) {
				System.out.println(i + " FizzBuzz");
			}
		}
	}

}
