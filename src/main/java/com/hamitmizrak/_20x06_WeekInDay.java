package com.hamitmizrak;

import java.util.Scanner;

public class _20x06_WeekInDay {
	public static void main(String[] args) {
		
		// kullanıcıdan alınan günü Switch case ile gösterelim ?
		Scanner klavye = new Scanner(System.in);
		System.out.println("Gün girelim");
		String day = klavye.nextLine();
		// default: sali
		switch (day) {
			case "pazartesi":
				System.out.println("pazartesi");
				break;
			case "sali":
				System.out.println("sali");
				break;
			case "persembe":
				System.out.println("perşembe");
				break;
			case "carsamba":
				System.out.println("carsamba");
				break;
			case "cumartesi":
				System.out.println("cumartesi");
				break;
			case "pazar":
				System.out.println("pazar");
				break;
			case "cuma":
				System.out.println("cuma");
				break;
			
			default:
				System.out.println("Haftanın günleri dışındasınız.");
				break;
		}
	}
}
