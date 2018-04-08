package com.programs.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		List<Integer> twoEvenSquares = numbers.stream().filter(l -> l % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(twoEvenSquares);
		String str = "AL";
		// System.out.println(str.toCharArray()[0]);
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add(i + "");
		}
		System.out.println(list.stream());
		try {
			System.out.println("One");
		}finally {
			System.out.println("Two");
		}
	}
	public static void m1() {
		
	}

}
