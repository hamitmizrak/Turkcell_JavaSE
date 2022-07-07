package com.hamitmizrak.lambdaexpression;

// Lambda Expression (Lambda Function)
// Tek ba��na bir anlam ifade etmez.
// Java 8 gelen �zelliklerdir.
// Okunabilir(readibility) yaz�labilir(writability) ve h�zl� kodlar yazmak
// sade kodlarla i�lem yapar�z.
// Lambda tek ba��na anlams�zd�r.

// Lambda expressions, i�levsel programlamay� kolayla�t�r�r ve geli�tirmeyi �ok
// basitle�tirir. Koleksiyondan verilerin yinelenmesine, filtrelenmesine ve
// ��kar�lmas�na yard�mc� olur.

// Lambda Arkas�nda G�� :JVM arkadaki lambdalar� birer interface �evirir.

// Lambda Function
// kullanmak i�in interface olu�turmal�y�z.
// g���n� interface al�r.
// stream api ile �ok kullan�l�r.

// interface
// dikkat sadece public ve -(default) yazabiliriz
// private ve protected yazamam

// Normal bir metot ======> Lambda Expression
// public void deneme() ==> {} (x)->{x*5}

// kullan�m� java () ->{}
// kullan�m� javascript () =>{}

// Java 8 gelen bir �zellik
// @FunctionalInterface ==> interface 1 tane g�vdesiz metot yazabilirsin ba�ka
// yazamazs�n

// Lambda Expression yazarken dikkat edece�imiz hususlar
// 1-) @FunctionInterface ==> 1 tane g�vdesiz metot yaz
// 2-) Parametre say�s� ve t�r� �a��randa ayn� olmal� (temp)=>{}
// 3-) return varsa return t�r� yaz�l�r

// interface 1 tane g�vdesiz metot yazabilirsin ba�ka yazamazs�n
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
				System.out.println(adi + "normal interface yap�s�");
			}
		};
		expressionData.deneme("arg�man verdim ");
		
		// Lambda Expression Interface
		ILambdaExpressionData expressionData2 = (temp) -> {
			System.out.println(temp + " function interface yap�s�");
		};
		expressionData2.deneme("arg�man verdim ");
	}
	
}
