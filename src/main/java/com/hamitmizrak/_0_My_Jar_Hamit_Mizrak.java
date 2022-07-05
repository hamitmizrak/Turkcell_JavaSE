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
	
	// String ters yazmak (StringReverse) ==>Girilen kelimeyi ters yazd�ran
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
	
	// girilen bir simgenin harf mi, say� m� , �zel simge mi
	
	// Palindrom
	// Girilen bir kelimenin tersten okunu�u ve d�zden okunu�u ayn� ise
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
				System.out.println("Palindrom De�ildir");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// fakt�riyel
	public static boolean isFactoriyel() {
		try {
			int number = Integer.valueOf(userScanner());
			long factoriyelNumber = 1; // �arpmadan etkisiz eleman 1
			
			if (number < 0)
				System.out.println("S�f�rdan k���k giremezsiniz");
			else if (number == 0 || number == 1)
				System.out.println("0! veya 1! cevab� : 1 ");
			else {
				for (int i = number; i >= 1; i--) {
					factoriyelNumber *= i;
				}
				System.out.println("Sonu�: " + factoriyelNumber);
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
	
	// M�kemmel sayi
	
	// de�i�ken kullanmadan 2 say�y�y de�i�tirmek
	
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
