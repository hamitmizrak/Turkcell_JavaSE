package com.hamitmizrak;

import java.util.ArrayList;
import java.util.List;

// List : LAV
// List bir interface'dir.
// java.util paketinde gelir

// LinkedList:Araya yerleþtirme, silme iþlemlerinde biçilmiþ kaftan
// ArrayList: Ekleme ve Arama için biçilmiþ kaftan
// Vector: veri defaulta 10 bunun dolacaðýný anladðýnda dinamik olarak Hafýza
// uzayý artýrýr.
public class _39_List_LAV2<T> {
	
	// Liste Döngüsü
	public static void listLoop() {
		// Java 1.7 gelen diamond operator
		List<String> listem = new ArrayList<String>();
		listem.add("Malatya"); // add: eklemek
		listem.add("Balikesir");
		listem.add("Adana");
		
		// list: indisler 0 (sýfýrdan) baþlar
		// get: listedeki veriye eriþmek için kullanýlýr
		System.out.println(listem.get(0));
		
		// size: saymaya 1 baþlar
		// size: eleman sayýsý size: return ==> int
		System.out.println("Eleman sayýsý: " + listem.size());
		
		// ForEach döngüsü: indis lazým deðilse
		System.out.println("\n****  2-) ForEach döngüsü ****");
		for (String temp : listem) {
			System.out.print(temp + " ");
		}
		
	}
	
	public static void main(String[] args) {
		listLoop();
	}
	
}
