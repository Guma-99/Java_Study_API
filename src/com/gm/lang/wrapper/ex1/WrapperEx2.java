package com.gm.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx2 {
	Scanner sc = new Scanner(System.in);

	public void JuminCheck() {
		String number = "";

		System.out.println("하이픈(-)을 포함해서 주민번호를 입력하세요.");
		number = sc.next();

		int add = Integer.parseInt(number.substring(0, 6));

		//System.out.println(add);
		//char ch = number.charAt(0);
		//System.out.println(ch);

		for (int i = 0; i < 6; i++) {
			char ch = number.charAt(i);
			System.out.print(ch);
			
		}
	}
}

// juminCheck
// 주민번호 입력
// 9	7	1	1	2	4	-	1	2	3	4	5	6	7
//*2	3	4	5	6	7		8	9	2	3	4	5
//+18	21	4	5	12	28		8	18	6	12	20	30
// 총합: 192

// 총합을 11로 나누어서 나머지를 구함
// 192 / 11 -> 몫: 17 나머지: 5

// 나머지를 11에서 뺀 결과를 체크용 번호와 같은지 비교
// 11 - 0 = 11

// 만약에 위의 연산 결과가 두자리라면
// 연산결과를 다시 10으로 나눈 나머지와 체크용번호를 비교
// 11 / 10 -> 나머지: 1