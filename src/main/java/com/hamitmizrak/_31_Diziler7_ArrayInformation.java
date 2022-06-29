package com.hamitmizrak;

public class _31_Diziler7_ArrayInformation {
	
	// arrayMethod1
	public static void arrayMethod1(int[] dizi) {
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
	}
	
	// arrayMethod2
	public static void arrayMethod2(int... dizi) {
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
	}
	
	// main
	public static void main(String[] args) {
		int[] dizi = { 1, 2, 3, 4 };
		arrayMethod1(dizi);
		System.out.println("\n***************");
		arrayMethod2(dizi);
	}
	
}
