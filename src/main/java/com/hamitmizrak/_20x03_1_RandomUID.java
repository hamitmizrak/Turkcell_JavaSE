package com.hamitmizrak;

import java.util.UUID;

public class _20x03_1_RandomUID {
	
	public static void main(String[] args) {
		
		// 32 karakterli Hexadecimal random unique data oluşturmak
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid);
	}
}
