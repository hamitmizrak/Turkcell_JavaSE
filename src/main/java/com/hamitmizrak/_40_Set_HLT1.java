package com.hamitmizrak;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class _40_Set_HLT1 {
	
	// set:
	// interface
	// tekrarsýz veriler kullanmak içindir
	
	// HLT
	// HashSet : Rastgele sýrada bize göster ve tekrarsýz veri
	// LinkedHashSet : Eklediðimiz sýrada bize göster ve tekrarsýz veri
	// TreeSet : Küçükten büyüðe tekrarsýz
	// java.util paketinden gelir
	
	// Dikkat: YOK ==> get,indexOf,lastIndexOf
	
	public static void setTutorials() {
		// Set<String> iller = new LinkedHashSet<String>(); //eklediðimiz sýradaki
		// indiste
		// Set<String> iller = new HashSet<String>();//eklediðimiz sýrada olmayan
		Set<String> iller = new TreeSet<String>();// Tekrarsýz küçükten büyüðe doðru
		iller.add("Malatya");
		iller.add("Elazýð");
		iller.add("Bingöl");
		iller.add("Diyarbakýr");
		iller.add("Malatya");
		iller.add("Malatya");
		
		// Döngü
		for (String temp : iller) {
			System.out.println(temp);
		}
		System.out.println("*************");
		// Iterator Döngü
		
		Iterator<String> iterator = iller.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// set ==> array'e çevirmek
		iller.toArray();
		
		// eleman sayýsý
		iller.size();
		
		// boþ mu
		iller.isEmpty();
		
		// Remove
		iller.remove("Diyarbakýr");
		
		// listede verileri temizlemek
		iller.clear();
	}
	
	public static void main(String[] args) {
		setTutorials();
	}
	
}
