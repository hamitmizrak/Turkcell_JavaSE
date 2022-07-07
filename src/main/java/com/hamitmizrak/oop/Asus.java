package com.hamitmizrak.oop;

import com.hamitmizrak.interfacex.IInterfaceTutorials;

public class Asus extends Computer implements IInterfaceTutorials {
	
	private String voiceRecognation;
	
	// parametresiz constructor
	public Asus() {
	}
	
	// parametreli constructor
	public Asus(String cpu, String ram, String smartMainBoard, String port, String voiceRecognation) {
		super(cpu, ram, smartMainBoard, port);
		this.voiceRecognation = voiceRecognation;
	}
	
	// toString
	@Override
	public String toString() {
		return "Asus [voiceRecognation=" + voiceRecognation + ", cpu=" + cpu + ", ram=" + ram + ", smartMainBoard="
				+ smartMainBoard + ", port=" + port + "]";
	}
	
	// commonMethod
	public void commonMethod() {
		System.out.print("Computer Method: ");
	}
	
	@Override
	public void govdesizMethod() {
		System.out.println("asus gövdesiz");
		
	}
	
	// interface method
	@Override
	public void siteGit() {
		System.out.println("Xyz eticaret");
		
	}
	
	@Override
	public void sepetEkle() {
		System.out.println("sepet ekledim eticaret");
		
	}
	
	@Override
	public void ode() {
		System.out.println("Ödedim");
		
	}
	
	@Override
	public String al(int sayi) {
		System.out.println("al: " + sayi);
		return "tamamdir";
	}
	
	// getter Setter
	
	public String getVoiceRecognation() {
		return voiceRecognation;
	}
	
	public void setVoiceRecognation(String voiceRecognation) {
		this.voiceRecognation = voiceRecognation;
	}
	
}