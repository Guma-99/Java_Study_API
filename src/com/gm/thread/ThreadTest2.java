package com.gm.thread;

public class ThreadTest2 extends Thread{

	@Override
	public void run() {
		this.getAlpa();
	}
	
	private void getAlpa() {
		for (int i = 'a'; i < 'z' + 1; i++) {
			System.out.println((char) i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
