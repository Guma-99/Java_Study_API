package com.gm.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Server2 {
	private ArrayList<String> lunch;
	private ArrayList<String> dinner;

	public void getFood() throws Exception {
		lunch = new ArrayList<>();
		dinner = new ArrayList<>();

		lunch.add("자장면");
		lunch.add("라  면");
		lunch.add("햄버거");
		lunch.add("피  자");
		lunch.add("굶  어");

		dinner.add("삼겹살");
		dinner.add("치  킨");
		dinner.add("샐러드");
		dinner.add("볶음밥");
		dinner.add("쉐이크");

		Scanner sc = new Scanner(System.in);

		ServerSocket serverSocket = new ServerSocket(8282);

		// 서버 오픈하고, Client 접속을 기다림
		System.out.println("Client 접속 기다리는 중...");

		// Socket : 상대방과 1:1 통신
		Socket socket = serverSocket.accept();
		System.out.println("Client 접속 완료!");

		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;

		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;

		boolean check = true;

		while (check) {
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			String message = br.readLine();

			int select = Integer.parseInt(message);

			Random random = new Random(Calendar.getInstance().getTimeInMillis());

			if (select == 1) {
				int index = random.nextInt(lunch.size());
				message = lunch.get(index);
			} else if (select == 2) {
				int index = random.nextInt(dinner.size());
				message = dinner.get(index);
			} else if (select == 3) {
				break;
			} else {
				message = "잘못 입력된 번호입니다.";
			}

			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);

			bw.write(message + "\r\n");
			bw.flush();

		} // while 종료

		br.close();
		ir.close();
		is.close();

		// --------------------------
		bw.close();
		ow.close();
		os.close();
		// -----------------------------
		serverSocket.close();
		socket.close();

	}
}

// getFood
// Server 메시지를 기다림
// 1 : 점심 메뉴 중 랜덤하게 하나를 Client 전송
// 2 : 저녁 메뉴 중 랜덤하게 하나를 Client 전송
// 3 : 프로그램 종료
// 그 외 나머지 : 잘못 입력된 번호입니다. 출력