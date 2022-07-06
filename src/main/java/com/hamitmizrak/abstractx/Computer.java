package com.hamitmizrak.abstractx;

// kal�t�mda:
// Kal�t�m(Miras)
// �st atadan ald���m�z �zelliklere biz kal�t�m diyoruz.
// S�n�flar�n birbirinden t�remesine denir.

// abstract:
// Java single inheritance'dir.
// Kod tekrar�n� �nlemek
// temiz kod yazmam�za olanak sa�lar.
// b�y�k projelerde h�zl�ca yol almak
// esnelik sa�lar
// Class y�netimini rahatlat�r
// Maliyetleri azalt�r. (bak�m)

// abstract
// new ile yazamay�z
// g�vdeli - g�vdesiz metot olu�turulmaz
// polymorphism yazabiliriz.

abstract public class Computer {
	
	// Genel ortak �zellikler
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
	
	// govdeliMethod: g�vdeli metot yani curl {}
	public void govdeliMethod() {
		System.out.print("Computer Method: ");
	}
	
	// govdesizMethod: g�vdeli metot yani curl {}
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
