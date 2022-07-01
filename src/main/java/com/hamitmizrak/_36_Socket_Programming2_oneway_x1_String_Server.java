package com.hamitmizrak;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.util.Scanner;

// One Way (Clint -Server String examples)
// Client Kullan�c�dan ald��� veriyi Servera g�ndersin
// Server gelen bu data als�n b�y�k harflere ve length hesaplayan algoritma ?

// Unutma:
// 1-)�ncelikle Server'� �al��t�rmal�s�n. Sonra Client'i �al��t�r�yoruz.
// 2-) PSVM ==> Serverda olur.
// 3-) java.net k�t�phanesini import ediyoruz

// Random 49152<=X<=65535
public class _36_Socket_Programming2_oneway_x1_String_Server {
	
	static _36_Socket_Programming information = new _36_Socket_Programming();
	
	// de�i�kenler
	private static String IP_ADDRESS = information.readDataFile()[0];
	private static int PORT = Integer.valueOf(information.readDataFile()[1]);
	
	// chooise method
	public static int chooise() {
		String originStaticValue = "### Se�im Yap�n�z ###".toUpperCase();
		Scanner klavye = new Scanner(System.in);
		System.out.println(originStaticValue + "\n1-)Dosya yaz\n2-)Dosya Oku \n3-)Server �al��t�r\n4-)��k��");
		return klavye.nextInt();
	}
	
	// mainMethod
	public static void mainMethod() {
		int key = chooise();
		switch (key) {
			case 1:
				System.out.println("Yazma");
				information.writeDataFile();
				break;
			
			case 2:
				System.out.println("Okuma");
				for (String temp : information.readDataFile()) {
					System.out.print(temp + " ");
				}
				System.out.println();
				break;
			case 3:
				System.out.println("Server ");
				serverMethod();
				break;
			
			case 4:
				System.out.println("��k��");
				System.exit(0);
				break;
			
			default:
				System.out.println("Se�im d���nda bir de�er girdiniz....");
				break;
		}
	}
	
	// Server Method
	private static void serverMethod() {
		String clientValue, bigLetter;
		System.out.println("Server Haz�r...");
		
		// java.net.SocketException: Socket is not bound yet: Port eklenmemi�
		// java.net.BindException: Address already in use: bind : Ayn� Portu Tekrar
		// kulland�n�z
		// server: Clienttan gelen veriyi okumas� gerekiyor.
		
		System.out.println("Port: " + PORT);
		System.out.println("�paddres: " + IP_ADDRESS);
		
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(PORT).accept().getInputStream())) {
			clientValue = dataInputStream.readUTF();
			bigLetter = clientValue.toUpperCase();
			System.out.println(bigLetter + " Harf Say�s�: " + bigLetter.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// PSVM
	public static void main(String[] args) {
		for (;;) {
			mainMethod();
		}
		
	}
	
}
