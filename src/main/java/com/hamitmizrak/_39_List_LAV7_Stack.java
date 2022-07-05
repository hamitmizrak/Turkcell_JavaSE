package com.hamitmizrak;

import java.util.Stack;

public class _39_List_LAV7_Stack {
	
	// stack:
	// stack için: Kapalý bir kutu düþünebiliriz
	// LIFO (Last In First Out) ==> Son giren Ýlk Çýkar
	// java.util paketinden gelir
	
	// push ==>Eklemek
	// pop ==> çýkarmak
	// peek==> en üstteki eleman anlamýna gelir.
	
	public static void stackMethod() {
		Stack<String> stack = new Stack<>();
		stack.add("1.eleman");
		stack.add("2.eleman");
		stack.add("3.eleman");
		stack.add("100. eleman");
		
		System.out.println("En Üst Veri: " + stack.peek());
		
		System.out.println("*****************");
		
		stack.pop();// en üst elemandan veri çýkartýr
		for (int i = 0; i < stack.size(); i++) {
			System.out.println(stack.get(i));
		}
		System.out.println("*****************");
		stack.push("101. eleman");
		for (int i = 0; i < stack.size(); i++) {
			System.out.println(stack.get(i));
		}
	}
	
	public static void main(String[] args) {
		stackMethod();
	}
	
}
