package com.hamitmizrak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

// step.1 -) File i�in CRUD i�lemi yapacak bir algoritma yap�n�z ?
// step.2 -) Bir Dosya okuyacak ba�ka bir dosyaya verileri yazacak ( Object)
// step.3 -) Bu projemiz �unuda yaps�n ?
// person.txt ve homework.txt diye bir dosyam�z olsun bu dosyalar
// person.txt dosyas�nda ==> ki�i ismi ve soyisimi olacak
// homework.txt dosyas�nda ==> verilecek �devler olacak
// Bilgisayar random olarak ki�iye �dev verecek

public class _35_FileIO4_FileCommonExamples {
	
	// S�n�f de�i�keni (Class variable)
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
		System.out.println("Se�im yap�n�z.");
		System.out.println("0-)��k��\n1-)Dosya olu�tur\n2-)Dosya Yaz\n3-)Dosya Oku\n4-)Dosya Sil\n5-)Dosya Bilgileri");
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
				System.out.println("Se�im d���nda bir de�er girdiniz....");
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
		System.out.println("Dosya ad�n� giriniz...");
		String fileName = klavye.nextLine();
		_35_FileIO4_FileClass pathClass = new _35_FileIO4_FileClass(dataMerge(fileName));
		return pathClass.getPath();
	}
	
	// create method
	private static void createDataFile() throws IOException {
		System.out.println("*** Dosya Olu�turmak ***");
		String path = createPath();
		MY_PATH = path;
		File file = new File(path);
		if (file.createNewFile()) {
			System.out.println(file.getAbsolutePath() + " Dosya olu�turuldu");
		} else {
			System.out.println("Olu�turulmad�");
		}
	}
	
	/////// write method
	private static void writeDataFile() {
		System.out.println("*** Dosya Yaz ***");
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(MY_PATH, true))) {
			klavye = new Scanner(System.in);
			System.out.println("Dosya yazmak i�in bir�eyler yaz�n�z...");
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
			System.out.println("Okumada sorun olu�tu");
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
		System.out.println("*** ��k�� ***");
		System.exit(0);
		
	}
	
	// show file
	private static void showFileData() {
		File file = new File(MY_PATH);
		System.out.println("toplam karakter say�s�: " + file.length());
		System.out.println("toplam GB : " + file.getTotalSpace());
		System.out.println("absolute path: " + file.getAbsolutePath());
		System.out.println("kullan�labilece�in GB : " + file.getUsableSpace());
		System.out.println("De�i�ikli�i Tarihi: " + new Date(file.lastModified()));
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
