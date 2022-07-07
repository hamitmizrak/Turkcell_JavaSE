package com.hamitmizrak.relation.a3_composition;

import java.util.ArrayList;

public class CompositionMainClass {
	
	public static void main(String[] args) {
		
		// (Single Class)
		Writer writer = new Writer();
		writer.setWriterName("Neþat Nuri Gültekin");
		
		// null pointer almamak için (1) olandan List oluþturmalýsýn.
		writer.setBookList(new ArrayList<Book>());
		
		// (multiple Class-1)
		Book book = new Book();
		book.setBookName("Çalýkuþu");
		book.setWriter(writer); // kitaba yazar ekledim
		book.getWriter().getBookList().add(book); // Listeye kitap ekledim
		
		// (multiple Class-2)
		Book book2 = new Book();
		book2.setBookName("Yaprak Dökümü");
		book2.setWriter(writer); // kitaba yazar ekledim
		book2.getWriter().getBookList().add(book2); // Listeye kitap ekledim
		
		// yazar adý
		System.out.println("Yazar Adý: " + writer.getWriterName());
		
		// kitaplar
		for (Book temp : book.getWriter().getBookList()) {
			System.out.println(temp);
			
		}
		
	}
	
}
