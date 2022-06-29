package com.hamitmizrak;

import java.util.Random;

// Örnek: 1-10 arasında 5 tane random sayı üretelim ve bunları toplayalım?
// initial data sıfır toplamada etkisiz eleman
public class _20x03_0_RandomSum {
	public static void main(String[] args) {
		Random rastgele = new Random();
		int sum = 0;
		int temp = 0;
		for (int i = 1; i <= 5; i++) {
			temp = (rastgele.nextInt(10) + 1);
			sum = sum + temp;
		}
		System.out.println(sum);
	}
}
