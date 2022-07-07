package com.hamitmizrak.relation.a3_composition;

// N
public class Book {
	
	// nesne deðiþkeni
	private String bookName;
	
	// parametresiz constructor
	public Book() {
	}
	
	// parametreli constructor
	public Book(String bookName) {
		this.bookName = bookName;
	}
	
	// getter setter
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
}
