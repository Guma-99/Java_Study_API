package com.gm.thread;

public class ThreadTest1 extends Thread {
	
	@Override
	public void run() {
		super.run();
	}
	
	private void getNum() {
		for (int i = 0; i < 25; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500); // 500 = 0.5초 / 1000 = 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
