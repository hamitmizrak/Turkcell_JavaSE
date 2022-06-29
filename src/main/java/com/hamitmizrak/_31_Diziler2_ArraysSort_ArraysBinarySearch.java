package com.hamitmizrak;

import java.util.Arrays;

// dikkatttt binarySearch sıralanması gerekir önce Arrays.sort(dizi) yapmamız
// gerekir
// Eğer dizide eleman varsa indis döner yoksa negatif sayı döner
public class _31_Diziler2_ArraysSort_ArraysBinarySearch {
	
	public static void main(String[] args) {
		
		int[] dizi = { 1, 9, 6, 2 };
		
		// dizileri sıralamak için kullanılır
		Arrays.sort(dizi); // 1 2 6 9
		
		// Arrays.binarySearch()
		int number = 9;
		int result = Arrays.binarySearch(dizi, number);
		if (result > 0) {
			System.out.println("Aradığınız sayı " + number + " vardır. " + result + ". indistedir ");
		} else {
			System.out.println("Aradığınız yoktur ");
		}
		
		// forEach
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
	}
}
