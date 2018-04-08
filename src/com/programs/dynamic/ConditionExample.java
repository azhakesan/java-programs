package com.programs.dynamic;

public class ConditionExample {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "Hello";

		String str3 = new String("World");
		String str4 = new String("World");
		System.out.println(str3);
		if (str1 == str2) {
			System.out.println("True");
		}
		if (str3.equals(str4)) {
			System.out.println("str3 = str4 True");
		}
	}

	private static void comparsion() {
		System.out.println(3 * 0.1);
		if (3 * 0.1 == 0.3) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}
	}

}
