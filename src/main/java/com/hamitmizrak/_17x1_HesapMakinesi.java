package com.hamitmizrak;

import java.util.Scanner;

public class _17x1_HesapMakinesi {
	public static void main(String[] args) {
		
		// Örnek-1 (Hesap Makinesi)
		// kullanıcıdan alınan iki sayının dört işlem (Hesap Makinesi)
		// Scanner, cast
		// toplama
		// çıkarma
		// çarpma
		// bölme
		// bölümünden kalan
		// bu iki sayıdan büyük olanın karekökü (Math.sqrt)
		// bu iki sayıdan küçük olanın mutlak değeri (Math.sqrt)
		// bu iki sayıdan küçük olanın alt değer büyük üst değer (Math.pow)
		
		Scanner klavye = new Scanner(System.in);
		int number1, number2;
		System.out.println("1.sayıyı giriniz");
		number1 = klavye.nextInt();
		System.out.println("2.sayıyı giriniz");
		number2 = klavye.nextInt();
		
		System.out.println("toplam: " + (number1 + number2));
		System.out.println("Çıkarma: " + (number1 - number2));
		System.out.println("Çarpma: " + (number1 * number2));
		System.out.println("Bölme: " + (number1 / number2));
		System.out.println("Kalan: " + (number1 % number2));
		System.out.println("büyük sayı karekökü: " + (Math.sqrt(Math.max(number1, number2))));
		System.out.println("küçük sayı mutlak: " + (Math.abs(Math.min(number1, number2))));
		System.out.println("üslü sayı: " + (Math.pow(Math.min(number1, number2), Math.max(number1, number2))));
		
	}
}
