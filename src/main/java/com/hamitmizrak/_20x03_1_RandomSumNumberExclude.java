package com.hamitmizrak;

import java.util.Random;

// Örnek: 1-10 arasında 5 tane random sayı üretelim ve bunları toplayalım
// ancak bu sayılardan 5'e bölünen sayılar toplamayalım? (key:continue)
// Exam: 1 3 9 5 4 ==> 1+3+9+4
// initial data sıfır toplamada etkisiz eleman
public class _20x03_1_RandomSumNumberExclude {
	public static void main(String[] args) {
		
		Random rastgele = new Random();
		int sum = 0, temp = 0;
		
		for (int i = 1; i <= 5; i++) {
			// rastgele sayı üretti
			temp = (rastgele.nextInt(10) + 1);
			
			// eğer bu rastgele sayılardan 5'e bölünebilen varsa alma
			if (temp % 5 == 0)
				continue;
			
			// sum = sum + temp;
			sum += temp;
		}
		System.out.println(sum);
	}
}
