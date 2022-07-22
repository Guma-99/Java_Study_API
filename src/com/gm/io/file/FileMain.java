package com.gm.io.file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		// File : 파일이나 폴더의 정보를 담는 클래스
		// : 실제 파일이나 폴더가 없을 수도 있음
		File file = new File("C:\\study\\test.txt");
		file = new File("C:\\study", "test.txt"); // parent : 폴더 //Chile : 파일명 또는 최종 폴더명

		// 1. 폴더명 경로가 있는 File객체를 이용
		File path = new File("C:\\study");
		file = new File(path, "test.txt");

		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.length()); // 파일 크기

		System.out.println("=================================");

		System.out.println(path.exists());
		System.out.println(path.isFile());
		System.out.println(path.isDirectory());

		file = new File("C:\\study\\sub");

		if (!file.exists()) {
			file.mkdir();
		}

		File file2 = new File("C:\\study\\sub2\\t1");
		// file.mkdir(); // t1을 최종적으로 생성하는건데 중간에 파일이 없으면 생성x
		file2.mkdirs();

		// file.delete();

		file2.delete();
		File file3 = new File("C:\\study\\sub2"); // 삭제할려면 내부가 비어있어야 된다.
		file3.delete();

	}
}
