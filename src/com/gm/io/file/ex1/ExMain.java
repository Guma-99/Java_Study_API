package com.gm.io.file.ex1;

import java.io.IOException;
import java.util.ArrayList;

public class ExMain {

	public static void main(String[] args) {
		StudentDAO DAO = new StudentDAO();
		ArrayList<StudentDTO> ar = null;
		
		try {
			ar = DAO.getlist();
			for(StudentDTO studentDTO: ar) {
				System.out.println(studentDTO.getName());
				System.out.println(studentDTO.getNum());
				System.out.println(studentDTO.getKor());
				System.out.println(studentDTO.getMath());
				System.out.println(studentDTO.getEng());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ar);
	}
}
