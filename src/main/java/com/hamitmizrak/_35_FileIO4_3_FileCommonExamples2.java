package com.hamitmizrak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

// step.1 -) Data.txt dosyas�n� default olarak olu�tururmam�z gerekiyor ?
// step.2 -) Roller belirliyoruz 1-)ADMIN(X+,W+,R+) 2-)WRITER(X-,W+,R+)
// 3-)USER(X-, W- ,R+) x=execute w=write r=read
// step.1 -) Sonras�nda ekranda Se�im i�in

// ### SE�IM YAPINIZ ###
// 0-)��k��
// 1-)Dosya olu�tur
// 2-)Dosya Yaz
// 3-)Dosya Oku
// 4-)Dosya Sil
// 5-)Dosya Bilgileri
// 6-)Rol de�i�tir
// 7-)B�t�n Dosyalar

// step.3 -) File i�in CRUD i�lemi yapacak bir algoritma yap�n�z ?
// step.4 -) olu�turulan her bir dosyaya enum ile
// ADMIN(yazma,okuma,olu�turmad�r),WRITER(yazma veokumada�r),USER(okumak)
// rollerini en sola yazal�m ==> ADMIN 30/Haziran/2022 12:26:01 yazd�mmm
// step.5 -) Bir Dosya okuyacak ba�ka bir dosyaya verileri yazacak ( Object)
// step.6 -) Bu projemiz �unuda yaps�n ?
// person.txt ve homework.txt diye bir dosyam�z olsun bu dosyalar
// person.txt dosyas�nda ==> ki�i ismi ve soyisimi olacak
// homework.txt dosyas�nda ==> verilecek �devler olacak
// Bilgisayar random olarak ki�iye �dev verecek

public class _35_FileIO4_3_FileCommonExamples2 {
	
	// S�n�f de�i�keni (Class variable)
	private static Scanner klavye;
	
	// file path
	private static String MY_PATH = new _35_FileIO4_1_FileClass().getPath();
	
	// File new
	private static File file = new File(MY_PATH);
	
	// roles
	private static int MY_ROLES;
	
	// file class
	_35_FileIO4_1_FileClass pathClass;
	
	// parametresiz constructor
	public _35_FileIO4_3_FileCommonExamples2(_35_FileIO4_1_FileClass pathClass) {
		this.pathClass = new _35_FileIO4_1_FileClass();
	}
	
	// Chooise Method
	public static int chooise() {
		klavye = new Scanner(System.in);
		String originStaticValue = "### Se�im Yap�n�z ###".toUpperCase();
		System.out.println(originStaticValue);
		System.out.println(
				"0-)��k��\n1-)Dosya olu�tur\n2-)Dosya Yaz\n3-)Dosya Oku\n4-)Dosya Sil\n5-)Dosya Bilgileri\n6-)Rol de�i�tir\n7-)B�t�n Dosyalar");
		return klavye.nextInt();
	}
	
	// ADMIN(1, "admin"), WRITER(2, "writer"), USER(3, "user");
	// mainMethod
	public static void mainMethod(int perm) throws IOException, _35_FileIO4_0_FileClassException {
		int key = chooise();
		switch (key) {
			case 1:
				if (MY_ROLES != _35_FileIO4_2_Enum.ADMIN.getKey())
					System.out.println("++++++++\nyetkiniz yok\n");
				else
					createDataFile(perm);
				break;
			
			case 2:
				System.out.println("Roles: " + MY_ROLES);
				System.out.println("enum: " + _35_FileIO4_2_Enum.USER.getKey());
				if (MY_ROLES == _35_FileIO4_2_Enum.USER.getKey()) // MY_ROLES == "USER"
					System.out.println("++++++++\nyetkiniz yok\n");
				else
					writeDataFile();
				break;
			
			case 3:
				ReadDataFile();
				break;
			
			case 4:
				if (MY_ROLES != _35_FileIO4_2_Enum.ADMIN.getKey()) // MY_ROLES != "ADMIN"
					System.out.println("++++++++\nyetkiniz yok\n");
				else
					deleteDataFile();
				break;
			
			case 5:
				showFileData();
				break;
			
			case 6:
				permission();
				break;
			
			case 7:
				allFiles();
				break;
			
			case 0:
				systemExist();
				break;
			
			default:
				System.out.println("Se�im d���nda bir de�er girdiniz....");
				break;
		}
	}
	
	// permission
	private static int permission() {
		klavye = new Scanner(System.in);
		System.out.println("Rolun�z� yaz�n�z\n1-)ADMIN\n2-)WRITER\n3-)USER");
		int roles = klavye.nextInt();
		MY_ROLES = roles;
		return roles;
	}
	
	// data Merge
	private static String dataMerge(String fileName) {
		StringBuilder builder = new StringBuilder();
		builder.append("C:\\turkcell\\").append(fileName).append(".txt");
		return builder.toString();
	}
	
	// create path
	private static String createPath() {
		klavye = new Scanner(System.in);
		// "C:\\turkcell\\data.txt"
		System.out.println("Dosya ad�n� giriniz...");
		String fileName = klavye.nextLine();
		_35_FileIO4_1_FileClass pathClass = new _35_FileIO4_1_FileClass(dataMerge(fileName));
		return pathClass.getPath();
	}
	
	// create method
	private static void createDataFile(int perm) throws IOException {
		System.out.println("*** Dosya Olu�turmak ***");
		String path = createPath();
		MY_PATH = path;
		file = new File(path);
		if (file.createNewFile()) {
			System.out.println(file.getAbsolutePath() + " Dosya olu�turuldu");
		} else {
			System.out.println("Olu�turulmad�");
		}
	}
	
	/////// write method
	private static void writeDataFile() {
		System.out.println("*** Dosya Yaz ***");
		klavye = new Scanner(System.in);
		System.out.println("Dosya yazmak i�in bir�eyler yaz�n�z...");
		String vocabulary = klavye.nextLine();
		System.out.println(MY_PATH);
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(MY_PATH, true))) {
			// _35_FileIO4_1_FileClass class1 = new _35_FileIO4_1_FileClass();
			// bufferedWriter.write("ROL: " + MY_ROLES + " ==>" + class1.getDate() + " ==> "
			// + vocabulary);
			bufferedWriter.write(vocabulary);
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
	
	// b�t�n dosyalar
	private static String allFiles() {
		String baseFilePath = file.getParent();
		System.out.println(baseFilePath);
		System.out.println("#########");
		for (File temp : new File(baseFilePath).listFiles()) {
			System.err.println(temp.getName());
		}
		System.out.println("#########");
		return baseFilePath;
	}
	
	///// delete method
	private static void deleteDataFile() throws _35_FileIO4_0_FileClassException {
		System.out.println("*** Dosya Sil ***");
		klavye = new Scanner(System.in);
		String tempBaseFile = allFiles();
		System.out.println("Silmek istedi�iniz dosya yaz�n�z");
		String filesName = klavye.nextLine();
		String fileConcat = tempBaseFile + "\\" + filesName + ".txt";
		File deleteFile = new File(fileConcat);
		
		// try-with resources
		// dosya var m� ?
		if (deleteFile.exists()) {
			System.out.println("Dosyan�z siliniyor");
			deleteFile.delete();
		} else {
			System.out.println("Dosyan�z silinemedi");
			// kendi exception yazd�m
			throw new _35_FileIO4_0_FileClassException("Silinemedi");
		}
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
	
	// PSVM
	public static void main(String[] args) throws _35_FileIO4_0_FileClassException {
		try {
			// sadece 1 kere rol istesin
			int perm = permission();
			MY_ROLES = perm;
			for (;;) {
				synchronized (args) {
					mainMethod(perm);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
