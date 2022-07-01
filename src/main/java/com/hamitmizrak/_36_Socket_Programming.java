package com.hamitmizrak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

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
	
	private String ippAddress = "localhost"; // 127.0.0.1
	private String port = "8888";
	
	private static final String MY_PATH = "C:\\turkcell\\Socket.txt";
	
	// Method Random
	private int randomInt() {
		Random random = new Random();
		return random.nextInt(65535) + 0;
	}
	
	/////// write method
	public void writeDataFile() {
		System.out.println("*** Dosya Yaz ***");
		Scanner klavye = new Scanner(System.in);
		_36_Socket_Programming socketInformation = new _36_Socket_Programming();
		System.out.println("ip address yaz�n�z");
		socketInformation.setIppAddress(klavye.nextLine());
		System.out.println("port");
		socketInformation.setPort(klavye.nextLine());
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(MY_PATH, true))) {
			bufferedWriter.write(socketInformation.getIppAddress() + " " + socketInformation.getPort() + "\n");
			bufferedWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//////// read method
	public String[] readDataFile() {
		String[] dizi = null;
		StringBuilder builder = null;
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(MY_PATH))) {
			builder = new StringBuilder();
			String satir = "";
			while ((satir = bufferedReader.readLine()) != null) {
				builder.append(satir);
			}
		} catch (Exception e) {
			System.out.println("Okumada sorun olu�tu");
			e.printStackTrace();
		}
		dizi = builder.toString().split(" ");
		return dizi;
	}
	
	// getter and setter
	
	public void setIppAddress(String ippAddress) {
		this.ippAddress = ippAddress;
	}
	
	public String getPort() {
		return port;
	}
	
	public void setPort(String port) {
		this.port = port;
	}
	
	public String getIppAddress() {
		return ippAddress;
	}
	
}
