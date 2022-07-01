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
// Client Kullanýcýdan aldýðý veriyi Servera göndersin
// Client -Server yazýþmasýný File Yazdýrsýn.

// Unutma:
// 1-)öncelikle Server'ý çalýþtýrmalýsýn. Sonra Client'i çalýþtýrýyoruz.
// 2-) PSVM ==> Serverda olur.
// 3-) java.net kütüphanesini import ediyoruz

public class _36_Socket_Programming3_twoway_x1_String_Server {
	
	// deðiþkenler
	private static String receiveMessage;// mesaj almak
	private static String sendMessage; // mesa j göndersin
	
	// two way Server
	private static void twoWayServer() {
		try {
			System.out.println("Server Hazýr");
			ServerSocket serverSocket = new ServerSocket(4545);
			Socket socket = serverSocket.accept();
			
			OutputStream outputStream = socket.getOutputStream();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			
			PrintWriter printWriter = new PrintWriter(outputStream, true);
			
			InputStream inputStream = socket.getInputStream();
			BufferedReader receiveRead = new BufferedReader(new InputStreamReader(inputStream));
			
			while (true) {
				if ((receiveMessage = receiveRead.readLine()) != null) {
					System.out.println("CLIENT: " + receiveMessage);
					// dosya writer
				}
				sendMessage = bufferedReader.readLine();
				printWriter.println(sendMessage);
				printWriter.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// PSVM
	public static void main(String[] args) {
		twoWayServer();
	}
	
}
