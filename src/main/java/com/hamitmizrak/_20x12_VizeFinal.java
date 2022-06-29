package com.hamitmizrak;

import java.util.Scanner;

// kullanıcıdan alınan vize ve final notuna göre geçme(ortalama) Algoritması

// eğer kullanıcı vize veya final 0(sıfır) bir değer girerse sistemden atsın
// ekranda "Sifir disiplin hatasi Sistemden cikiliyor"
// bunun haricinde sürekli vize final sorsun

// Not Harfleri ==> AA BA BB FF
// not ortalaması: ortalama<50 altında ise kaldı FF
// not ortalaması: ortalama==50 Geçti
// not ortalaması: 55<=x<=69 BB
// not ortalaması: 70<=x<=84 BA
// not ortalaması: 85<=x<=100 AA

// Vize:40% Final:60%
// Dikkat: Consolda virgül kullanmalısın.

// while sonsuz döngü ==> while(true) {}
// for sonsuz döngü ==> for(;;) {}

public class _20x12_VizeFinal {
	
	public static void vizeFinal() {
		
		Scanner klavye = new Scanner(System.in);
		int vizeNot, finalNot;
		double ortalama = 0;
		
		while (true) {
			System.out.println("++++++++++++++++++++\nVize Notunuzu giriniz");
			vizeNot = klavye.nextInt();
			
			System.out.println("Final Notunuzu giriniz");
			finalNot = klavye.nextInt();
			
			if (vizeNot == 0 || finalNot == 0) {
				System.out.println("Sifir disiplin hatasi Sistemden cikiliyor");
				System.exit(0);
			} else {
				ortalama = Math.round(vizeNot * 0.4 + finalNot * 0.6);
				
				// 0<=ortalama<=54
				if (0 <= ortalama && ortalama <= 54)
					System.out.println("Kaldiniz. FF " + ortalama);
				
				// 55<=x<=69 BB
				else if (55 <= ortalama && ortalama <= 69)
					System.out.println("Gectiniz. BB " + ortalama);
				
				// 70<=x<=84 BA
				else if (70 <= ortalama && ortalama <= 84)
					System.out.println("Gectiniz. BA " + ortalama);
				
				// 85<=x<=100 AA
				else if (85 <= ortalama && ortalama <= 100)
					System.out.println("Gectiniz. AA " + ortalama);
				else
					System.out.println("disina cikildi " + ortalama);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		vizeFinal();
	}
	
}
