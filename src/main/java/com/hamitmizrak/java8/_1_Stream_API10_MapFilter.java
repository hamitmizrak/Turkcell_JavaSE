package com.hamitmizrak.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// forEach
public class _1_Stream_API10_MapFilter {
	
	public static void streamTuto1() {
		
		List<String> listem = Arrays.asList("malatya", "istanbul", "ankara", "malatya", "bursa", "bolu");
		
		// filter() ==> Var olan lsiteden benim istediklerimi sadece getir.
		// filter veriler üzerinde bir deðiþklik yapmýyor.
		// map ==> lambda expression (lambda function kullanýyoruz)
		
		// listedeki malatya geçenleri bana listele
		// List<String> listem2 = listem.stream()// baþlanýç
		// .filter((temp) -> "malatya".equals(temp)).collect(Collectors.toList());//
		// stream'i listeye cevir
		// listem2.forEach(System.out::println);
		
		List<String> listem2 = listem.stream()// baþlanýç
				.filter((temp) -> "malatya".equals(temp)).collect(Collectors.toList());//
		
		// listem2.forEach(System.out::println);
		
		// listedeki malatya geçmeyenleriiiiii bana listele
		// List<String> listem2 = listem.stream()// baþlanýç
		// .filter((temp) -> !"malatya".equals(temp)) // filter
		// .collect(Collectors.toList());// stream'i listeye cevir
		// listem2.forEach(System.out::println);
		
		// listedeki malatya geçmeyenleriiiiii küçükten büyüðe sýralama listele
		// List<String> listem2 = listem.stream()// baþlanýç
		// .filter((temp) -> !"malatya".equals(temp)) // filter
		// .sorted().collect(Collectors.toList());// stream'i listeye cevir
		// listem2.forEach(System.out::println);
		
		// listedeki malatya geçmeyenleriiiiii büyükten küçüðe sýralama
		// List<String> listem2 = listem.stream()// baþlanýç
		// .filter((temp) -> !"malatya".equals(temp)) // filter
		// .sorted(Comparator.reverseOrder()).collect(Collectors.toList());// stream'i
		// listeye cevir
		// listem2.forEach(System.out::println);
		
		// listedeki malatya geçmeyenleriiiiii büyükten küçüðe ilk 2 elemaný listele
		// List<String> listem2 = listem.stream()// baþlanýç
		// .filter((temp) -> !"malatya".equals(temp)) // filter
		// .sorted(Comparator.reverseOrder()).limit(2).collect(Collectors.toList());//
		// stream'i listeye cevir
		// listem2.forEach(System.out::println);
		
		// listedeki malatya geçmeyenleriiiiii büyükten küçüðe ilk 2 elemaný büyük
		// harflerle listele
		// List<String> listem2 = listem.stream()// baþlanýç
		// .filter((temp) -> !"malatya".equals(temp.toLowerCase())) // filter
		// .sorted(Comparator.reverseOrder()).limit(2).collect(Collectors.toList());//
		// stream'i listeye cevir
		// listem2.forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		streamTuto1();
	}
	
}
