package com.hamitmizrak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

// Two Way (Clint -Server String examples)
// Client Kullan�c�dan ald��� veriyi Servera g�ndersin
// Client -Server yaz��mas�n� File Yazd�rs�n.

// Unutma:
// 1-)�ncelikle Server'� �al��t�rmal�s�n. Sonra Client'i �al��t�r�yoruz.
// 2-) PSVM ==> Serverda olur.
// 3-) java.net k�t�phanesini import ediyoruz

public class _36_Socket_Programming3_twoway_x2_String_Client {
	
	// de�i�kenler
	private static String receiveMessage;// mesaj almak
	private static String sendMessage; // mesa j g�ndersin
	
	// twoWayClient
	private static void twoWayClient() {
		try {
			Socket socket = new Socket("localhost", 4545);
			
			// Client veri g�nderecek
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter printWriter = new PrintWriter(outputStream, true);
			
			// serverdan gelen veriyi almak
			InputStream inputStream = socket.getInputStream();
			BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
			System.out.println("Client: L�tfen mesaj yaz�n�z ");
			
			while (true) {
				// clientten veri almak
				sendMessage = bufferedReader.readLine();
				printWriter.println(sendMessage);
				printWriter.flush();
				
				if ((receiveMessage = bufferedReader2.readLine()) != null) {
					System.out.println("SERVER: " + receiveMessage);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// PSVM
	public static void main(String[] args) {
		twoWayClient();
	}
}
