package com.hamitmizrak;

import java.io.File;
import java.util.Date;

public class _35_FileIO2 {
	
	public static void main(String[] args) {
		try {
			File file = new File(_35_FileIO.MY_PATH);
			
			// isFile() ==> Dosya mý
			
			if (file.isFile()) {
				System.out.println("Dosyada çalýþýyorsunuz");
				
				// can: return ==> boolean Linux izinleri ==>755 777 4+2+1
				System.out.println("***** CAN ****************");
				System.out.println("çalýþabilen dosya mý: " + file.canExecute());
				System.out.println("okunabilen dosya mý: " + file.canRead());
				System.out.println("yazabilen dosya mý: " + file.canWrite());
				
				// is
				System.out.println("***** IS ****************");
				System.out.println("dizin mi : " + file.isDirectory());
				System.out.println("dosya mi : " + file.isFile());
				System.out.println("gizli dosyamý : " + file.isHidden());
				
				// get : getirmek
				System.out.println("***** GET ****************");
				System.out.println("class: " + file.getClass());
				System.out.println("absolute path: " + file.getAbsolutePath());
				System.out.println("normal path: " + file.getPath());
				System.out.println("CanonicalPath: " + file.getCanonicalPath());
				System.out.println("parent: " + file.getParent());
				System.out.println("name: " + file.getName());
				
				// set:Deðiþtirmek
				System.out.println("***** SET ****************");
				System.out.println("çalýþmasýnýna iznini kapatmak: " + file.setExecutable(false));
				System.out.println("yazýlabilir iznini kapatmak: " + file.setWritable(false));
				System.out.println("okunabilir iznini kapatmak: " + file.setReadable(false));
				
				// file information
				System.out.println("***** INFORMATION ****************");
				System.out.println("toplam karakter sayýsý: " + file.length());
				System.out.println("Deðiþikliði Tarihi: " + new Date(file.lastModified()));
				System.out.println("absolute path: " + file.getAbsolutePath());
				System.out.println("normal path: " + file.getPath());
				System.out.println("CanonicalPath: " + file.getCanonicalPath());
				System.out.println("toplam GB : " + file.getTotalSpace());
				System.out.println("kullanýlabileceðin GB : " + file.getUsableSpace());
			} else {
				System.out.println("Dosya deðil");
			}
			
		} catch (Exception e) {
			
		} finally {
			// System.out.println("Bu kesim her durumda çalýþýr");
		}
	}
}
