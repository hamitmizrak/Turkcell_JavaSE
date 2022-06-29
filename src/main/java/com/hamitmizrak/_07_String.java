package com.hamitmizrak;

public class _07_String {
	public static void main(String[] args) {
		
		// kelimeler çalışma imkanı sağlar
		// database , port , api String
		// String bir Objedir(null)
		// boşluk bir karakterdir.
		String kelime = "Java";
		System.out.println(kelime.length());
		System.out.println(kelime.trim().length());
		
		System.out.println(kelime.toLowerCase());
		System.out.println(kelime.toUpperCase());
		
		System.out.println(kelime.startsWith("J"));
		System.out.println(kelime.endsWith("m"));
		
		System.out.println(kelime.concat("sona ekleme"));
		System.out.println(kelime.replace(kelime, "yenisi"));
		
		System.out.println(kelime.contains("Java"));
		System.out.println(kelime.charAt(0));
		
		System.out.println(kelime.indexOf("Java"));
		System.out.println(kelime.lastIndexOf("Java"));
		
		System.out.println(kelime.substring(2));
		System.out.println(kelime.substring(0, 3)); // 0<=X<3-1
		
		System.out.println(kelime.isEmpty());
		System.out.println(kelime.equals("Java"));
		System.out.println(kelime.equalsIgnoreCase("JAva"));
		
		// Bu kelimenin son 2 karakterinin gösterelim?
		System.out.println(kelime.length());
		System.out.println(kelime.length() - 2);
		if (kelime.length() > 20) {
			System.out.println(kelime.substring(19));
			System.out.println(kelime.substring(kelime.length() - 2));
		}
		
	}
}
