package com.hamitmizrak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

// step.1 -) File için CRUD iþlemi yapacak bir algoritma yapýnýz ?
// step.2 -) Bir Dosya okuyacak baþka bir dosyaya verileri yazacak ( Object)
// step.3 -) Bu projemiz þunuda yapsýn ?
// person.txt ve homework.txt diye bir dosyamýz olsun bu dosyalar
// person.txt dosyasýnda ==> kiþi ismi ve soyisimi olacak
// homework.txt dosyasýnda ==> verilecek ödevler olacak
// Bilgisayar random olarak kiþiye ödev verecek

public class _35_FileIO4_FileCommonExamples {
	
	// Sýnýf deðiþkeni (Class variable)
	private static Scanner klavye;
	
	private static String MY_PATH;
	
	_35_FileIO4_FileClass pathClass;
	
	// parametresiz constructor
	public _35_FileIO4_FileCommonExamples(_35_FileIO4_FileClass pathClass) {
		this.pathClass = new _35_FileIO4_FileClass();
	}
	
	// Chooise Method
	public static int chooise() {
		klavye = new Scanner(System.in);
		System.out.println("Seçim yapýnýz.");
		System.out.println("0-)Çýkýþ\n1-)Dosya oluþtur\n2-)Dosya Yaz\n3-)Dosya Oku\n4-)Dosya Sil\n5-)Dosya Bilgileri");
		return klavye.nextInt();
	}
	
	// mainMethod
	public static void mainMethod() throws IOException {
		int key = chooise();
		switch (key) {
			case 1:
				createDataFile();
				break;
			
			case 2:
				writeDataFile();
				break;
			
			case 3:
				ReadDataFile();
				break;
			
			case 4:
				deleteDataFile();
				break;
			
			case 5:
				showFileData();
				break;
			
			case 0:
				systemExist();
				break;
			
			default:
				System.out.println("Seçim dýþýnda bir deðer girdiniz....");
				break;
		}
	}
	
	// data Merge
	private static String dataMerge(String data) {
		StringBuilder builder = new StringBuilder();
		builder.append("C:\\turkcell\\").append(data).append(".txt");
		return builder.toString();
	}
	
	// create path
	private static String createPath() {
		klavye = new Scanner(System.in);
		// "C:\\turkcell\\data.txt"
		System.out.println("Dosya adýný giriniz...");
		String fileName = klavye.nextLine();
		_35_FileIO4_FileClass pathClass = new _35_FileIO4_FileClass(dataMerge(fileName));
		return pathClass.getPath();
	}
	
	// create method
	private static void createDataFile() throws IOException {
		System.out.println("*** Dosya Oluþturmak ***");
		String path = createPath();
		MY_PATH = path;
		File file = new File(path);
		if (file.createNewFile()) {
			System.out.println(file.getAbsolutePath() + " Dosya oluþturuldu");
		} else {
			System.out.println("Oluþturulmadý");
		}
	}
	
	/////// write method
	private static void writeDataFile() {
		System.out.println("*** Dosya Yaz ***");
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(MY_PATH, true))) {
			klavye = new Scanner(System.in);
			System.out.println("Dosya yazmak için birþeyler yazýnýz...");
			String vocabulary = klavye.nextLine();
			_35_FileIO4_FileClass class1 = new _35_FileIO4_FileClass();
			bufferedWriter.write(class1.getDate() + " ==> " + vocabulary);
			bufferedWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//////// read method
	private static void ReadDataFile() {
		System.out.println("*** Dosya Oku ***");
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(MY_PATH))) {
			StringBuilder builder = new StringBuilder();
			String satir = "";
			while ((satir = bufferedReader.readLine()) != null) {
				builder.append(satir);
			}
			System.out.println(builder);
		} catch (Exception e) {
			System.out.println("Okumada sorun oluþtu");
			e.printStackTrace();
		}
		
	}
	
	///// delete method
	private static void deleteDataFile() {
		System.out.println("*** Dosya Sil ***");
		// try-with resources
	}
	
	////// exit
	private static void systemExist() {
		System.out.println("*** Çýkýþ ***");
		System.exit(0);
		
	}
	
	// show file
	private static void showFileData() {
		File file = new File(MY_PATH);
		System.out.println("toplam karakter sayýsý: " + file.length());
		System.out.println("toplam GB : " + file.getTotalSpace());
		System.out.println("absolute path: " + file.getAbsolutePath());
		System.out.println("kullanýlabileceðin GB : " + file.getUsableSpace());
		System.out.println("Deðiþikliði Tarihi: " + new Date(file.lastModified()));
	}
	
	public static void main(String[] args) {
		try {
			for (;;) {
				mainMethod();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
