package com.hamitmizrak;

import java.util.Scanner;

// kullanıcı tarafından girilen bir parola için ilk ve son harfi haricinde *
// eklensin ?
// Hamit ==> H****t
public class _20x09_RegisterPasswordMask {
	
	// kullanıcıdan alınan data
	public String scannerValueData() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("+++++++++++\nbir seyler giriniz");
		String value = klavye.nextLine();
		return value;
	}
	
	// girilen kelimeyi ilk ve son karakter harici maskeleyen algoritma
	public String stringPasswordMask() {
		String value = scannerValueData();
		String temp = "", allValue = ""; // nullPointerException
		for (int i = 0; i < value.length() - 1; i++) {
			if ((value.charAt(i) == value.charAt(0)) || (value.charAt(i) == value.length() - 1))
				continue;
			temp += value.replace(value.charAt(i), '*').charAt(i);
			
		}
		allValue = value.charAt(0) + temp.concat(value.charAt(value.length() - 1) + " ");
		System.out.println(allValue);
		return temp;
	}
	
	// main method
	public static void main(String[] args) {
		for (;;) {
			_20x09_RegisterPasswordMask mask = new _20x09_RegisterPasswordMask();
			mask.stringPasswordMask();
		}
	}
	
}
