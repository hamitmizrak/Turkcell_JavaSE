package com.hamitmizrak.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// forEach
public class _1_Stream_API10_MapFilter {
	
	public static void streamTuto1() {
		
		List<String> listem = Arrays.asList("malatya", "istanbul", "ankara", "malatya", "bursa", "bolu");
		
		// filter() ==> Var olan lsiteden benim istediklerimi sadece getir.
		// filter veriler �zerinde bir de�i�klik yapm�yor.
		// map ==> lambda expression (lambda function kullan�yoruz)
		
		// listedeki malatya ge�enleri bana listele
		// List<String> listem2 = listem.stream()// ba�lan��
		// .filter((temp) -> "malatya".equals(temp)).collect(Collectors.toList());//
		// stream'i listeye cevir
		// listem2.forEach(System.out::println);
		
		List<String> listem2 = listem.stream()// ba�lan��
				.filter((temp) -> "malatya".equals(temp)).collect(Collectors.toList());//
		
		// listem2.forEach(System.out::println);
		
		// listedeki malatya ge�meyenleriiiiii bana listele
		// List<String> listem2 = listem.stream()// ba�lan��
		// .filter((temp) -> !"malatya".equals(temp)) // filter
		// .collect(Collectors.toList());// stream'i listeye cevir
		// listem2.forEach(System.out::println);
		
		// listedeki malatya ge�meyenleriiiiii k���kten b�y��e s�ralama listele
		// List<String> listem2 = listem.stream()// ba�lan��
		// .filter((temp) -> !"malatya".equals(temp)) // filter
		// .sorted().collect(Collectors.toList());// stream'i listeye cevir
		// listem2.forEach(System.out::println);
		
		// listedeki malatya ge�meyenleriiiiii b�y�kten k����e s�ralama
		// List<String> listem2 = listem.stream()// ba�lan��
		// .filter((temp) -> !"malatya".equals(temp)) // filter
		// .sorted(Comparator.reverseOrder()).collect(Collectors.toList());// stream'i
		// listeye cevir
		// listem2.forEach(System.out::println);
		
		// listedeki malatya ge�meyenleriiiiii b�y�kten k����e ilk 2 eleman� listele
		// List<String> listem2 = listem.stream()// ba�lan��
		// .filter((temp) -> !"malatya".equals(temp)) // filter
		// .sorted(Comparator.reverseOrder()).limit(2).collect(Collectors.toList());//
		// stream'i listeye cevir
		// listem2.forEach(System.out::println);
		
		// listedeki malatya ge�meyenleriiiiii b�y�kten k����e ilk 2 eleman� b�y�k
		// harflerle listele
		// List<String> listem2 = listem.stream()// ba�lan��
		// .filter((temp) -> !"malatya".equals(temp.toLowerCase())) // filter
		// .sorted(Comparator.reverseOrder()).limit(2).collect(Collectors.toList());//
		// stream'i listeye cevir
		// listem2.forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		streamTuto1();
	}
	
}
