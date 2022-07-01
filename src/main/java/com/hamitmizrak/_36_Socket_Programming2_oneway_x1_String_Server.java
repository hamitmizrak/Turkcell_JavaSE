package com.hamitmizrak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

// One Way (Cleint -Server String examples)
// Client Servera veri göndersin Server gelen bu data alsýn büyük harflere ve
// length hesaplayan algoritma ?

// Unutma:
// 1-)öncelikle Server'ý çalýþtýrmalýsýn.
// 2-) PSVM ==> Serverda olur.
// java.net

// Önce Server'ý hazýrlamalýyýz.
// Sonra Client'i çalýþtýrýyoruz.

// Random 49152<=X<=65535
public class _36_Socket_Programming2_oneway_x1_String_Server {
	
	// Port
	private static int PORT;
	
	// Override edilmesin
	private static final int randomInt() {
		Random random = new Random();
		int number = random.nextInt(65535) + 1;
		return number;
	}
	
	// Server Method
	private static void serverMethod() {
		try {
			PORT = randomInt();
			System.out.println("Port: " + PORT);
			// java.net.SocketException: Socket is not bound yet: Port eklenmemiþ
			// java.net.BindException: Address already in use: bind : Ayný Portu Tekrar
			// kullandýnýz
			// server: Clienttan gelen veriyi okumasý gerekiyor.
			
			ServerSocket socket = new ServerSocket(PORT);
			Socket successPort = socket.accept();
			System.out.println("Server Hazýr...");
			InputStreamReader inputStreamReader = new InputStreamReader(successPort.getInputStream());
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			// BufferedReader bufferedReader2=new BufferedReader(new InputStreamReader((new
			// ServerSocket(4999).accept().getInputStream())));
			
			// clienttan gelen veriyi almak göstermek
			String str = bufferedReader.readLine();
			System.out.println("Client: " + str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// PSVM
	public static void main(String[] args) {
		serverMethod();
	}
	
}
