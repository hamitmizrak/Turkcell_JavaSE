package com.hamitmizrak;

import java.util.Scanner;

public class _09_Scanner {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String kelime = klavye.nextLine();
		System.out.println(kelime);
		
		// Scanner normalde char yoktur ancak biz kendimiz nasıl oluşturabiliriz. ipucu:
		// charAt()
		System.out.println(kelime.charAt(0));
		klavye.close();
	}
}
