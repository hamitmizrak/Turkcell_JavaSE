package com.hamitmizrak.relation.a3_composition;

import java.util.ArrayList;

public class CompositionMainClass {
	
	public static void main(String[] args) {
		
		// (Single Class)
		Writer writer = new Writer();
		writer.setWriterName("Ne�at Nuri G�ltekin");
		
		// null pointer almamak i�in (1) olandan List olu�turmal�s�n.
		writer.setBookList(new ArrayList<Book>());
		
		// (multiple Class-1)
		Book book = new Book();
		book.setBookName("�al�ku�u");
		book.setWriter(writer); // kitaba yazar ekledim
		book.getWriter().getBookList().add(book); // Listeye kitap ekledim
		
		// (multiple Class-2)
		Book book2 = new Book();
		book2.setBookName("Yaprak D�k�m�");
		book2.setWriter(writer); // kitaba yazar ekledim
		book2.getWriter().getBookList().add(book2); // Listeye kitap ekledim
		
		// yazar ad�
		System.out.println("Yazar Ad�: " + writer.getWriterName());
		
		// kitaplar
		for (Book temp : book.getWriter().getBookList()) {
			System.out.println(temp);
			
		}
		
	}
	
}
