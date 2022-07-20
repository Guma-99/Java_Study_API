package com.gm.util.list;

import java.util.ArrayList;

public class ListMain {
	
	public static void main(String args[]) {
		// 1, 2, 3
		int[] nums = new int[3];
		nums[0] = 1;
		
		// 1. List -> ArrayList
		// add
		ArrayList ar = new ArrayList(20);
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(0);
		ar.add(1, "abc");
		
		ListView listView = new ListView();
		listView.view(ar);
		
		// remove - 특정 인덱스 번호의 요소를 삭제
		ar.remove(2);
		ar.remove("abc");
		listView.view(ar);
		
		// set - 특정 인덱스 번호의 요소를 수정
		ar.set(1, 'c');
		
		// clear - 모든 요소를 삭제
		ar.clear();
		listView.view(ar);
	}
}
