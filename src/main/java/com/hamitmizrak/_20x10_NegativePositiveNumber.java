package com.hamitmizrak;

import java.util.Scanner;

public class _20x10_NegativePositiveNumber {
	public static void main(String[] args) {
		
		// kullanıcıdan alınan sayı büyük küçük
		Scanner klavye = new Scanner(System.in);
		int number1, number2;
		
		System.out.println("Lütfen 1. sayıyı giriniz");
		number1 = klavye.nextInt();
		
		System.out.println("Lütfen 2. sayıyı giriniz");
		number2 = klavye.nextInt();
		
		if (number1 > number2) {
			System.out.println("Büyük sayı" + number1);
		} else {
			System.out.println("Büyük sayı" + number2);
		}
		
	}
}
