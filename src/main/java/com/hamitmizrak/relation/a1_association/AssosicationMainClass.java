package com.hamitmizrak.relation.a1_association;

public class AssosicationMainClass {
	public static void main(String[] args) {
		Market market = new Market();
		market.setMatketAdi("xyz market");
		
		Person person = new Person();
		person.setInsanAdi("klm insan");
		
		System.out.println("Association: " + market.getMatketAdi() + " " + person.getInsanAdi());
	}
	
}
