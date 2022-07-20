package com.gm.util.list.ex1;

import java.util.ArrayList;

public class WeatherMain {

	public static void main(String args[]) {
		WeatherController wc = new WeatherController();
		WeatherService ws = new WeatherService();
		WeatherView wv = new WeatherView();
		CityDTO cityDTO = new CityDTO();
		
		cityDTO.setName("A");
		cityDTO.setGion(33);
		cityDTO.setHum(70);
		cityDTO.setStatus("맑음");
		
		CityDTO cityDTO2 = new CityDTO();
		
		cityDTO2.setName("B");
		cityDTO2.setGion(14);
		cityDTO2.setHum(77);
		cityDTO2.setStatus("장마");
		
		ArrayList<CityDTO> ar = new ArrayList<>();
		ar.add(cityDTO);
		ar.add(cityDTO2);
		
		ws.add(ar);
		
		wv.view(ar);
		
		
		
		//wc.start();
		
	}
}

// 1. 클래스의 역할과 메서드의 역할, 변수의 역할 파악
// WeatherMain		 : 프로그램 실행, Test
// WeatherService	 : Data 가공 
// WeatherView		 : 정보 출력 
// WeatherController : 관리(?)
// CityDTO			 : Data(가방같은 개념)