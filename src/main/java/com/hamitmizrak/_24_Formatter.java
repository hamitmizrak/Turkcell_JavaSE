package com.hamitmizrak;

public class _24_Formatter {
	public static void main(String[] args) {
		String str = "Java verileri";
		int decimal = 44;
		double virgul = 35.44;
		
		System.out.print("alt satira gecme");
		System.out.println("alt satira gecebilirsin");
		
		System.out.printf("%s %d %f", str, decimal, virgul);
		System.out.println();
		
		// 25s=sağa ötelemek
		// 5.2f = .2 virgülden sonra 2 hane getir
		System.out.printf("%25s %d %5.2f", str, decimal, virgul);
		System.out.println();
		
	}
	
}
