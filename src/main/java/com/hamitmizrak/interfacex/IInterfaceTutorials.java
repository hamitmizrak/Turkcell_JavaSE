package com.hamitmizrak.interfacex;

// interface: bir aray�zd�r
// �nce s�z veriyorum: kilo verece�im imza (G�vdesiz metot)
// spor salona gitmek (G�vdeli metotut)

// g�vdeli metot - g�vdesiz metot yazabilirsiniz
// keyword: implements
// istedi�imiz kadar implement yaz�p virg�lle ekleyebiliriz.
// polymorphism yapabiliriz.

// abstraction=interface+ abstact

// Access Modifier
// inheritance : public ,private ,protected , default(-) new ile
// olu�turabilirsin , 1tane extends
// abstract : public ,protected , default(-) new ile olu�turamazs�n , 1tane
// extends
// interface : public ,protected , default(-) new ile olu�turamazs�n , Ntane
// implements

// inheritance-abstract-interface
// temiz kod yazmam�za olanak sa�lar
// polymorphism sa�lar
// maliyeti d���r�r.
// kod karma��kl���ndan kurtar�r.
// az kod �ok i�

// abstract -interface ortak �zellikleri
// polymorphism yapabiliriz.
// soyutmalama yapabiliriz
// g�vdeli metot yazabiliriz.
// g�vdesiz metot yazabiliriz.

// abstract -interface farkl� �zellikleri
// abstract ==>ortak �zelliklerde kullanmak
// extends(1),
// IS-A

// interface ==> farkl� ortak �zelliklerde
// implements(N)
// CAN-DO
// 100 % soyutlamad�r
// public static int sayi=44; //sabit de�i�ken olu�turabilirsiniz

public interface IInterfaceTutorials {
	
	public void siteGit();
	
	public void sepetEkle();
	
	public void ode();
	
	public String al(int sayi);
	
}
