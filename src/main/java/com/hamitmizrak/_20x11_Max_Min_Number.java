package com.hamitmizrak;

import java.util.Scanner;

public class _20x11_Max_Min_Number {
	public static void main(String[] args) {
		
		// kullanıcıdan alınan iki sayı için en büyüğünü bulan algoritma ?
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int number = klavye.nextInt();
		String result = (number > 0) ? "pozitif sayıdır" : "negatif sayıdır";
		System.out.println(result);
		
	}
}
