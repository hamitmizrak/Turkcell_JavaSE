package com.hamitmizrak;

import java.util.LinkedList;
import java.util.List;

// List : LAV
// List bir interface'dir.
// java.util paketinde gelir

// LinkedList:Araya yerleþtirme, silme iþlemlerinde biçilmiþ kaftan
// ArrayList: Ekleme ve Arama için biçilmiþ kaftan
// Vector: veri defaulta 10 bunun dolacaðýný anladðýnda dinamik olarak Hafýza
// uzayý artýrýr.
public class _39_List_LAV3<T> {
	
	// Liste Döngüsü
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
