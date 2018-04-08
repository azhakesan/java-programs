package com.programs.conncurrent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;

public class ConncurrentMapExample {

	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> ch = new ConcurrentHashMap<String, Integer>();
		ch.put("one", 1);
		ch.put("two", 2);
		ch.put("three", 3);
		ch.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});
		Predicate p = (x) -> {
			return true;
		};
		
		//Function f =
	}

}
