package com.hamitmizrak;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class _39_List_LAV8_Queue {
	
	// queue:
	// queue i�in: iki taraf� a��k bir daire d���nebiliriz
	// FIFO (First In First Out) ==> �lk giren �lk ��kar
	// java.util paketinden gelir
	
	// verileri almka Iterator d�ng�s�nden almak gerekir
	
	// push ==>Eklemek
	// pop ==> ��karmak
	// peek==> en �stteki eleman anlam�na gelir.
	
	public static void queueMethod() {
		Queue<String> queue = new LinkedList();
		queue.add("1.eleman");
		queue.add("2.eleman");
		queue.add("3.eleman");
		queue.add("100. eleman");
		
		System.out.println("En �st Veri: " + queue.peek());
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
