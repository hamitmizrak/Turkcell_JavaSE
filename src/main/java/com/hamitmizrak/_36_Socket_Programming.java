package com.hamitmizrak;

import java.util.Random;

public class _36_Socket_Programming {
	// Daðýtýk Programlama (distributed System) :Ayný networkteki bilgisayarlarýn
	// birbiriyle haberleþmesine denilir.
	// Senkron : Ayný anda tek bir iþlem yapabilme yeteneðidir.
	// Senkron : Ayný anda birden fazla iþlem yapabilme yeteneðidir.
	// TCP/IP UDP (Client:istemci(Hizmet alan) Server:Hizmet veren :
	// TCP/IP ~ UDP ==> Aðdaki Bilgisayarlarýn birbiriyle haberleþmesini saðlayan
	// protokol adýdýr.
	
	// TCP/IP ile UDP arasýndaki farklar
	// TCP/IP: güvenli ,karþý tarafa data gidip gitmediðini kontrol eder. Yavaþtýr.
	// UDP:güvensizdir,karþý tarafa data gidip gitmediðini kontrol etmeezzzzzz.
	// Hýzlýdýr. Canlý Live Stream (Online system)
	
	// RPC > RMI(Java): Remote Method Invocation: Farklý sunuculardaki metotlarý
	// çaðýrýp iþlem
	// yapýlmasý durumudur.
	
	// 2^16=65536 port sayýsý (Kapý)
	// 0<=X<=1023 (Well-Know-Port)
	// SSH:22
	// FTP:20
	// HTTP:80, 443
	
	// 1024<=Y<=49151 ( Registered Port):sabitlenmiþ
	// Mongo: 27017
	// Postgresql:5432
	// Mysql:3306
	
	// 49152<=X<=65535 Dynamic Port
	
	public static int PORT = 9696;
	public static String ipAddress = "localhost"; // 127.0.0.1
	
	// Override edilmesin
	private static int randomInt() {
		Random random = new Random();
		int number = random.nextInt(65535) + 1;
		return number;
	}
	
	public _36_Socket_Programming() {
		
	}
	
	public static void main(String[] args) {
		System.out.println(Math.pow(2, 16)); // 65536 port
		//
	}
	
}
