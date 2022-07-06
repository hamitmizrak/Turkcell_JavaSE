package com.hamitmizrak;

import java.util.Objects;

// BEAN= POJO: Plain Old Java Object +constructor+seriable+toString
public class _37_OOP_x1_POJO {
	
	// Javada bütün classlarýn atasý Object
	
	// Nesne Deðiþkenleri
	private String name;
	private String surname;
	
	// parametresiz construcor
	public _37_OOP_x1_POJO() {
		
	}
	
	// parametreli constructor
	public _37_OOP_x1_POJO(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	// Overloading
	public _37_OOP_x1_POJO(String surname) {
		this.surname = surname;
	}
	
	// toString() => bu class new ile oluþturduðumuzda classý çaðýrdýðýmýzda veriler
	// hepsi gelir
	@Override
	public String toString() {
		return "_37_OOP_x1_POJO [name=" + name + ", surname=" + surname + "]";
	}
	
	// HashCode: her bir classýn sadece kendisine ait (unique) bir deðerine vardýr.
	@Override
	public int hashCode() {
		return Objects.hash(name, surname);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		_37_OOP_x1_POJO other = (_37_OOP_x1_POJO) obj;
		return Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
	}
	
	// Method -1
	public void fullName() {
		System.out.println(this.name + this.surname);
	}
	
	// getter and setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}
