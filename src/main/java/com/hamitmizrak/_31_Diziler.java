package com.hamitmizrak;

import java.util.Arrays;

// diziler eleman sayısı belli olandır.
// Verilerimizi düzgün bir şekilde tutabilmek gerektiğinde o verilere erişim
// sağlamak için önemlidir
// Sıfır(0) indiste başlar
// Tek boyutlu , çift boyutlu olarak devam eder

public class _31_Diziler {
	
	public static void main(String[] args) {
		// int[] dizi = new int[6];
		// dizi[0] = 1;
		// dizi[3] = 3;
		// dizi[4] = 4;
		// dizi[5] = 5;
		
		int[] dizi = { 1, 9, 6, 2 };
		
		// dizileri sıralamak için kullanılır
		Arrays.sort(dizi);
		
		// iterative for
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}
		
		System.out.println("\n***************");
		
		// forEach dongusu:sadece ekranda gostermek istiyorsak
		// forEach dongusu:indisi numarası bize gerekmiyorsa
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
		
	}
	
}
