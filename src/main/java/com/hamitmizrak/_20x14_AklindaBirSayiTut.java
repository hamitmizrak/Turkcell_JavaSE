package com.hamitmizrak;

import java.util.Scanner;

// Bir sayi söylüyoruz ve çıkan sonucu tahmin ediyoruz.
// ipucu: sonuc her zaman 11 cıkıyor.
// kullanıcıdan alınan sayının sonucu tahmin etmek

// adım1: 1-100 arasında bir sayı olsun
// adım1: Bu sayiyi 2 ile çarpın
// adım2: sonuca 22 ekleyin
// adım3: cikan sonucu 2 ile bolelim
// adım4: bu sayiyi ilk sayidan çıkarın

// Formulu: int sonuc = (((sayi * 2) + 22) / 2) - sayi;

public class _20x14_AklindaBirSayiTut {
	
	// System.out.println("simdi su adimlari yapalim");
	// System.out.println("tuttugunuz sayiyi 2 ile çarpın ve sonuca 22 ekleyin
	// cikan");
	// sonucu 2 ile bolelim");
	// System.out.println(" bu sayiyi ilk sayidan çıkarın");
	// System.out.println("klavyeden herhangi bir tusa basiniz");
	
	// scannerSpeed Method
	public static int scannerNumber() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("+++++++++++\nBir sayi giriniz");
		int speed = Math.abs(klavye.nextInt());
		return speed;
	}
	
	// radar Method
	public static void preditionNumber() {
		int number = Math.abs(scannerNumber());
		Scanner klavye = new Scanner(System.in);
		if (1 <= number && number <= 100) {
			System.out.println("simdi su adimlari yapalim");
			System.out.println("tuttugunuz sayiyi 2 ile çarpın ve sonuca 22 ekleyin cikan");
			System.out.println("tuttugunuz sayiyi sonucu 2 ile bolelim");
			System.out.println("bu sayiyi ilk sayidan çıkarın");
			int result = (((number * 2) + 22) / 2) - number;
			System.out.println("sonucu gormek icin klavyeden herhangi bir tusa basiniz");
			klavye.hasNext();
			System.out.println("Sonuc: 11");
		}
	}
	
	// main
	public static void main(String[] args) {
		for (;;) {
			preditionNumber();
		}
	}
	
}
