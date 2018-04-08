package com.programs.thread;

public class ThreadDemoRunnable {

	public static void main(String[] args) {
		Runnable t1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child Thread=" + 1);
				}

			}
		};
		t1.run();
	}

}
