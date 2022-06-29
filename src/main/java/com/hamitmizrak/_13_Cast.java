package com.hamitmizrak;

public class _13_Cast {
	public static void main(String[] args) {
		
		// cast
		// 1-) f-L
		float f1 = 44.55f;
		float f2 = (float) 44.55;
		long l1 = 1252455645L;
		
		// 2-) küçük-büyük veri
		byte b1 = 12;
		long l2 = b1; // veri kaybı yoktur
		
		long l3 = 1515555L;
		byte b3 = (byte) l3;
		System.out.println(b3); // veri kaybı vardır
		
		// 3-) boxing -unboxing
		int primitive = 44;
		Integer wrapper = primitive; // boxing: primitive type ==> wrapper çevirmek
		
		Double wrapper2 = 454.15;// unboxing: Wrapper==> Primitive çevirdik
		double primitive2 = wrapper2;
		
		// 4-) String ==> int'e çevirdik
		String str = "44";
		int cast1 = Integer.valueOf(str); // wrapper
		int cast2 = Integer.parseInt(str); // primitive
		System.out.println(cast1 + cast2 + 14);
		
		// 5-) int ==> String'e çevirdik
		int number = 66;
		String cast3 = String.valueOf(number);// wrapper
		String cast4 = Integer.toString(number);// primitive
		System.out.println(cast3 + cast4 + 14);
		
		// 6-) String cast
		String str5 = 5 + ""; // buradaki tırnak String'e çeviriri
		
	}
}
