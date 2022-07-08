package com.hamitmizrak.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// forEach
public class _1_Stream_API9_Map {
	
	public static void streamTuto1() {
		
		List<String> listem = Arrays.asList("malatya", "istanbul", "ankara", "malatya", "bursa", "bolu");
		
		// map ==> lambda expression (lambda function kullan�yoruz)
		// map() ==> Var olan listedeki veriler �zerinde manip�lasyon
		// yap�yor(de�i�tiriyor)
		
		// listedeki verileri b�y�k harf'e �evirmek i�in kullan�yoruz.
		List<String> listem2 = listem.stream()// ba�lan��
				.distinct().sorted().map((temp) -> temp.toUpperCase()).collect(Collectors.toList());
		listem2.forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		streamTuto1();
	}
	
}
