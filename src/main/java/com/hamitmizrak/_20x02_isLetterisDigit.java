package com.hamitmizrak;

import java.util.Scanner;

public class _20x02_isLetterisDigit {
	public static void main(String[] args) {
		
		// Örnek-3 (anlamak)
		// girilen karakter harf mi , sayı mı , özel simge mi ?
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir şeyler yazınız");
		String stringChar = klavye.nextLine();
		char c1 = stringChar.charAt(0);
		char c2 = '@';
		if (Character.isDigit(c1))
			System.out.println("Sayıdır");
		else if (Character.isLetter(c1))
			System.out.println("Harftir");
		else
			System.out.println("Özel Simge");
	}
}
