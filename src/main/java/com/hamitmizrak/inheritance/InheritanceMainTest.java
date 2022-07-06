package com.hamitmizrak.inheritance;

public class InheritanceMainTest {
	
	public static void main(String[] args) {
		
		System.out.println("\n******** Ana Class (Super Class) ***********************");
		Computer computer = new Computer("computer-cpu", "computer-ram", "computer-anakart", "computer-port");
		System.out.println(computer);
		
		System.out.println("\n******** Ana Class (Super Class) ***********************");
		Computer computer2 = new Msi("computer-cpu", "computer-ram", "computer-anakart", "computer-port");
		System.out.println(computer2);
		
		// Asus
		System.out.println("\n******** Asus Class (Sub Class) ***********************");
		Asus asus = new Asus("asus-cpu", "asus-ram", "asus-smartMainBoard", "asus-port", "asus-voiceRecognation");
		// System.out.println(asus.getCpu() + asus.getSmartMainBoard() + asus.getRam());
		System.out.println(asus);
		asus.commonMethod();// Polymorphism:
		
		// Msi
		System.out.println("\n******** Msi Class (Sub Class) ***********************");
		Msi msi = new Msi("msi-cpu", "msi-ram", "msi-anakart", "msi-port");
		// System.out.println(msi.getCpu() + msi.getSmartMainBoard() + msi.getRam());
		msi.commonMethod();// Polymorphism:
		System.out.println(msi);
		
		// String result = (asus instanceof Asus) ? "Evet asus Asus'tan türemiþ" :
		// "Hayýr asus Asus'tan türemiþ";
		// System.out.println(result);
		
	}
	
}
