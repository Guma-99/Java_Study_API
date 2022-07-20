package com.gm.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	Scanner sc = new Scanner(System.in);

	public void start() {
		ArrayList<CityDTO> ar = new ArrayList<>();
		WeatherView wv = new WeatherView();
		boolean check = true;

		while (check) {
			System.out.println("1. 초기화 2. 출력 3. 검색 4. 추가 5. 삭제 6. 종료");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("=====날씨 정보 초기화=====");
				break;
			case 2:
				System.out.println("=====전국 날씨 출력=====");
				wv.view(ar);
				break;
			case 3:
				System.out.println("=====지역 날씨 검색=====");
				break;
			case 4:
				System.out.println("=====지역 정보 추가=====");
				break;
			case 5:
				System.out.println("=====지역 정보 삭제=====");
				break;
			case 6:
				System.out.println("=====프로그램 종료=====");
				check = !check;

			}
		}
	}
}

//WeatherController
//start
//1. 날씨 정보 초기화
//2. 전국 날씨 출력
//3. 지역 날씨 검색
//4. 지역 정보 추가
//5. 지역 정보 삭제
//6. 프로그램 종료