package com.hamitmizrak;

// One Way (Clint -Server String examples)
// Client Kullan�c�dan ald��� veriyi Servera g�ndersin
// Server gelen bu data als�n b�y�k harflere ve length hesaplayan algoritma ?

// Unutma:
// 1-)�ncelikle Server'� �al��t�rmal�s�n. Sonra Client'i �al��t�r�yoruz.
// 2-) PSVM ==> Serverda olur.
// 3-) java.net k�t�phanesini import ediyoruz

// Random 49152<=X<=65535
public class _36_Socket_Programming2_oneway_x3_String_Main {
	
	public static void main(String[] args) {
		
		_36_Socket_Programming2_oneway_x1_String_Server server = new _36_Socket_Programming2_oneway_x1_String_Server();
		// server.serverMethod();
		
		_36_Socket_Programming2_oneway_x2_String_Client client = new _36_Socket_Programming2_oneway_x2_String_Client();
		// client.clientMethod();
	}
	
}
