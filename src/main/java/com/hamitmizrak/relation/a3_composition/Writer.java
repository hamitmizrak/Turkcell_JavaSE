package com.hamitmizrak.relation.a3_composition;

// 1
public class Writer {
	
	// nesne deðiþkeni
	private String writerName;
	
	// parametresiz constructor
	public Writer() {
	}
	
	// parametreli constructor
	public Writer(String writerName) {
		this.writerName = writerName;
	}
	
	// getter and setter
	public String getWriterName() {
		return writerName;
	}
	
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	
}
