package com.programs.desginpattern;

public final class SingleTonExample {
	private static final SingleTonExample obj = null;

	private SingleTonExample() {

	}

	public static synchronized SingleTonExample getInstance() {
		synchronized (SingleTonExample.class) {
			if (obj != null) {
				return obj;
			} else {
				return new SingleTonExample();
			}
		}
	}

}
