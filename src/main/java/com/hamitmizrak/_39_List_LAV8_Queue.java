package com.hamitmizrak;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class _39_List_LAV8_Queue {
	
	// queue:
	// queue için: iki tarafý açýk bir daire düþünebiliriz
	// FIFO (First In First Out) ==> Ýlk giren Ýlk Çýkar
	// java.util paketinden gelir
	
	// verileri almka Iterator döngüsünden almak gerekir
	
	// push ==>Eklemek
	// pop ==> çýkarmak
	// peek==> en üstteki eleman anlamýna gelir.
	
	public static void queueMethod() {
		Queue<String> queue = new LinkedList();
		queue.add("1.eleman");
		queue.add("2.eleman");
		queue.add("3.eleman");
		queue.add("100. eleman");
		
		System.out.println("En Üst Veri: " + queue.peek());
		System.out.println("*****************");
		
		Iterator iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		queue.clear();
		
	}
	
	public static void main(String[] args) {
		queueMethod();
	}
	
}
