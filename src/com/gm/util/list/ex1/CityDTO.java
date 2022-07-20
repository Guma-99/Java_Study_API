package com.gm.util.list.ex1;

public class CityDTO {
	// 도시의 날씨 정보
	private String name; // 도시명
	private double gion; // 기온정보 31.2
	private int hum; // 습도정보 80
	private String status; // 맑음, 비, 눈, 태풍

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGion() {
		return gion;
	}

	public void setGion(double gion) {
		this.gion = gion;
	}

	public int getHum() {
		return hum;
	}

	public void setHum(int hum) {
		this.hum = hum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

//WeatherService
//init 메서드
//sb에 있는 Data들을 파싱해서 CityDTO에 담아서 리턴

//add 메서드
//City정보를 입력받아서 추가 - 도시명, 기온, 습도, 날씨

//remove 메서드
//도시명을 입력 받아서 리스트에서 삭제

//find 메서드
//도시명을 입력 받아서 리스트에서 검색 리턴

//WeatherView
//view
//리스트를 받아서 모든 정보 출력
//view
//city 하나를 받아서 모든 정보 출력
//view
//메시지(String) 하나를 받아서 출력

//WeatherController
//start
//1. 날씨 정보 초기화
//2. 전국 날씨 출력
//3. 지역 날씨 검색
//4. 지역 정보 추가
//5. 지역 정보 삭제
//6. 프로그램 종료
