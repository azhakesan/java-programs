/**
 * 
 */
package com.programs.java8.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 */
public class MapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stream<Integer> strm = Stream.of(1, 2, 3, 4, 5);
		List<Integer> intList = strm.map(s -> {
			return s * 2;
		}).collect(Collectors.toList());
		System.out.println(intList);

	}

}
