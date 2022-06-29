package com.hamitmizrak;

// enum class interface
// Java 5 gelen özelliktir.
// type safe sağlar
// enum class interface
// new oluşturulmaz ==> enum, interface , abstract
// enum saymaya sıfırdan başlar
public class _27_EnumMainTest {
	public static void main(String[] args) {
		System.out.println(_27_Enum.CARSAMBA);
		
		_27_Enum enum1 = _27_Enum.CARSAMBA;
		System.out.println(enum1);
		System.out.println("Sira: " + enum1.ordinal());
		System.out.println("values: " + _27_Enum.values()[2]);
		
		String str = _27_Enum.CARSAMBA.toString();
		System.out.println(str);
		
		for (_27_Enum temp : _27_Enum.values()) {
			System.out.print(temp + " ");
		}
		
	}
}
