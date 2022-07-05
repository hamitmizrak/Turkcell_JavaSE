package com.hamitmizrak;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class _40_Set_HLT1 {
	
	// set:
	// interface
	// tekrars�z veriler kullanmak i�indir
	
	// HLT
	// HashSet : Rastgele s�rada bize g�ster ve tekrars�z veri
	// LinkedHashSet : Ekledi�imiz s�rada bize g�ster ve tekrars�z veri
	// TreeSet : K���kten b�y��e tekrars�z
	// java.util paketinden gelir
	
	// Dikkat: YOK ==> get,indexOf,lastIndexOf
	
	public static void setTutorials() {
		// Set<String> iller = new LinkedHashSet<String>(); //ekledi�imiz s�radaki
		// indiste
		// Set<String> iller = new HashSet<String>();//ekledi�imiz s�rada olmayan
		Set<String> iller = new TreeSet<String>();// Tekrars�z k���kten b�y��e do�ru
		iller.add("Malatya");
		iller.add("Elaz��");
		iller.add("Bing�l");
		iller.add("Diyarbak�r");
		iller.add("Malatya");
		iller.add("Malatya");
		
		// D�ng�
		for (String temp : iller) {
			System.out.println(temp);
		}
		System.out.println("*************");
		// Iterator D�ng�
		
		Iterator<String> iterator = iller.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// set ==> array'e �evirmek
		iller.toArray();
		
		// eleman say�s�
		iller.size();
		
		// bo� mu
		iller.isEmpty();
		
		// Remove
		iller.remove("Diyarbak�r");
		
		// listede verileri temizlemek
		iller.clear();
	}
	
	public static void main(String[] args) {
		setTutorials();
	}
	
}
