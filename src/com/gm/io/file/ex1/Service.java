package com.gm.io.file.ex1;

import java.util.ArrayList;

public interface Service {

	public ArrayList<StudentDTO> getList() throws Exception;
	// studentDAO에서 getList를 호출하고 총점과 평균을 각각
	// 계산하고 대입하고 그 List를 리턴

	public int setList(ArrayList<StudentDTO> ar) throws Exception;
	// StudentDAO의 setList를 호출하고
	// 그 결과를 리턴

	public StudentDTO getStudent(ArrayList<StudentDTO> ar) throws Exception;
	// 찾을려고 하는 학생의 번호를 입력 받아서
	// 찾은 학생을 리턴

	public int SetStudentDelete(ArrayList<StudentDTO> ar) throws Exception;
	// 삭제하려는 학생의 번호를 입력 받아서
	// 번호와 일치하는 학생의 정보를 삭-제
	// 삭제가 성공하면 1 리턴 | 실패하면 0 리턴
	
	public void SetStudentAdd(ArrayList<StudentDTO> ar) throws Exception;
	// 학생 한명을 추가

}
