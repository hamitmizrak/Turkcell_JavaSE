package com.hamitmizrak;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.util.Random;

// One Way (Clint -Server String examples)
// Client Kullan�c�dan ald��� veriyi Servera g�ndersin
// Server gelen bu data als�n b�y�k harflere ve length hesaplayan algoritma ?

// Unutma:
// 1-)�ncelikle Server'� �al��t�rmal�s�n. Sonra Client'i �al��t�r�yoruz.
// 2-) PSVM ==> Serverda olur.
// 3-) java.net k�t�phanesini import ediyoruz

// Random 49152<=X<=65535
public class _36_Socket_Programming2_oneway_x1_String_Server {
	
	// Port
	static int PORT;
	static String ipAddress = "localhost"; // 127.0.0.1
	
	// Override edilmesin
	private static final int randomInt() {
		Random random = new Random();
		int number = random.nextInt(65535) + 1;
		return number;
	}
	
	// Server Method
	private static void serverMethod() {
		String clientValue, bigLetter;
		System.out.println("Server Haz�r...");
		
		// java.net.SocketException: Socket is not bound yet: Port eklenmemi�
		// java.net.BindException: Address already in use: bind : Ayn� Portu Tekrar
		// kulland�n�z
		// server: Clienttan gelen veriyi okumas� gerekiyor.
		PORT = randomInt();
		System.out.println("Port: " + 6363);
		
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(6363).accept().getInputStream())) {
			clientValue = dataInputStream.readUTF();
			bigLetter = clientValue.toUpperCase();
			System.out.println();
			System.out.println(bigLetter + " Harf Say�s�: " + bigLetter.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		serverMethod();
	}
	
}
