package com.hamitmizrak.inheritance;

public class Msi extends Computer {
	
	public Msi() {
		super();
		
	}
	
	public Msi(String cpu, String ram, String smartMainBoard, String port) {
		super(cpu, ram, smartMainBoard, port);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Msi [getCpu()=" + getCpu() + ", getRam()=" + getRam() + ", getSmartMainBoard()=" + getSmartMainBoard()
				+ "]";
	}
	
}
