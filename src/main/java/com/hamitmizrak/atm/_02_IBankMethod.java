package com.hamitmizrak.atm;

public interface _02_IBankMethod {
	
	// para görünütüle
	public void showMoney();
	
	// para eklesin
	public void addMoney();
	
	// para çeksin
	public void reduceMoney();
	
	// havale: ayný banka
	public void sendHavaleMoney();
	
	// EFT: farklý bankalara para görmek
	public void sendEftMoney();
	
	// mail send
	public void sendEmail();
	
}
