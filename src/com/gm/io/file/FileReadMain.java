package com.gm.io.file;

public class FileReadMain {
	
	public static void main(String[] args) {
		FileRead fr = new FileRead();
		FileWrite fw = new FileWrite();
		
		try {
			fr.read();
			fw.Write();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
