package com.hamitmizrak.oop;

public class Asus extends Computer {
	
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
		System.out.println("asus g�vdesiz");
		
	}
	
	// getter Setter
	
	public String getVoiceRecognation() {
		return voiceRecognation;
	}
	
	public void setVoiceRecognation(String voiceRecognation) {
		this.voiceRecognation = voiceRecognation;
	}
	
}