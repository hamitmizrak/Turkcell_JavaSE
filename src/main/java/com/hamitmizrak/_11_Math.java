package com.hamitmizrak;

import java.util.Scanner;

public class _11_Math {
	public static void main(String[] args) {
		// Math: statictir.
		System.out.println(Math.E);
		System.out.println(Math.PI);
		
		System.out.println(Math.sqrt(16));
		System.out.println(Math.pow(2, 5));
		System.out.println(Math.abs(-16));
		
		System.out.println(Math.min(2, 99));
		System.out.println(Math.max(2, 99));
		
		System.out.println(Math.floor(14.9));
		System.out.println(Math.ceil(14.1));
		System.out.println(Math.round(14.5));
		
		System.out.println(Math.round(Math.random() * 5 + 2));
		
		// hipotenüs
		// Kullanıcıdan alınan 2 sayı üçgenin dik kenarlarıdır hipotenüs uzunluğunu
		// bulalım
		double x1, x2, result;
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("1.sayıyı giriniz");
		x1 = klavye.nextInt();
		
		System.out.println("2.sayıyı giriniz");
		x2 = klavye.nextInt();
		result = Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2));
		System.out.println(result);
		
	}
}
