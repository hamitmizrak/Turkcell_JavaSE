package com.hamitmizrak;

import java.util.Random;

// Rastgele 1<=X<=10 oluşturulan 5 tane random orijinalArray adında int dizisi
// oluşturalım
// Oluşturulan bu diziyi(orijinalArray) cloneArray dizisine clone(iterative ve
// dizi metoduyla yapalım)

public class _32_Diziler_x1_CloneArray {
	
	// randomArray
	private static int[] randomArray() {
		Random random = new Random();
		int[] orijinalArray = new int[5];
		for (int i = 0; i < orijinalArray.length; i++) {
			int number = random.nextInt(10) + 1;
			orijinalArray[i] = number;
		}
		return orijinalArray;
	}
	
	// clone
	private static boolean cloneArray(int[] orijinalArray) {
		
		// normal
		int[] normal = orijinalArray;
		for (int temp : normal) {
			System.out.print(temp + " ");
		}
		System.out.println("\n**********************");
		
		// clone-1
		int[] clone1 = normal.clone();
		for (int temp : clone1) {
			System.out.print(temp + " ");
		}
		System.out.println("\n**********************");
		
		// clone-2
		int[] clone2 = new int[normal.length];
		for (int i = 0; i < clone2.length; i++) {
			clone2[i] = normal[i];
		}
		for (int temp : clone2) {
			System.out.print(temp + " ");
		}
		return true;
	}
	
	public static void main(String[] args) {
		cloneArray(randomArray());
	}
}
