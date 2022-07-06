package com.hamitmizrak;

import java.util.Objects;

// BEAN= POJO: Plain Old Java Object +constructor+seriable+toString
public class _37_OOP_x2_Bean {
	
	// Javada b�t�n classlar�n atas� Object
	
	// Nesne De�i�kenleri
	private String name;
	private String surname;
	
	// parametresiz construcor
	public _37_OOP_x2_Bean() {
		
	}
	
	// parametreli constructor
	public _37_OOP_x2_Bean(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	// Overloading
	public _37_OOP_x2_Bean(String surname) {
		this.surname = surname;
	}
	
	// toString() => bu class new ile olu�turdu�umuzda class� �a��rd���m�zda veriler
	// hepsi gelir
	@Override
	public String toString() {
		return "_37_OOP_x1_POJO [name=" + name + ", surname=" + surname + "]";
	}
	
	// HashCode: her bir class�n sadece kendisine ait (unique) bir de�erine vard�r.
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
		_37_OOP_x2_Bean other = (_37_OOP_x2_Bean) obj;
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
