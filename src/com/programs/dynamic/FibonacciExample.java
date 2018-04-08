package com.programs.dynamic;

public class FibonacciExample {

	public static void main(String[] args) {
		int n = 15;
		int feb[] = new int[n];
		feb[0] = 0;
		feb[1] = 1;
		for (int i = 2; i < n; i++) {
			feb[i] = feb[i - 1] + feb[i - 2];
			System.out.println(feb[i] + " " + feb[i - 1] + " " + feb[i - 2]);
		}
		for (int i = 0; i < n; i++) {
			System.out.print(feb[i] + " ");
		}
	}
}