package com.hamitmizrak;

// Generics:
// <>
// Tür problemlerini çözer
// casting ile uðraþmazsýnýz
// dynamics
// var ==> java 10 gelen (Object)
// Tüm referans tipleri barýndýrýr.

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
		
		// dinamik bir veri gönderim þekli
		System.out.println("******** dinamik bir veri  ********************");
		_38_Generics sinif = new _38_Generics();
		sinif.setData(true);
		System.out.println(sinif.getData());
		
		// dinamik bir veri parametreli constructor gönderim þekli
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
