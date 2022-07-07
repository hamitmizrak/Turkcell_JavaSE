package com.hamitmizrak.lambdaexpression;

// Lambda Expression (Lambda Function)
// Tek baþýna bir anlam ifade etmez.
// Java 8 gelen özelliklerdir.
// Okunabilir(readibility) yazýlabilir(writability) ve hýzlý kodlar yazmak
// sade kodlarla iþlem yaparýz.
// Lambda tek baþýna anlamsýzdýr.

// Lambda expressions, iþlevsel programlamayý kolaylaþtýrýr ve geliþtirmeyi çok
// basitleþtirir. Koleksiyondan verilerin yinelenmesine, filtrelenmesine ve
// çýkarýlmasýna yardýmcý olur.

// Lambda Arkasýnda Güç :JVM arkadaki lambdalarý birer interface çevirir.

// Lambda Function
// kullanmak için interface oluþturmalýyýz.
// güçünü interface alýr.
// stream api ile çok kullanýlýr.

// interface
// dikkat sadece public ve -(default) yazabiliriz
// private ve protected yazamam

// Normal bir metot ======> Lambda Expression
// public void deneme() ==> {} (x)->{x*5}

// kullanýmý java () ->{}
// kullanýmý javascript () =>{}

// Java 8 gelen bir özellik
// @FunctionalInterface ==> interface 1 tane gövdesiz metot yazabilirsin baþka
// yazamazsýn

// Lambda Expression yazarken dikkat edeceðimiz hususlar
// 1-) @FunctionInterface ==> 1 tane gövdesiz metot yaz
// 2-) Parametre sayýsý ve türü çaðýranda ayný olmalý (temp)=>{}
// 3-) return varsa return türü yazýlýr

// interface 1 tane gövdesiz metot yazabilirsin baþka yazamazsýn
@FunctionalInterface
interface ILambdaExpressionData {
	public void deneme(String adi);
}

public class LambdaExpression {
	
	public static void main(String[] args) {
		// Normal Interface
		ILambdaExpressionData expressionData = new ILambdaExpressionData() {
			@Override
			public void deneme(String adi) {
				System.out.println(adi + "normal interface yapýsý");
			}
		};
		expressionData.deneme("argüman verdim ");
		
		// Lambda Expression Interface
		ILambdaExpressionData expressionData2 = (temp) -> {
			System.out.println(temp + " function interface yapýsý");
		};
		expressionData2.deneme("argüman verdim ");
	}
	
}
