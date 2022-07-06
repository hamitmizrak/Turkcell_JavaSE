package com.hamitmizrak.abstractx;

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
	public void govdeliMethod() {
		super.govdeliMethod();
		System.out.println("Asus ");
	}
	
	// gövdesiz metot
	@Override
	public void govdesizMethod(String name) {
		System.out.println("Msi Gövdesiz metot: " + name);
		
	}
	
	// toString()
	@Override
	public String toString() {
		return "Msi [getCpu()=" + getCpu() + ", getRam()=" + getRam() + ", getSmartMainBoard()=" + getSmartMainBoard()
				+ "]";
	}
	
}
