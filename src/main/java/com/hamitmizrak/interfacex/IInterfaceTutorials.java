package com.hamitmizrak.interfacex;

// interface: bir arayüzdür
// önce söz veriyorum: kilo vereceðim imza (Gövdesiz metot)
// spor salona gitmek (Gövdeli metotut)

// gövdeli metot - gövdesiz metot yazabilirsiniz
// keyword: implements
// istediðimiz kadar implement yazýp virgülle ekleyebiliriz.
// polymorphism yapabiliriz.

// abstraction=interface+ abstact

// Access Modifier
// inheritance : public ,private ,protected , default(-) new ile
// oluþturabilirsin , 1tane extends
// abstract : public ,protected , default(-) new ile oluþturamazsýn , 1tane
// extends
// interface : public ,protected , default(-) new ile oluþturamazsýn , Ntane
// implements

// inheritance-abstract-interface
// temiz kod yazmamýza olanak saðlar
// polymorphism saðlar
// maliyeti düþürür.
// kod karmaþýklýðýndan kurtarýr.
// az kod çok iþ

// abstract -interface ortak özellikleri
// polymorphism yapabiliriz.
// soyutmalama yapabiliriz
// gövdeli metot yazabiliriz.
// gövdesiz metot yazabiliriz.

// abstract -interface farklý özellikleri
// abstract ==>ortak özelliklerde kullanmak
// extends(1),
// IS-A

// interface ==> farklý ortak özelliklerde
// implements(N)
// CAN-DO
// 100 % soyutlamadýr
// public static int sayi=44; //sabit deðiþken oluþturabilirsiniz

public interface IInterfaceTutorials {
	
	public void siteGit();
	
	public void sepetEkle();
	
	public void ode();
	
	public String al(int sayi);
	
}
