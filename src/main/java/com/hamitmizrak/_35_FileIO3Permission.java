package com.hamitmizrak;

public class _35_FileIO3Permission {
	public static void main(String[] args) {
		boolean data = file.canExecute();
		if (data) {
			System.out.println("Çalışma izni verilmiştir");
		} else {
			System.out.println("Çalışma izni verilmemiştir !!!!");
		}
		
		data = file.setExecutable(false);
		if (data) {
			System.out.println("Çalışma izni verilmiştir");
		} else {
			System.out.println("Çalışma izni verilmemiştir !!!!");
		}
		
	}
}
