package com.hamitmizrak;

import java.io.File;

enum permission2 {
	SUPERADMIN, ADMIN, WRITER, USER;
}

public class _35_FileIO3Permission {
	public static void main(String[] args) {
		File file = new File(_35_FileIO.MY_PATH);
		
		// String[] permissionRoles = { "ADMIN", "WRITER", "USER" };
		// if(dizileye permissionRoles[1] == "ADMIN")
		
		if (permission2.SUPERADMIN.toString() == "SUPERADMIN") {
			boolean data = file.canExecute();
			data = file.setExecutable(false);
			if (data) {
				System.out.println("Çalışma izni verilmiştir");
			} else {
				System.out.println("Çalışma izni verilmemiştir !!!!");
			}
		} else {
			System.out.println("Writer veya user dosya değiştirme izini yoktur.");
		}
	}
}
