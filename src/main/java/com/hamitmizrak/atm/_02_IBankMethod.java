package com.hamitmizrak.atm;

public interface _02_IBankMethod {
	
	// para g�r�n�t�le
	public void showMoney();
	
	// para eklesin
	public void addMoney();
	
	// para �eksin
	public void reduceMoney();
	
	// havale: ayn� banka
	public void sendHavaleMoney();
	
	// EFT: farkl� bankalara para g�rmek
	public void sendEftMoney();
	
	// mail send
	public void sendEmail();
	
}
