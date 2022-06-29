package com.hamitmizrak;

public class _31_Diziler3_ArraysEquals {
	public static void main(String[] args) {
		
		int[] dizi1 = { 1, 9, 6, 2 };
		int[] dizi2 = { 1, 9, 6, 1 };
		
		// Arrays.equals(dizi1,dizi2) ==> boolean döner
		
		if (java.util.Arrays.equals(dizi1, dizi2)) {
			System.out.println("Birebir aynıdır");
		} else {
			System.out.println("Farklı elemanda dizilerdir aynıdır");
		}
	}
	
}
