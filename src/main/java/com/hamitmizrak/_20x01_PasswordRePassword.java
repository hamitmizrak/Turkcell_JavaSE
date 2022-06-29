package com.hamitmizrak;

import java.util.Scanner;

public class _20x01_PasswordRePassword {
	public static void main(String[] args) {
		
		// Örnek-2 (Password Repassword)
		// kullanıcıdan alınan iki değeri karşılaştırma (equals)
		// kullanıcıdan alınan iki değeri karşılaştırma (equalsIgnoreCase)
		// password - repassword
		
		Scanner klavye = new Scanner(System.in);
		String password, repassword;
		
		System.out.println("Şifre giriniz");
		password = klavye.nextLine();
		
		System.out.println("Şifre Tekrarını giriniz");
		repassword = klavye.nextLine();
		
		if (password.equals(repassword)) {
			System.out.println("Şifre Aynı");
		} else {
			System.out.println("Şifre Farklı");
		}
		
	}
}
