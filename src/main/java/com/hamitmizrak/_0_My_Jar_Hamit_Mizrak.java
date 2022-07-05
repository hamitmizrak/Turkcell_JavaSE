package com.hamitmizrak;

import java.util.Scanner;

public class _0_My_Jar_Hamit_Mizrak {
	private static Scanner klavye = new Scanner(System.in);
	
	// user scanner data
	public static String userScanner() {
		System.out.println("+++++++++++\nbir seyler giriniz");
		String value = klavye.nextLine();
		return value;
	}
	
	// String ters yazmak (StringReverse) ==>Girilen kelimeyi ters yazdýran
	public static String stringReverse() {
		String temp = ""; // nullPointerException
		try {
			String data = userScanner();
			for (int i = data.length() - 1; i >= 0; i--) {
				temp = temp + data.charAt(i);
			}
			System.out.println(temp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return temp;
	}
	
	// girilen bir simgenin harf mi, sayý mý , özel simge mi
	
	// Palindrom
	// Girilen bir kelimenin tersten okunuþu ve düzden okunuþu ayný ise
	public static boolean isPalindrom() {
		try {
			String orijinalData = userScanner();
			String changeData = "";
			for (int i = orijinalData.length() - 1; i >= 0; i--) {
				changeData += orijinalData.charAt(i);
			}
			if (orijinalData.equals(changeData)) {
				System.out.println("Palindromdur");
				return true;
			} else {
				System.out.println("Palindrom Deðildir");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// faktöriyel
	public static boolean isFactoriyel() {
		try {
			int number = Integer.valueOf(userScanner());
			long factoriyelNumber = 1; // çarpmadan etkisiz eleman 1
			
			if (number < 0)
				System.out.println("Sýfýrdan küçük giremezsiniz");
			else if (number == 0 || number == 1)
				System.out.println("0! veya 1! cevabý : 1 ");
			else {
				for (int i = number; i >= 1; i--) {
					factoriyelNumber *= i;
				}
				System.out.println("Sonuç: " + factoriyelNumber);
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// faktoriyel
	
	// asal sayi
	
	// decoder encoder
	
	// fibonacci
	
	// Mükemmel sayi
	
	// deðiþken kullanmadan 2 sayýyýy deðiþtirmek
	
	// isLetter isDigit
	
	// Random UUID
	
	// Password Mask
	// Ebob
	// Ekok
	// diziler
	// Linear Search
	// Binary Search
	
	public static void main(String[] args) {
		// stringReverse();
		// isPalindrom();
		isFactoriyel();
	}
	
}
