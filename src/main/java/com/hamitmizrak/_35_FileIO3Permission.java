package com.hamitmizrak;

import java.io.File;

public class _35_FileIO3Permission {
	public static void main(String[] args) {
		File file = new File(_35_FileIO.MY_PATH);
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
