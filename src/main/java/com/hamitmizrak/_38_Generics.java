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
	
	// normal Method
	public void normalMethod(String data) {
		System.out.println(data);
	}
	
	// Generic Method
	// dikkat: class ile ayn� generic sembolu kullanma yani "T" kullanma
	public <K> void genericsMethod1(K data) {
		System.out.println(data);
	}
	
	// Generic Method
	// dikkat: class ile ayn� generic sembolu kullanma yani "T" kullanma
	public <K> void genericsMethod2(K data1, K data2) {
		System.out.println(data1 + " " + data2);
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
		
		System.out.println("******** Generic method ********************");
		sinif.normalMethod("kelime");
		sinif.genericsMethod1(44);
		sinif.genericsMethod2(true, "merhabalar");
		
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
