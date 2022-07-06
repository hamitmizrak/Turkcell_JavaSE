package com.hamitmizrak.inheritance;

// kal�t�mda:
// Kal�t�m(Miras)
// �st atadan ald���m�z �zelliklere biz kal�t�m diyoruz.
// S�n�flar�n birbirinden t�remesine denir.

// Kal�t�m:
// Java single inheritance'dir.
// Kod tekrar�n� �nlemek
// temiz kod yazmam�za olanak sa�lar.
// b�y�k projelerde h�zl�ca yol almak
// esnelik sa�lar
// Class y�netimini rahatlat�r
// Maliyetleri azalt�r. (bak�m)

// SuperClass
// Bir s�n�f ba�ka bir s�n�ftan t�r�yorsa �st ata yani parent �zelliklere
// superClass
// super.nesneDe�i�keni==> de�i�kenler
// super.metotEri�im => MEtot
// super() ==> Constructor
//

// SubClass
// Bir s�n�f ba�ka bir s�n�ftan t�r�yorsa alt yani chield classlara subClass
public class Computer {
	
	// Genel ortak �zellikler
	private String cpu;
	private String ram;
	private String smartMainBoard;
	private String port;
	
	// parametreli constructor
	public Computer() {
	}
	
	// parametresiz constructor
	public Computer(String cpu, String ram, String smartMainBoard, String port) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.smartMainBoard = smartMainBoard;
	}
	
	// toString
	@Override
	public String toString() {
		return "Asus [cpu=" + cpu + ", ram=" + ram + ", smartMainBoard=" + smartMainBoard + ", port=" + port + "]";
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
