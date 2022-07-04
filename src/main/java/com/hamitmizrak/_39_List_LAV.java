package com.hamitmizrak;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// List : LAV
// List bir interface'dir.
// java.util paketinde gelir

// LinkedList:Araya yerle�tirme, silme i�lemlerinde bi�ilmi� kaftan
// ArrayList: Ekleme ve Arama i�in bi�ilmi� kaftan
// Vector: veri defaulta 10 bunun dolaca��n� anlad��nda dinamik olarak Haf�za
// uzay� art�r�r.
public class _39_List_LAV<T> {
	
	// Liste D�ng�s�
	public static void listLoop() {
		// Java 1.7 gelen diamond operator
		List<String> listem = new ArrayList<String>();
		listem.add("Malatya"); // add: eklemek
		listem.add("Balikesir");
		listem.add("Adana");
		
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
		
		// 4-) Java 8 gelen 4- Stream API forEach
		System.out.println("\n**** 4-) Stream API forEach ****");
		listem.stream().forEach(System.out::print);
		
		System.out.println("\n****  5-) Stream API forEach k�sas�****");
		listem.forEach(System.out::print);
		
	}
	
	public static void main(String[] args) {
		listLoop();
	}
	
}
