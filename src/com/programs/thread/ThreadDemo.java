package com.programs.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread" + i);
		}
	}
}
