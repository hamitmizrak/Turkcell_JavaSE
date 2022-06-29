package com.hamitmizrak;

import java.util.Scanner;

// Kullanıcı tarafında girilen sayının :
// hız: 80 hızlı yavaşlayın para cezası: 800 TL
// hız: 95 orta hızlı yavaşlayın para cezası: 1200 TL
// hız: 120 çok hızlı yavaşlayın para cezası: 2000 TL
public class _20x13_Radar {
	
	// global variable
	// Toplam odeme miktari
	private static int AMOUNT = 0;
	
	// Hızlı gitme sayısı
	private static int HOW_MANY_TIMES = 0;
	
	// scannerSpeed Method
	public static int scannerSpeed() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("+++++++++++\nHizinizi giriniz");
		int speed = Math.abs(klavye.nextInt());
		return speed;
	}
	
	// radar Method
	public static void radar() {
		int speed = scannerSpeed();
		
		if (80 <= speed && speed <= 94) {
			AMOUNT = AMOUNT + 800;
			HOW_MANY_TIMES = HOW_MANY_TIMES + 1;
			System.out.println("hiz: " + speed + " hizli, yavaslayin para cezasi:800 \ntoplam odemeniz " + AMOUNT + " "
					+ HOW_MANY_TIMES + " kez hizli gittiniz");
		} else if (95 <= speed && speed <= 119) {
			AMOUNT += 1200;
			HOW_MANY_TIMES += 1;
			System.out.println("hiz: " + speed + " orta, yavaslayin para cezasi: 1200 \ntoplam odemeniz " + AMOUNT + " "
					+ HOW_MANY_TIMES + " kez hizli gittiniz");
		} else if (speed >= 120) {
			AMOUNT += 2000;
			HOW_MANY_TIMES++;
			System.out.println("hiz: " + speed + " çok hizli yavaslayin para cezasi:2000 \ntoplam odemeniz " + AMOUNT
					+ " " + HOW_MANY_TIMES + " kez hizli gittiniz");
		} else {
			System.out.println("normal hız para cezasi:0 , hiz sayisi:0");
		}
	}
	
	public static void main(String[] args) {
		for (;;) {
			radar();
		}
	}
	
}
