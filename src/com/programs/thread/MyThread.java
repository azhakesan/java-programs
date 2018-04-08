/**
 * 
 */
package com.programs.thread;

/**
 *
 */
public class MyThread extends Thread {

	public void run() {
		System.out.println("---Inside My Thread---");
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread =" + i);
		}
	}

}
