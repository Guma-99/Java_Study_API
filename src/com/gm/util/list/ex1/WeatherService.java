package com.gm.util.list.ex1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {
	Scanner sc = new Scanner(System.in);
	private StringBuffer sb;

	public WeatherService() {
		sb = new StringBuffer();

		sb.append("Seoul, 30.2, 70, 맑음");
		sb.append("Daegu-38.9-90-흐림");
		sb.append("Jeju, 12.1, 10, 눈");
		sb.append("Busan-0.5-85-태풍");
	}

	public void init(ArrayList<CityDTO> ar) {
		String data = sb.toString();
		data  = data.replace("-", ",");
		
		StringTokenizer st = new StringTokenizer(data, ",");
		
		while(st.hasMoreTokens()) {
			CityDTO cityDTO = new CityDTO();
			cityDTO.setName(st.nextToken());
			cityDTO.setGion(Double.parseDouble(st.nextToken()));
			cityDTO.setHum(Integer.parseInt(st.nextToken()));
			cityDTO.setStatus(st.nextToken());
			ar.add(cityDTO);
		}
	}

	public void add(ArrayList<CityDTO> ar) {
		CityDTO cityDTO = new CityDTO();
		System.out.println("도시명 입력");
		cityDTO.setName(sc.next());
		System.out.println("기온 입력");
		cityDTO.setGion(sc.nextDouble());
		System.out.println("습도 입력");
		cityDTO.setHum(sc.nextInt());
		System.out.println("날씨 입력");
		cityDTO.setStatus(sc.next());
		ar.add(cityDTO);
	}
	
	private void remove(ArrayList<CityDTO> ar) {
		System.out.println("삭제하려는 도시명");

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