package com.hamitmizrak;

// Generics:
// <>
// T�r problemlerini ��zer
// casting ile u�ra�mazs�n�z
// dynamics
// var ==> java 10 gelen (Object)
// T�m referans tipleri bar�nd�r�r.

// Generics Class
public class _38_Generics<T> {
	
	// Generics Object variable
	private T data;
	
	// Generics Parametresiz constructor
	public _38_Generics() {
	}
	
	// Generics Parametreli constructor
	public _38_Generics(T data) {
		this.data = data;
	}
	
	// getter and setter
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		
		// dinamik bir veri g�nderim �ekli
		System.out.println("******** dinamik bir veri  ********************");
		_38_Generics sinif = new _38_Generics();
		sinif.setData(true);
		System.out.println(sinif.getData());
		
		// dinamik bir veri parametreli constructor g�nderim �ekli
		System.out.println("********** dinamik bir veri parametreli  constructor   ******************");
		_38_Generics sinif2 = new _38_Generics("const");
		System.out.println(sinif2.getData());
		
		// Generic type
		System.out.println("********** dinamik generics bir veri parametreli  constructor   ******************");
		_38_Generics<Boolean> sinif3 = new _38_Generics();
		sinif3.setData(true);
		System.out.println(sinif3.getData());
		
	}
	
}
