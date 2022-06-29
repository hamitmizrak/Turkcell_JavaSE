package com.hamitmizrak;

import java.util.Scanner;

// Kullanıcıdan alınan bilgilere göre doğru kullanıcı adı ve şifre girerse
// sisteme giriş sağlanacak
// yoksa deneme hakkı 4"ten başlayarak aşağıya doğru azalacak
// deneme hakkı eğer 0 olursa sistemden atacak ve hesabını bloke konulacak. Bu
// algoritmayı dizi ile yapalım

// NOT: kullanıcıdan alınan username ve password String[] dizi metodu olacaktır.
// default kullanıcı ad: admin
// default şifre:root
public class _32_Diziler_x0_Login {
	
	// Class değişkenlerimiz
	private static int COUNTER = 4;
	private static final String DEFAULT_USERNAME = "admin";
	private static final String DEFAULT_PASSWORD = "root";
	
	// username,password dizi
	private static String[] userLogin() {
		Scanner klavye = new Scanner(System.in);
		
		String userName, userPassword;
		
		System.out.println("Lütfen username giriniz");
		userName = klavye.nextLine();
		
		System.out.println("Lütfen userPassword giriniz");
		userPassword = klavye.nextLine();
		
		String[] arr = { userName, userPassword };
		
		for (String temp : arr) {
			System.out.print(temp + " ");
		}
		return arr;
	}
	
	// admin page
	private static void adminMethod() {
		System.out.println("ADMIN PAGE HOŞGELDINIZ");
		System.exit(0);
	}
	
	// validation method
	public static void userValidation(String[] arr) {
		String[] userInfo = arr;
		
		if (COUNTER >= 0) {
			if (userInfo[0].equals(DEFAULT_USERNAME) && userInfo[1].equals(DEFAULT_PASSWORD)) {
				System.out.println("Admin sayfasına gidiyorsunuz");
				adminMethod();
			} else {
				COUNTER--;
				System.out.println("\n\nKalan hakkınız: " + COUNTER);
				if (COUNTER == 0) {
					System.out.println("HAkkınız kalmadı hesabını bloke oldu admine başvurunuz. 111 22 33");
					System.exit(0);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		while (true) {
			String[] dizi = userLogin();
			userValidation(dizi);
		}
	}
}
