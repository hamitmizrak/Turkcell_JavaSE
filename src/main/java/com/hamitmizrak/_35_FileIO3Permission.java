package com.hamitmizrak;

public class _35_FileIO3Permission {
	public static void main(String[] args) {
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
