package com.gm.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
	// DTO : Data Transfer Object
	// DAO : Data Access Object
	// file data에 접근
	StudentDTO DTO = new StudentDTO();

	// 2. setList
	public int setList(ArrayList<StudentDTO> ar) {
		return 0;
		// 예외처리는 내부에서 처리
		// List로 받은 데이터들을 studentData에다가 작성
		// 기존의 내용은 삭제
		// 작성 형식은 기존 내용의 형식과 동일하게
		// 1을 리턴 : 정상적인 성공
		// 0을 리턴 : 예외가 발생 했을 경우
	}
	// 1. getlist
	// studentData 파일의 내용을 읽어서 작업

	public ArrayList<StudentDTO> getlist() throws Exception {
		ArrayList<StudentDTO> ar = new ArrayList<>();
		File file = new File("C:\\study", "studentData.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String str = br.readLine();
		str = br.readLine();
		System.out.println(str);
		String[] info = str.split(",");
		StringTokenizer st = new StringTokenizer(str.concat(","));
		st.nextToken();
		st.nextToken();

		return ar;
	}

//	public void getlist() throws IOException {
//		File file = new File("C:\\study", "studentData.txt");
//
//		FileReader fr = new FileReader(file);
//
//		BufferedReader br = new BufferedReader(fr);
//
//		boolean check = true;
//		while (check) {
//			String name = br.readLine();
//			if (name == null) {
//				break;
//			}
//			System.out.println(name);
//
//		}
//		DTO.getName()
//		
//	}
}
