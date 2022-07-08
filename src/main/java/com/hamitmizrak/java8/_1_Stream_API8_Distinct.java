package com.hamitmizrak.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// forEach
public class _1_Stream_API8_Distinct {
	
	public static void streamTuto1() {
		
		List<String> listem = Arrays.asList("malatya", "istanbul", "ankara", "malatya", "bursa", "bolu");
		
		// distinct() ==> Var olan listedeki tekrar eden verileri yazd�rmayan liste
		
		// listedeki malatya ge�enleri bana listele
		List<String> listem2 = listem.stream()// ba�lan��
				.distinct().sorted().collect(Collectors.toList());
		
		listem2.forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		streamTuto1();
	}
	
}
