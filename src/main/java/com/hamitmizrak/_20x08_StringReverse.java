package com.hamitmizrak;

import java.util.Scanner;

public class _20x08_StringReverse {
	
	// kullanıcı tarafından girilen bir kelimeyi tersten yazdıran Algoritma ?
	// yazdığınız kelime kaç harfli ?
	// Hamit ==> timaH
	
	// kullanıcıdan alınan data
	public String scannerValueData() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("+++++++++++\nbir seyler giriniz");
		String value = klavye.nextLine();
		return value;
	}
	
	// girilen kelimeyi tersten yazdıran
	public String stringReverse() {
		String temp = ""; // nullPointerException
		try {
			String data = scannerValueData();
			// i=i-1 , i=-1 , i--
			for (int i = data.length() - 1; i >= 0; i--) {
				temp = temp + data.charAt(i);
			}
			System.out.println(temp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return temp;
	}
	
	// main method
	public static void main(String[] args) {
		for (;;) {
			_20x08_StringReverse reverse = new _20x08_StringReverse();
			reverse.stringReverse();
		}
	}
	
}
