package com.gm.util.list;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		//ArrayList<String> ar = new ArrayList();
		ListView listview = new ListView();
		
		ArrayList<String> ar = new ArrayList<>();

		ar.add("first"); // String auto boxing
//		ar.add(2); // Integer auto boxing
//		ar.add('c'); // Character auto boxing
//		ar.add(2.123); // Double auto boxing
		ar.add(null);

		// get -> 특정 인덱스 요소를 반환
		String n1 = (String) ar.get(0);
//		int n2 = (int) ar.get(1);
//		char n3 = (char) ar.get(2);
//		double n4 = (double) ar.get(3);
		
		System.out.println(ar.get(0) instanceof String);

		System.out.println(n1);
//		System.out.println(n2);
//		System.out.println(n3);
//		System.out.println(n4);

		//listview.view(ar);

	}

}
