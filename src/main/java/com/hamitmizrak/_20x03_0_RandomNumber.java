package com.hamitmizrak;

import java.util.Random;

// Örnek: 1-10 arasında 5 tane random sayı üretelim ? (Random, for)
public class _20x03_0_RandomNumber {
	public static void main(String[] args) {
		
		Random rastgele = new Random();
		String str = "";
		for (int i = 1; i <= 5; i++) {
			str += (rastgele.nextInt(10) + 1) + " ";
		}
		System.out.println(str);
	}
}
