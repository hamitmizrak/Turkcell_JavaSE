package com.hamitmizrak;

import java.io.DataInputStream;
import java.net.ServerSocket;

// One Way (Clint -Server String examples)
// Client Kullanýcýdan aldýðý veriyi Servera göndersin
// Server gelen bu data alsýn büyük harflere ve length hesaplayan algoritma ?

// Unutma:
// 1-)öncelikle Server'ý çalýþtýrmalýsýn. Sonra Client'i çalýþtýrýyoruz.
// 2-) PSVM ==> Serverda olur.
// 3-) java.net kütüphanesini import ediyoruz

// Random 49152<=X<=65535
public class _36_Socket_Programming2_oneway_x1_String_Server {
	
	// Server Method
	private static void serverMethod() {
		String clientValue, bigLetter;
		System.out.println("Server Hazýr...");
		
		// java.net.SocketException: Socket is not bound yet: Port eklenmemiþ
		// java.net.BindException: Address already in use: bind : Ayný Portu Tekrar
		// kullandýnýz
		// server: Clienttan gelen veriyi okumasý gerekiyor.
		
		System.out.println("Port: " + _36_Socket_Programming.PORT);
		
		try (DataInputStream dataInputStream = new DataInputStream(
				new ServerSocket(_36_Socket_Programming.PORT).accept().getInputStream())) {
			clientValue = dataInputStream.readUTF();
			bigLetter = clientValue.toUpperCase();
			System.out.println();
			System.out.println(bigLetter + " Harf Sayýsý: " + bigLetter.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		serverMethod();
	}
	
}
