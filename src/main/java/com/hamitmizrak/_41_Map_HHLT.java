package com.hamitmizrak;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

// ArrayList<>() ve HashMap<>()

public class _41_Map_HHLT {
	
	// map:
	// key value �eklinde �al���r.
	// bir interface'dir
	// Generics yap�larla beraber �al���r
	// Map<Key,Value> ==> Map<String,Object>
	// unutma: Key unique olmal�d�r yoksa son datay� kendisine referans al�r
	// java.util paketinden gelir.
	
	// map kullan�m alanlar�
	// API servisleri
	// JSON
	// Database olmad��� durumlarda
	
	// HHLT
	// HashTable: null veremezsiniz
	// HashMap: indis s�ras� bizim i�in �nemsiz ise, rastgele s�rada
	// LinkedHashMap: indis s�ras� �nemli ise, ekledi�imiz s�rada
	// TreeMap : Key'e g�re K���kten b�y��e s�ralamak
	
	public static String myRandomUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
	// Map
	public static void mapTutorials() {
		// Map<String, Object> mapList = new HashMap<String, Object>();
		Map<String, Object> mapList = new LinkedHashMap<String, Object>();
		// Map<String, Object> mapList = new TreeMap<String, Object>();
		mapList.put(myRandomUUID(), "�stanbul");
		mapList.put(myRandomUUID(), "�zmir");
		mapList.put(myRandomUUID(), "Bursa");
		mapList.put(myRandomUUID(), "Ankara");
		
		System.out.println("\n**** 1- KEY ****");
		for (String key : mapList.keySet()) {
			System.out.print(key + " ");
		}
		
		System.out.println("\n**** 2- VALUE ****");
		for (Object value : mapList.values()) {
			System.out.print(value + " ");
		}
		
		System.out.println("\n**** 3- KEY-VALUE ****");
		for (String key : mapList.keySet()) {
			System.out.println(key + " " + mapList.get(key));
		}
		
		System.out.println("\n**** 4- Iterator ****");
		// Key benzersiz olmal�: ve key i�in(Set) kullanaca��m
		Set<String> set = mapList.keySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(mapList.get(iterator.next()));
		}
		
		System.out.println("\n**** 5- M-E-l-es ****");
		for (Map.Entry<String, Object> temp : mapList.entrySet()) {
			System.out.println(temp);
		}
		
		System.out.println("\n**** 6- Stream ForEach****");
		mapList.entrySet().forEach(System.out::println);
		
		// map eleman say�s�
		mapList.size();
		
		// String'e �evirmek
		mapList.toString();
		
		// hash code
		mapList.hashCode();
		
		// ilgili veriyi getirmek
		mapList.get(0);
		
		// listeden verileri siler
		mapList.clear();
		
	}
	
	public static void main(String[] args) {
		mapTutorials();
	}
	
}
