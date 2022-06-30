package com.hamitmizrak;

import java.io.File;
import java.util.Date;

public class _35_FileIO2 {
	
	public static void main(String[] args) {
		try {
			File file = new File(_35_FileIO.MY_PATH);
			
			// isFile() ==> Dosya m�
			
			if (file.isFile()) {
				System.out.println("Dosyada �al���yorsunuz");
				
				// can: return ==> boolean Linux izinleri ==>755 777 4+2+1
				System.out.println("***** CAN ****************");
				System.out.println("�al��abilen dosya m�: " + file.canExecute());
				System.out.println("okunabilen dosya m�: " + file.canRead());
				System.out.println("yazabilen dosya m�: " + file.canWrite());
				
				// is
				System.out.println("***** IS ****************");
				System.out.println("dizin mi : " + file.isDirectory());
				System.out.println("dosya mi : " + file.isFile());
				System.out.println("gizli dosyam� : " + file.isHidden());
				
				// get : getirmek
				System.out.println("***** GET ****************");
				System.out.println("class: " + file.getClass());
				System.out.println("absolute path: " + file.getAbsolutePath());
				System.out.println("normal path: " + file.getPath());
				System.out.println("CanonicalPath: " + file.getCanonicalPath());
				System.out.println("parent: " + file.getParent());
				System.out.println("name: " + file.getName());
				
				// set:De�i�tirmek
				System.out.println("***** SET ****************");
				System.out.println("�al��mas�n�na iznini kapatmak: " + file.setExecutable(false));
				System.out.println("yaz�labilir iznini kapatmak: " + file.setWritable(false));
				System.out.println("okunabilir iznini kapatmak: " + file.setReadable(false));
				
				// file information
				System.out.println("***** INFORMATION ****************");
				System.out.println("toplam karakter say�s�: " + file.length());
				System.out.println("De�i�ikli�i Tarihi: " + new Date(file.lastModified()));
				System.out.println("absolute path: " + file.getAbsolutePath());
				System.out.println("normal path: " + file.getPath());
				System.out.println("CanonicalPath: " + file.getCanonicalPath());
				System.out.println("toplam GB : " + file.getTotalSpace());
				System.out.println("kullan�labilece�in GB : " + file.getUsableSpace());
			} else {
				System.out.println("Dosya de�il");
			}
			
		} catch (Exception e) {
			
		} finally {
			// System.out.println("Bu kesim her durumda �al���r");
		}
	}
}
