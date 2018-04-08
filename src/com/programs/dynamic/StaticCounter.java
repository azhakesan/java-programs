package com.programs.dynamic;

public class StaticCounter {
	static int count = 0;

	StaticCounter() {
		System.out.println("Constructor..");
		count++;
	}

	static {
		System.out.println(count);
	}

	public static void main(String[] args) {
		final int a;
		a = 10;
		StaticCounter c = new StaticCounter();
		StaticCounter c1 = new StaticCounter();
		StaticCounter c2 = new StaticCounter();
		System.out.println("Counter" + c2.count);
		System.out.println(a);
	}
}
