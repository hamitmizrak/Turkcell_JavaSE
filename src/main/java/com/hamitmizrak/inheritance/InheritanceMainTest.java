package com.hamitmizrak.inheritance;

public class InheritanceMainTest {
	
	public static void main(String[] args) {
		
		// Asus
		Asus asus = new Asus("asus-cpu", "asus-ram", "asus-smartMainBoard", "asus-port", "asus-voiceRecognation");
		// System.out.println(asus.getCpu() + asus.getSmartMainBoard() + asus.getRam());
		System.out.println(asus);
		
		System.out.println("*********************************************************************");
		
		// Msi
		Msi msi = new Msi("msi-cpu", "msi-ram", "msi-anakart", "msi-port");
		// System.out.println(msi.getCpu() + msi.getSmartMainBoard() + msi.getRam());
		System.out.println(msi);
		
		// String result = (asus instanceof Asus) ? "Evet asus Asus'tan türemiþ" :
		// "Hayýr asus Asus'tan türemiþ";
		// System.out.println(result);
		
	}
	
}
