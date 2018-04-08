package com.programs.dynamic;

import java.util.Set;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BockedQueueExample {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<String> bq = new LinkedBlockingQueue();
		bq.put(null);
		System.out.println(bq.take());
		// BlockingDeque bd = new BlockingDeque();
		// Set<E>
		
	}
	
}
