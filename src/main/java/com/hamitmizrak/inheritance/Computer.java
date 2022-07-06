package com.hamitmizrak.inheritance;

// kalýtýmda:
// Kalýtým(Miras)
// Üst atadan aldýðýmýz özelliklere biz kalýtým diyoruz.
// Sýnýflarýn birbirinden türemesine denir.

// Kalýtým:
// Java single inheritance'dir.
// Kod tekrarýný önlemek
// temiz kod yazmamýza olanak saðlar.
// büyük projelerde hýzlýca yol almak
// esnelik saðlar
// Class yönetimini rahatlatýr
// Maliyetleri azaltýr. (bakým)

// SuperClass
// Bir sýnýf baþka bir sýnýftan türüyorsa üst ata yani parent özelliklere
// superClass
// super.nesneDeðiþkeni==> deðiþkenler
// super.metotEriþim => MEtot
// super() ==> Constructor
//

// SubClass
// Bir sýnýf baþka bir sýnýftan türüyorsa alt yani chield classlara subClass
public class Computer {
	
	// Genel ortak özellikler
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
