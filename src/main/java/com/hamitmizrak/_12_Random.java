package com.hamitmizrak;

import java.util.Random;

public class _12_Random {
	public static void main(String[] args) {
		
		// Random
		double mathRandom = Math.round(Math.random() * 4 + 1);
		System.out.println(mathRandom);
		
		// Class Düzeyinde (Object)
		Random random = new Random();
		int classRandom = random.nextInt(4) + 2;
		System.out.println(classRandom);
	}
}
