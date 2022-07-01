package com.hamitmizrak;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

// One Way (Clint -Server String examples)
// Client Kullanýcýdan aldýðý veriyi Servera göndersin
// Server gelen bu data alsýn büyük harflere ve length hesaplayan algoritma ?

// Unutma:
// 1-)öncelikle Server'ý çalýþtýrmalýsýn. Sonra Client'i çalýþtýrýyoruz.
// 2-) PSVM ==> Serverda olur.
// 3-) java.net kütüphanesini import ediyoruz

// Random 49152<=X<=65535
public class _36_Socket_Programming2_oneway_x2_String_Client {
	
	// Client Method
	private static void clientMethod() {
		
		// port
		int serverPort = _36_Socket_Programming2_oneway_x1_String_Server.PORT;
		
		// ipaddres
		String ipaddress = _36_Socket_Programming2_oneway_x1_String_Server.ipAddress;
		
		// kullanýcýdan alacaðým veri
		String vocabulary = JOptionPane.showInputDialog("Lütfen birþeyler yazýnýz");
		
		try (DataOutputStream dataOutputStream = new DataOutputStream(new Socket(ipaddress, 6363).getOutputStream())) {
			dataOutputStream.writeUTF(vocabulary);
		} catch (IOException e) {
			System.out.println("Client Method IOException Error ");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Client Method Error ");
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		clientMethod();
	}
	
}
