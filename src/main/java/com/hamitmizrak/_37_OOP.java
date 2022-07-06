package com.hamitmizrak;

// OOP: Object Oriented Programming
// Obje(nesne) nedir ? Tanýmlayabildiðimiz özellikleri olan herþeydir.

// Nesne: özelliði olan herþeydir.
// Class: nesneler topluluðudur.
// Package: Classlar topluluðudur.

// nesne deðiþkeni:(static yoksa) ==> private String name;
// class deðiþkeni:(static varsa) ==> private static String name;

// encapsulation(kapsülleme)
// private kullanarak verileri sadece ilgili yeri göstermek
// dýþ dünayaya getter and setter ile eriþim saðlanýr.
// Dýþ dünyadan iç verileri saklamak için

// constructor: Yapýcý metottur eðer biz class instance edersek(new)
// Classýn ilk uðraycaðý yerdir
// return edilemez.
// Class isimiyle aynýdýr.
// biz eðer cosntructor oluþturmak java arka planda kendisi yapar.
// parametreli ve parametresiz diye ikiye ayrýlýr.

// break: döngüyü kýrmak (döngüden çýkmak)
// return metodu kýrmak (metotdan çýkmak)
// continue: döngüde sadece o þarta çalýþmasýn sonrasýnda dönyüye devam etsin.

// cast: dönüþtürmek

// toString() ==> variable kullanýrsa Çevirmek için.
// toString() ==> classta kullanýrsak ==> Kimliktir.

// hashCode: O classýn sadece unique(Eþsiz) bir anahtarý vardýr.

// boxing: primitive türü Wrapper çevirmek
// unboxing: Wrapper'ý Primitive çevirmek

// null pointer exception: olmayan bir þeye eriþmeye çalýþýyorsunuz
// exception handling: exception yakalamak

// argüman: metodu çaðýrýrken verdiðimiz deðerdir.
// parametre: meetot oluþturulurken kullandýðýmýz verilerdir.

// @Override: Var olan veriyi ezmek yani ben ne dersem o olur demektir.
// Overloading: Ayný metotun sadece parametre sayýsý ve türü farklý olamasýna
// denir.

// final
// deðiþkenlerde : sabit
// metotlarda : override edemeyiz.
// classlarda: extends edemeyiz.

// static:
// duraðan demektir.
// new oluþturmadan verilerimizi => ClassAdi.staticIsim
// Örneðin: Math classý

// Java 100 % OOP deðildir (Primitive türden dolayý)
// Nesnelerin kendilerine ait özellikleri vardýr.
// OOP access modifier iyi öðrenmek gerekir.
// public, private, protected, -
// new :(instance) yani bizim için hafýzadan yer açýyor. (Doðmuþ)
// null : Hafýzada bir yer kaplamayan (Doðmamýþ)
// sýfýr: hafýzada bir yere sahip ancak deðeri sýfýrdýr.

// this:
// global deðiþkenlere eriþmek ==> this.surname
// Baþka constructorlarý çaðýrmak ==> this(44,"merhabalar")

// super:
// üst atadaki verilere, metotlara eriþim saðlamak için kullanýlýr.

// ? : Yani buraya her þey gelebilir yani object

// 0 ==> toplamada etkisiz çarpmada yutan eleman
// 1 ==> çarpmada etkisiz
// initial Data: baþlangýç deðerini vermektir.

// is-a (Inheritance)
// can-do (interface)
// has-a (Composition)

// Bean: (Çekirdek)
// POJO < bean < @ManagementBean < CDI (@Named)
// POJO: Plain Old Java Object (sadece nesne deðiþkeni ve gettersetter
// topluluðudur)
// BEAN: nesne deðiþkeni ve gettersetter, constructor(parametreli-parametresiz),
// serializable, toString,EqualHashCode topluluðudur)
// management ==> JSF
// CDI ==> Spring Framework(@Inject) Spring Boot (@Autowired)

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// local variable
// global variable

// instanceOf

// polymorphism: çok biçimlilik

// runtime error
// compiler error
// syntac error

// business layer:

// katmanlý mimari: n-tier architecture - monolitik architecture

// Java => % 100 By pass value

// MVC nedir ? Model-Controller-View

// ER Diagram nedir ?

// JIRA nedir ? Prpje yönetim program aracýdýr.

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// UML diagram ?
// Unifield Modeling Language :
// 1995 standart bir dil oluþturalým. bunun adýna UML
// UML: Bir modelleme dilidir.
// standartlaþtýrýlmýþ kalýplar bize sunar
// Büyük resmi görmemize olanak saðlar.
// Yazýlýmýclar ve diðer deparment kiþilerin basit , kolay, bir þekilde
// anlaþabilmesini saðlar.
// Karmaþýklýk basitleþtirilmesini saðlamak

// Tool: umlet , draw.io , paint 3D
// creately.com

// UML Çeþitleri:
// 1-) Yapý Diagram (database modelleme vs)
// 2-) Davranýþ modelleme (Baþlangýç-Bitiþ göstermek)

// Bilmemiz gerekir.
// public,private,protected
// method
// class
// packet
// inheritance,interface,abstract

// UML class
// 1-) CLASS
// 2-) DEÐÝÞKENLER
// 3-) METOTLAR

// public (+)
// private (-)
// protected (#)
// static (__)
// public void deneme(int sayi1,int sayi2) {} ==>
// +deneme(sayi1:number,sayi:number):void

// DevOps bir felsefedir.
// Developers and Operations : Bilgi Teknolojileri (IT)
// Agile

// OOP 4 temel Prensibi nelerdir ?
// I ==> Inheritance/Kalýtým)
// P ==> Polymorhism (Çok Biçimlilik)
// E ==> Encapsulation (sarmalayýcý)
// A ==> Abstraction(abstract+interface)
// abstraction: Soyutlama
// abstract:soyut

// SOLID

public class _37_OOP {
	
}
