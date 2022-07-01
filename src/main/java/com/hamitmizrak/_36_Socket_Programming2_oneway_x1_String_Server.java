package com.hamitmizrak;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.util.Scanner;

// One Way (Clint -Server String examples)
// Client Kullanýcýdan aldýðý veriyi Servera göndersin
// Server gelen bu data alsýn büyük harflere ve length hesaplayan algoritma ?

// Unutma:
// 1-)öncelikle Server'ý çalýþtýrmalýsýn. Sonra Client'i çalýþtýrýyoruz.
// 2-) PSVM ==> Serverda olur.
// 3-) java.net kütüphanesini import ediyoruz

// Random 49152<=X<=65535
public class _36_Socket_Programming2_oneway_x1_String_Server {
	
	static _36_Socket_Programming information = new _36_Socket_Programming();
	
	// deðiþkenler
	private static String IP_ADDRESS = information.readDataFile()[0];
	private static int PORT = Integer.valueOf(information.readDataFile()[1]);
	
	// chooise method
	public static int chooise() {
		String originStaticValue = "### Seçim Yapýnýz ###".toUpperCase();
		Scanner klavye = new Scanner(System.in);
		System.out.println(originStaticValue + "\n1-)Dosya yaz\n2-)Dosya Oku \n3-)Server Çalýþtýr\n4-)Çýkýþ");
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
				System.out.println("Çýkýþ");
				System.exit(0);
				break;
			
			default:
				System.out.println("Seçim dýþýnda bir deðer girdiniz....");
				break;
		}
	}
	
	// Server Method
	private static void serverMethod() {
		String clientValue, bigLetter;
		System.out.println("Server Hazýr...");
		
		// java.net.SocketException: Socket is not bound yet: Port eklenmemiþ
		// java.net.BindException: Address already in use: bind : Ayný Portu Tekrar
		// kullandýnýz
		// server: Clienttan gelen veriyi okumasý gerekiyor.
		
		System.out.println("Port: " + PORT);
		System.out.println("Ýpaddres: " + IP_ADDRESS);
		
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(PORT).accept().getInputStream())) {
			clientValue = dataInputStream.readUTF();
			bigLetter = clientValue.toUpperCase();
			System.out.println(bigLetter + " Harf Sayýsý: " + bigLetter.length());
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
