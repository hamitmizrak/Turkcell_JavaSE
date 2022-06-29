package com.hamitmizrak;

import java.util.Scanner;

public class _22_Method {
	
	// voidliParametresiz
	public static void voidliParametresiz() {
		System.out.println("Voidli Parametresiz");
	}
	
	// voidliParametreli
	// Parametre ==> int count
	public static void voidliParametreli(int count) {
		System.out.println("Voidli Parametreli: " + count);
	}
	
	// voidsizParametresiz
	public static int voidsizParametresiz() {
		int sayi1 = 4, sayi2 = 5, toplam = 0;
		toplam = sayi1 + sayi2;
		return toplam;
	}
	
	// voidsizParametreli
	public static int voidsizParametreli(int number1, int number2) {
		int toplam = 0;
		toplam = number1 + number2;
		return toplam;
	}
	
	// Overloading: aynı metot isimleri olacak ancak parametre türü ve sayısı farklı
	// olacak
	public static int voidsizParametreli(int number1) {
		int toplam = 0;
		toplam = number1;
		return toplam;
	}
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		// voidliParametresiz();
		
		// System.out.println("Bir sayı giriniz");
		// int number = klavye.nextInt();
		// voidliParametreli(number);
		
		// int result = voidsizParametresiz();
		// System.out.println(result);
		
		System.out.println("1.sayi giriniz");
		int number1 = klavye.nextInt();
		
		System.out.println("2.sayi giriniz");
		int number2 = klavye.nextInt();
		
		// Argüman ==> number1, number2
		int result = voidsizParametreli(number1, number2);
		System.out.println(result);
	}
	
}
