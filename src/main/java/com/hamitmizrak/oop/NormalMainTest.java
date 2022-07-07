package com.hamitmizrak.oop;

public class NormalMainTest {
	
	public static void main(String[] args) {
		
		// polymorphism
		Computer computer = new Asus();
		
		// Asus
		System.out.println("\n******** Asus Class (Sub Class) ***********************");
		Asus asus = new Asus("asus-cpu", "asus-ram", "asus-smartMainBoard", "asus-port", "asus-voiceRecognation");
		// System.out.println(asus.getCpu() + asus.getSmartMainBoard() + asus.getRam());
		System.out.println(asus);
		asus.commonMethod();
		asus.govdesizMethod();
		
		// Msi
		System.out.println("\n******** Msi Class (Sub Class) ***********************");
		Msi msi = new Msi("msi-cpu", "msi-ram", "msi-smartMainBoard", "msi-port");
		msi.commonMethod();// Polymorphism:
		System.out.println(msi);
		msi.govdesizMethod();
		
	}
	
}