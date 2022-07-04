package com.hamitmizrak;

import java.util.ArrayList;
import java.util.List;

// List : LAV
// List bir interface'dir.
// java.util paketinde gelir

// LinkedList:Araya yerle�tirme, silme i�lemlerinde bi�ilmi� kaftan
// ArrayList: Ekleme ve Arama i�in bi�ilmi� kaftan
// Vector: veri defaulta 10 bunun dolaca��n� anlad��nda dinamik olarak Haf�za
// uzay� art�r�r.
public class _39_List_LAV2<T> {
	
	// Liste D�ng�s�
	public static void listLoop() {
		// Java 1.7 gelen diamond operator
		List<String> listem = new ArrayList<String>();
		listem.add("Malatya"); // add: eklemek
		listem.add("Balikesir");
		listem.add("Adana");
		
		// list: indisler 0 (s�f�rdan) ba�lar
		// get: listedeki veriye eri�mek i�in kullan�l�r
		System.out.println(listem.get(0));
		
		// size: saymaya 1 ba�lar
		// size: eleman say�s� size: return ==> int
		System.out.println("Eleman say�s�: " + listem.size());
		
		// ForEach d�ng�s�: indis laz�m de�ilse
		System.out.println("\n****  2-) ForEach d�ng�s� ****");
		for (String temp : listem) {
			System.out.print(temp + " ");
		}
		
	}
	
	public static void main(String[] args) {
		listLoop();
	}
	
}
