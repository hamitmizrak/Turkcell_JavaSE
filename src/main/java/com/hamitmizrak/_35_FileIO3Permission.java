package com.hamitmizrak;

public class _35_FileIO3Permission {
	public static void main(String[] args) {
		boolean data = file.canExecute();
		if (data) {
			System.out.println("�al��ma izni verilmi�tir");
		} else {
			System.out.println("�al��ma izni verilmemi�tir !!!!");
		}
		
		data = file.setExecutable(false);
		if (data) {
			System.out.println("�al��ma izni verilmi�tir");
		} else {
			System.out.println("�al��ma izni verilmemi�tir !!!!");
		}
		
	}
}
