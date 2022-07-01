package com.hamitmizrak;

// One Way (Clint -Server String examples)
// Client Kullanýcýdan aldýðý veriyi Servera göndersin
// Server gelen bu data alsýn büyük harflere ve length hesaplayan algoritma ?

// Unutma:
// 1-)öncelikle Server'ý çalýþtýrmalýsýn. Sonra Client'i çalýþtýrýyoruz.
// 2-) PSVM ==> Serverda olur.
// 3-) java.net kütüphanesini import ediyoruz

// Random 49152<=X<=65535
public class _36_Socket_Programming2_oneway_x3_String_Main {
	
	public static void main(String[] args) {
		
		_36_Socket_Programming2_oneway_x1_String_Server server = new _36_Socket_Programming2_oneway_x1_String_Server();
		// server.serverMethod();
		
		_36_Socket_Programming2_oneway_x2_String_Client client = new _36_Socket_Programming2_oneway_x2_String_Client();
		// client.clientMethod();
	}
	
}
