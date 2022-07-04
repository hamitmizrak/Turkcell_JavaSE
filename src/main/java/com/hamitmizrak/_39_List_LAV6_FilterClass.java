package com.hamitmizrak;

public class _39_List_LAV6_FilterClass {
	
	private long id;
	private String nameAndSurname;
	private int price;
	
	// parametresiz constructor
	public _39_List_LAV6_FilterClass() {
		this.id = 0;
		this.nameAndSurname = "adý ve soyadý girmediniz";
		this.price = 0;
	}
	
	// parametreli constructor
	public _39_List_LAV6_FilterClass(long id, String nameAndSurname, int price) {
		this.id = id;
		this.nameAndSurname = nameAndSurname;
		this.price = price;
	}
	
	// toString()
	@Override
	public String toString() {
		return "_39_List_LAV6_FilterClass [id=" + id + ", nameAndSurname=" + nameAndSurname + ", price=" + price + "]";
	}
	
	// getter and setter
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNameAndSurname() {
		return nameAndSurname;
	}
	
	public void setNameAndSurname(String nameAndSurname) {
		this.nameAndSurname = nameAndSurname;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
}
