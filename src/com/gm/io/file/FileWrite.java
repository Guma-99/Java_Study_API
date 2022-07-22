package com.gm.io.file;

import java.io.File;
import java.io.FileWriter;

public class FileWrite {
	
	public void Write() throws Exception{
		File file = new File("C:\\study", "test.txt");
		FileWriter fw = new FileWriter(file, true);
		
		fw.write("오늘은 금요일\r\n");

		fw.write("내일은 토요일\r\n");
		fw.flush();
		
	}
}
