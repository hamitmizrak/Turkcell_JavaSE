package com.hamitmizrak;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class _14_JOptionPane {
	public static void main(String[] args) {
		
		// Scanner
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int number1 = klavye.nextInt();
		System.out.println(Math.pow(number1, number1));
		
		// JOptionPane
		String str = JOptionPane.showInputDialog("Lütfen bir sayı giriniz");
		int number2 = Integer.valueOf(str);
		int number3 = Integer.parseInt(str);
		int number4 = Integer.parseInt(JOptionPane.showInputDialog("Lütfen bir sayı giriniz"));
		System.out.println(number4 + 4);
		
	}
}
