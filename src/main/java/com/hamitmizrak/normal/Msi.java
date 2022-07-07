package com.hamitmizrak.normal;

public class Msi {
	
	// Genel ortak özellikler
	private String cpu;
	private String ram;
	private String smartMainBoard;
	private String port;
	
	// parametreli constructor
	public Msi() {
	}
	
	// parametresiz constructor
	public Msi(String cpu, String ram, String smartMainBoard, String port) {
		this.cpu = cpu;
		this.ram = ram;
		this.smartMainBoard = smartMainBoard;
		this.port = port;
	}
	
	// toString
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", smartMainBoard=" + smartMainBoard + ", port=" + port + "]";
	}
	
	// commonMethod
	public void commonMethod() {
		System.out.print("Computer Method: ");
	}
	
	// getter Setter
	public String getCpu() {
		return cpu;
	}
	
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	public String getRam() {
		return ram;
	}
	
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	public String getSmartMainBoard() {
		return smartMainBoard;
	}
	
	public void setSmartMainBoard(String smartMainBoard) {
		this.smartMainBoard = smartMainBoard;
	}
	
}