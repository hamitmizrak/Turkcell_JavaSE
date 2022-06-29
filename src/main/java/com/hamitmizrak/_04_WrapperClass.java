package com.hamitmizrak;

public class _04_WrapperClass {
	
	public static void main(String[] args) {
		
		// primitive types: stack memory: hafıza uzayı belli olan,heap'e göre daha
		// hızlıdır deneme44
		
		// tam sayılar
		byte b1 = 44;
		// b1=null;
		short s1 = 129;
		int i1 = 444;
		long l1 = 1L + 2L;
		
		// Virgüllü sayılar
		float f2 = 44.55f;
		double d2 = 44.56;
		
		boolean b3 = 3 > 1;
		char c3 = '\u1252';
		//////////////////////////////////////////
		// Wrapper
		Byte wrap1 = 45;// new Byte((byte) 45);
		System.out.println(wrap1);
		wrap1 = null;
		System.out.println(wrap1);
		
	}
	
}
