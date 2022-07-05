package com.hamitmizrak;

import java.util.Arrays;
import java.util.List;

public class _39_List_LAV6_Filter<T> {
	
	// filter: obje listedeki verilerimizden filtreleme yapmak için kullanýlýr.
	public static void filterLoop() {
		
		// asList: filter
		_39_List_LAV6_FilterClass obje1 = new _39_List_LAV6_FilterClass(1, "Hamit Mýzrak", 1);
		_39_List_LAV6_FilterClass obje2 = new _39_List_LAV6_FilterClass(2, "isim2 soyisim2", 2);
		_39_List_LAV6_FilterClass obje3 = new _39_List_LAV6_FilterClass(3, "isim3 soyisim3", 3);
		
		// Arrays.sort(dizi);
		// Arrays.binarySearch(dizi);
		// Arrays.asList(dizi);
		// Arrays.stream(dizi);
		
		List<_39_List_LAV6_FilterClass> filterClass = Arrays.asList(obje1, obje2, obje3);
		for (_39_List_LAV6_FilterClass temp : filterClass) {
			if (temp.getPrice() >= 2) {
				System.out.println(temp);
			}
		}
	}
	
	public static void main(String[] args) {
		filterLoop();
	}
	
}
