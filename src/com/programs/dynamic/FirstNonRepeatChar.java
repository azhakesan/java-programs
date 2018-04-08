package com.programs.dynamic;

public class FirstNonRepeatChar {
	public static void main(String[] args) {
		String str = "Good Morning";
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char c =str.charAt(i);
			if(str.indexOf(c)== str.lastIndexOf(c)) {
				System.out.println("First Non Repeated char is "+ c);
				break;
			}
		}
	}
}
