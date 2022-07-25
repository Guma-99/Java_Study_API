package com.gm.network;

public class ClientMain {

	public static void main(String[] args) {
		Client1 c1 = new Client1();
		Client2 c2 = new Client2();
		
		System.out.println("Clinet Start");
		
		try {
			//c1.send();
			c2.getFood();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Client Finish");

	}

}
