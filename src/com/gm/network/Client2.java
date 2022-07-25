package com.gm.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
	Scanner sc = new Scanner(System.in);

	public void getFood() throws Exception {
		Socket socket = new Socket("192.168.7.45", 8282);
		System.out.println("Server 접속 완료!");

		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;

		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;

		boolean check = true;
		while (check) {
			System.out.println("1. 점심 메뉴");
			System.out.println("2. 저녁 메뉴");
			System.out.println("3. 종     료");
			int select = sc.nextInt();

			os = socket.getOutputStream(); // 0, 1
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);

			bw.write(select + "\r\n");
			bw.flush();

			if (select == 3) {
				break;
			}

			// ========================================
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);

			String message = br.readLine();
			System.out.println(message);
			// ========================================
		} // while 종료

		bw.close();
		ow.close();
		os.close();

		// ------------
		br.close();
		ir.close();
		is.close();
		// ------------

		socket.close();
	}
}

// getFood
// Server 접속 후
// 1. 점심 메뉴
// 2. 저녁 메뉴
// 3. 프로그램 종료
// 번호를 입력 받아서 Server로 전송
// 받아서 출력
