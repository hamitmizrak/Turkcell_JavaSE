package com.hamitmizrak.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// forEach
public class _1_Stream_API3_ForEach {
	
	public static void streamTuto1() {
		
		List<String> listem = Arrays.asList("malatya", "istanbul", "ankara", "malatya", "bursa", "bolu");
		
		// 1-) iterative For d�ng�: indis laz�msa
		System.out.println("****  1-) iterative For d�ng� ****");
		for (int i = 0; i < listem.size(); i++) {
			System.out.print(listem.get(i) + " ");
		}
		
		// 2-) ForEach d�ng�s�: indis laz�m de�ilse
		System.out.println("\n****  2-) ForEach d�ng�s� ****");
		for (String temp : listem) {
			System.out.print(temp + " ");
		}
		
		// 3-) Iterator Dongu: java.util paketinden t�rer
		System.out.println("\n****  3-) Iterator d�ng�s� ****");
		// Iterator iterator = listem.iterator();
		Iterator<String> iterator = listem.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		// 4-) Stream ForEach
		System.out.println("\n****  4-) Stream ForEach****");
		listem.stream().forEach(System.out::println);
		
		// 5-) ForEach
		System.out.println("\n****  5-)  ForEach****");
		listem.forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		streamTuto1();
	}
	
}
