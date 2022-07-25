package com.gm.thread;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadTest1 t1 = new ThreadTest1();
		ThreadTest2 t2 = new ThreadTest2();
		Thread t = new Thread(t2);
		
		t1.start();
		t.start();
	}
}
