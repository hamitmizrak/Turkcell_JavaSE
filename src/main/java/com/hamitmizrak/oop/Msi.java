package com.hamitmizrak.oop;

public class Msi extends Computer {
	
	// parametresiz constructor
	public Msi() {
	}
	
	// parametreli constructor
	public Msi(String cpu, String ram, String smartMainBoard, String port) {
		super(cpu, ram, smartMainBoard, port);
		
	}
	
	// toString
	@Override
	public String toString() {
		return "Msi [cpu=" + cpu + ", ram=" + ram + ", smartMainBoard=" + smartMainBoard + ", port=" + port + "]";
	}
	
	// commonMethod
	public void commonMethod() {
		System.out.print("MSÝ Computer Method: ");
	}
	
	@Override
	public void govdesizMethod() {
		System.out.println("msi gövdesiz");
		
	}
	
}