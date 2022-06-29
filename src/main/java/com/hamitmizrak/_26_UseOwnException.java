package com.hamitmizrak;

import java.util.Scanner;

public class _26_UseOwnException {
	
	public static void main(String[] args) throws HamitMizrakException {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int number = klavye.nextInt();
		if (number < 0)
			throw new HamitMizrakException("Sifirdan kucuk sayi giremezsiniz");
		else {
			System.out.println(Math.pow(number, 2));
		}
	}
	
}
