package com.hamitmizrak;

public class _31_Diziler4_ArraysClone {
	
	public static void main(String[] args) {
		
		// dizilerde clone
		int[] dizi1 = { 1, 9, 6, 2 };
		int[] dizi2 = dizi1.clone();
		
		for (int temp : dizi2) {
			System.out.println(temp);
		}
	}
}
