package com.hamitmizrak.inheritance;

public class Msi extends Computer {
	
	// parametresiz constructor
	public Msi() {
		
	}
	
	// parametreli constructor
	public Msi(String cpu, String ram, String smartMainBoard, String port) {
		super(cpu, ram, smartMainBoard, port);
	}
	
	// super classtan gelen özelliði override etmek
	@Override
	public void commonMethod() {
		super.commonMethod();
		System.out.println("Msi ");
	}
	
	// toString()
	@Override
	public String toString() {
		return "Msi [getCpu()=" + getCpu() + ", getRam()=" + getRam() + ", getSmartMainBoard()=" + getSmartMainBoard()
				+ "]";
	}
	
}
