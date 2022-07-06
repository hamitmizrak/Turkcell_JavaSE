package com.hamitmizrak.abstractx;

// kalýtýmda:
// Kalýtým(Miras)
// Üst atadan aldýðýmýz özelliklere biz kalýtým diyoruz.
// Sýnýflarýn birbirinden türemesine denir.

// abstract:
// Java single inheritance'dir.
// Kod tekrarýný önlemek
// temiz kod yazmamýza olanak saðlar.
// büyük projelerde hýzlýca yol almak
// esnelik saðlar
// Class yönetimini rahatlatýr
// Maliyetleri azaltýr. (bakým)

// abstract
// new ile yazamayýz
// gövdeli - gövdesiz metot oluþturulmaz
// polymorphism yazabiliriz.

abstract public class Computer {
	
	// Genel ortak özellikler
	protected String cpu;
	protected String ram;
	protected String smartMainBoard;
	protected String port;
	
	// parametreli constructor
	public Computer() {
	}
	
	// parametresiz constructor
	public Computer(String cpu, String ram, String smartMainBoard, String port) {
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
	
	// govdeliMethod: gövdeli metot yani curl {}
	public void govdeliMethod() {
		System.out.print("Computer Method: ");
	}
	
	// govdesizMethod: gövdeli metot yani curl {}
	abstract public void govdesizMethod(String name);
	
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
