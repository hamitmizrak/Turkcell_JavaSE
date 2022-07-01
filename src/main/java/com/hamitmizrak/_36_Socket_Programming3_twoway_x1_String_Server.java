package com.hamitmizrak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// Two Way (Clint -Server String examples)
// Client Kullan�c�dan ald��� veriyi Servera g�ndersin
// Client -Server yaz��mas�n� File Yazd�rs�n.

// Unutma:
// 1-)�ncelikle Server'� �al��t�rmal�s�n. Sonra Client'i �al��t�r�yoruz.
// 2-) PSVM ==> Serverda olur.
// 3-) java.net k�t�phanesini import ediyoruz

public class _36_Socket_Programming3_twoway_x1_String_Server {
	
	public static void main(String[] args) {
		String receiveMessage;// mesaj almak
		String sendMessage; // mesa j g�ndersin
		System.out.println("Server Haz�r");
		
		try {
			ServerSocket serverSocket = new ServerSocket(8585);
			Socket socket = serverSocket.accept();
			
			OutputStream outputStream = socket.getOutputStream();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			
			PrintWriter printWriter = new PrintWriter(outputStream, true);
			
			InputStream inputStream = socket.getInputStream();
			BufferedReader receiveRead = new BufferedReader(new InputStreamReader(inputStream));
			
			while (true) {
				if ((receiveMessage = receiveRead.readLine()) != null) {
					System.out.println("CLIENT: " + receiveMessage);
				}
				sendMessage = bufferedReader.readLine();
				printWriter.println(sendMessage);
				printWriter.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
