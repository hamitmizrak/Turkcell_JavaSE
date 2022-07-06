package com.hamitmizrak.abstractx;

public class AbstractMainTest {
	
	public static void main(String[] args) {
		
		// super class new ile oluþturamazsýnýz
		System.out.println("\n******** Ana Class (Super Class) ***********************");
		// Polymorphism:
		Computer computer2 = new Msi("computer-cpu", "computer-ram", "computer-anakart", "computer-port");
		System.out.println(computer2);
		
		// Asus
		System.out.println("\n******** Asus Class (Sub Class) ***********************");
		Asus asus = new Asus("asus-cpu", "asus-ram", "asus-smartMainBoard", "asus-port", "asus-voiceRecognation");
		asus.govdeliMethod();// Polymorphism:
		asus.govdesizMethod("Hamit");// Polymorphism:
		System.out.println(asus);
		
		// Msi
		System.out.println("\n******** Msi Class (Sub Class) ***********************");
		Msi msi = new Msi("msi-cpu", "msi-ram", "msi-anakart", "msi-port");
		msi.govdeliMethod();// Polymorphism:
		msi.govdesizMethod("Hamit");// Polymorphism:
		System.out.println(msi);
		
	}
	
}
