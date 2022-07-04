package com.hamitmizrak;

import java.util.LinkedList;
import java.util.List;

// List : LAV
// List bir interface'dir.
// java.util paketinde gelir

// LinkedList:Araya yerle�tirme, silme i�lemlerinde bi�ilmi� kaftan
// ArrayList: Ekleme ve Arama i�in bi�ilmi� kaftan
// Vector: veri defaulta 10 bunun dolaca��n� anlad��nda dinamik olarak Haf�za
// uzay� art�r�r.
public class _39_List_LAV3<T> {
	
	// Liste D�ng�s�
	public static void listLoop() {
		
		// List<String> listem = new ArrayList<String>();
		List<String> listem = new LinkedList<String>();
		listem.add("Malatya"); // add: eklemek
		listem.add("Balikesir");
		listem.add("Adana");
		listem.add("Malatya");
		
		for (String temp : listem) {
			System.out.print(temp + " ");
		}
		
	}
	
	public static void main(String[] args) {
		listLoop();
	}
	
}
