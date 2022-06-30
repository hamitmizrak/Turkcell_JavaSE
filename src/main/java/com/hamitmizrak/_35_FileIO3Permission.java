package com.hamitmizrak;

import java.io.File;

enum permission {
	ADMIN, WRITER, USER;
}

public class _35_FileIO3Permission {
	public static void main(String[] args) {
		File file = new File(_35_FileIO.MY_PATH);
		
		// String[] permissionRoles = { "ADMIN", "WRITER", "USER" };
		// if(dizileye permissionRoles[1] == "ADMIN")
		
		if (permission.ADMIN.toString() == "ADMIN") {
			boolean data = file.canExecute();
			data = file.setExecutable(false);
			if (data) {
				System.out.println("�al��ma izni verilmi�tir");
			} else {
				System.out.println("�al��ma izni verilmemi�tir !!!!");
			}
		} else {
			System.out.println("Writer veya user dosya de�i�tirme izini yoktur.");
		}
	}
}
