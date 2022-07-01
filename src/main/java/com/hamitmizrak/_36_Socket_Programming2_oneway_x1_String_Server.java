package com.hamitmizrak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

// One Way (Cleint -Server String examples)
// Client Servera veri g�ndersin Server gelen bu data als�n b�y�k harflere ve
// length hesaplayan algoritma ?

// Unutma:
// 1-)�ncelikle Server'� �al��t�rmal�s�n.
// 2-) PSVM ==> Serverda olur.
// java.net

// �nce Server'� haz�rlamal�y�z.
// Sonra Client'i �al��t�r�yoruz.

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
			// java.net.SocketException: Socket is not bound yet: Port eklenmemi�
			// java.net.BindException: Address already in use: bind : Ayn� Portu Tekrar
			// kulland�n�z
			// server: Clienttan gelen veriyi okumas� gerekiyor.
			
			ServerSocket socket = new ServerSocket(PORT);
			Socket successPort = socket.accept();
			System.out.println("Server Haz�r...");
			InputStreamReader inputStreamReader = new InputStreamReader(successPort.getInputStream());
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			// BufferedReader bufferedReader2=new BufferedReader(new InputStreamReader((new
			// ServerSocket(4999).accept().getInputStream())));
			
			// clienttan gelen veriyi almak g�stermek
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
