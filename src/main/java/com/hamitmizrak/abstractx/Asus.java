package com.hamitmizrak.abstractx;

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
	
	// super classtan gelen �zelli�i override etmek
	@Override
	public void govdeliMethod() {
		super.govdeliMethod();
		System.out.println("Asus ");
	}
	
	// g�vdesiz metot
	@Override
	public void govdesizMethod(String name) {
		System.out.println("Asus G�vdesiz metot: " + name);
		
	}
	
	// toString()
	@Override
	public String toString() {
		return "Asus [voiceRecognation=" + voiceRecognation + "]";
	}
	
	// getter and setter
	public String getVoiceRecognation() {
		return voiceRecognation;
	}
	
	public void setVoiceRecognation(String voiceRecognation) {
		this.voiceRecognation = voiceRecognation;
	}
	
}
