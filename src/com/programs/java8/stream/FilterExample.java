package com.programs.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		int i = 0;
		while (i < 100000) {
			list.add(i);
			list1.add(i);
			i++;
		}
		System.out.println("list size=" + list.size());
		// Stream Filter
		long startTime = System.currentTimeMillis();
		List<Integer> streamFilter = list.stream()
				.filter(value -> value % 2 == 0).collect(Collectors.toList());
		System.out.println("Time Taken ="
				+ (System.currentTimeMillis() - startTime));
		System.out.println("Stream Filter = " + streamFilter.size());
		// Parallel stream filter
		long secondTimer = System.currentTimeMillis();
		List<Integer> parallelStream = list.stream().parallel()
				.filter(value -> value % 2 == 0).collect(Collectors.toList());
		System.out.println("Time Taken ="
				+ (System.currentTimeMillis() - secondTimer));
		System.out.println("Parallel Steam Filter = " + parallelStream.size());
	}
}
