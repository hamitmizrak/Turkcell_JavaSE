package com.hamitmizrak.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// forEach
public class _1_Stream_API07_Filter {
	
	public static void streamTuto1() {
		
		List<String> listem = Arrays.asList("malatya", "istanbul", "ankara", "malatya", "bursa", "bolu");
		
		// listedeki malatya ge�meyenleriiiiii b�y�kten k����e ilk 2 eleman� b�y�k
		// harflerle listeleyen
		List<String> listem2 = listem.stream()// ba�lan��
				.filter((temp) -> !"malatya".equals(temp.toLowerCase())) // filter: verilerde sadece eleme yapar.
				.map((temp) -> temp.toUpperCase())// map: verilerde manip�lasyon
				.sorted(Comparator.reverseOrder())// B�y�kten K����e s�ralaama
				.limit(2) // ilk 2 eleman� alan
				.collect(Collectors.toList());//
		
		listem2.forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		streamTuto1();
	}
	
}
