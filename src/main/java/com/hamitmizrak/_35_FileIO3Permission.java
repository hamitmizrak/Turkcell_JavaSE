package com.hamitmizrak;

import java.io.File;

public class _35_FileIO3Permission {
	public static void main(String[] args) {
		File file = new File(_35_FileIO.MY_PATH);
		boolean data = file.canExecute();
		if (data) {
			System.out.println("Çalýþma izni verilmiþtir");
		} else {
			System.out.println("Çalýþma izni verilmemiþtir !!!!");
		}
		
		data = file.setExecutable(false);
		if (data) {
			System.out.println("Çalýþma izni verilmiþtir");
		} else {
			System.out.println("Çalýþma izni verilmemiþtir !!!!");
		}
		
	}
}
