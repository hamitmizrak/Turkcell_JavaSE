package com.hamitmizrak;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _35_FileIO4_1_FileClass {
	
	// Nesne de�i�kenleri (Object variable)
	private String path;
	private final String date = createdDate();
	
	// parametresiz constructor
	public _35_FileIO4_1_FileClass() {
		this.path = "C:\\turkcell\\data.txt";
		File file = new File("C:\\turkcell\\data.txt");
		// default olarak Data.txt olu�turmak
		try {
			if (file.createNewFile()) {
				System.out.println("data.txt olu�turuldu!");
			} else {
				System.out.println("zaten data.txt dosya var");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// parametreli constructor
	public _35_FileIO4_1_FileClass(String path) {
		this.path = path;
	}
	
	// �imdiki zaman� veren method
	private String createdDate() {
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss", locale);
		// new Date(System.currentTimeMillis());
		return dateFormat.format(new Date());
	}
	
	// getter and setter
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getDate() {
		return date;
	}
}
