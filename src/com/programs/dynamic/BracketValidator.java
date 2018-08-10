package com.programs.dynamic;

import java.util.Stack;

public class BracketValidator {

	public static void main(String[] args) {
		System.out.println(validateBracket("{}"));

	}

	private static boolean validateBracket(String str) {
		Stack<Character> stack = null;
		if (str != null) {
			stack = new Stack<Character>();
			int len = str.length();
			for (int i = 0; i < len; i++) {
				if(!stack.contains(str.charAt(i))){
					stack.push(str.charAt(i));	
				}
				System.out.println(stack.pop());
				
			}
		}
		return false;
	}

}
