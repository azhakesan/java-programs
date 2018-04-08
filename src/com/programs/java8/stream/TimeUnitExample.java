/**
 * 
 */
package com.programs.java8.stream;

import java.util.concurrent.TimeUnit;

/**
 *
 */
public class TimeUnitExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println("Hi");
			TimeUnit.MILLISECONDS.sleep(1000);
			System.out.println("Hello");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
