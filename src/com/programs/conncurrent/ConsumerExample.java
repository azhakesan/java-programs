package com.programs.conncurrent;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> cs = (x) -> {
			System.out.println(x);
		};
		cs.accept("Hello..!");

	}
}
