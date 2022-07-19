package com.gm.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx1 {
	Scanner sc = new Scanner(System.in);

	public void PeopleNumber() {
		String number = "";
		String gender = "";
		String season = "";

		System.out.println("하이픈(-)을 포함해서 주민번호를 입력하세요.");
		number = sc.next();

		char ch = number.charAt(7);
		if (ch == '1' || ch == '3') {
			gender = "남성";
		} else if (ch == '2' || ch == '4') {
			gender = "여성";
		}

		int age = Integer.parseInt(number.substring(0, 2));

		if (ch == '1' || ch == '2') {
			age = 2022 - (1900 + age + 1);
		} else if (ch == '3' || ch == '4'){
			age = 2022 - (2000 + age + 1);
		}
		
		
		int month = Integer.parseInt(number.substring(2, 4));
		
		if (month >= 3 && month <= 5) {
			season = "봄";
		} else if (month >= 6 && month <= 8) {
			season = "여름";
		} else if (month >= 9 && month <= 11) {
			season = "가을";
		} else {
			season = "겨울";
		}

		System.out.println("성별: " + gender);
		System.out.println("나이: " + age);
		System.out.println("계절: " + season);
	}
}
// ex1
// 스캐너 - 주민번호 입력
// 1. 남자 or 여자 판단
// 2. 현재 나이
// 3. 3~5 봄, 6~8: 여름, 9~11: 가을, 12~2: 겨울