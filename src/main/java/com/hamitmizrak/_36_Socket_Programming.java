package com.hamitmizrak;

public class _36_Socket_Programming {
	// Da��t�k Programlama (distributed System) :Ayn� networkteki bilgisayarlar�n
	// birbiriyle haberle�mesine denilir.
	// Senkron : Ayn� anda tek bir i�lem yapabilme yetene�idir.
	// Senkron : Ayn� anda birden fazla i�lem yapabilme yetene�idir.
	// TCP/IP UDP (Client:istemci(Hizmet alan) Server:Hizmet veren :
	// TCP/IP ~ UDP ==> A�daki Bilgisayarlar�n birbiriyle haberle�mesini sa�layan
	// protokol ad�d�r.
	
	// TCP/IP ile UDP aras�ndaki farklar
	// TCP/IP: g�venli ,kar�� tarafa data gidip gitmedi�ini kontrol eder. Yava�t�r.
	// UDP:g�vensizdir,kar�� tarafa data gidip gitmedi�ini kontrol etmeezzzzzz.
	// H�zl�d�r. Canl� Live Stream (Online system)
	
	// RPC > RMI(Java): Remote Method Invocation: Farkl� sunuculardaki metotlar�
	// �a��r�p i�lem
	// yap�lmas� durumudur.
	
	// 2^16=65536 port say�s� (Kap�)
	// 0<=X<=1023 (Well-Know-Port)
	// SSH:22
	// FTP:20
	// HTTP:80, 443
	
	// 1024<=Y<=49151 ( Registered Port):sabitlenmi�
	// Mongo: 27017
	// Postgresql:5432
	// Mysql:3306
	
	// 49152<=X<=65535 Dynamic Port
	
	public static void main(String[] args) {
		System.out.println(Math.pow(2, 16)); // 65536 port
		//
	}
	
}
