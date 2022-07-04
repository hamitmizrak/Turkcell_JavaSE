package com.hamitmizrak;

import java.util.Vector;

// List : LAV
// List bir interface'dir.
// java.util paketinde gelir

// LinkedList:Araya yerle�tirme, silme i�lemlerinde bi�ilmi� kaftan
// ArrayList: Ekleme ve Arama i�in bi�ilmi� kaftan
// Vector: veri defaulta 10 bunun dolaca��n� anlad��nda dinamik olarak Haf�za
// uzay� art�r�r.
public class _39_List_LAV4<T> {
	
	// vector
	public static void vectorLoop() {
		// Vector: Java 1.2 s�r�m�nden bu zamana kadar gelen dinamik dizi i�in
		// kullanabilirsiniz
		// java.util paketinden gelir
		// defaultta 10 eleman olarak �al���r.
		
		// Generics olmadan yaz�lan vector
		Vector vector = new Vector();
		vector.add("Malatya");
		vector.add("Balikesir");
		vector.add("Adana");
		vector.add("Malatya");
		System.out.println("Size:" + vector.size());
		System.out.println("\n ***** Generics olmadan yaz�lan vector ***** ");
		for (Object temp : vector) {
			System.out.print(temp + " ");
		}
		
		// Generics olan yaz�lan vector
		Vector<String> vector2 = new Vector<String>();
		vector2.add("Malatya");
		vector2.add("Balikesir");
		vector2.add("Adana");
		vector2.add("Malatya");
		System.out.println("Size:" + vector2.size());
		System.out.println("\n ***** Generics olan yaz�lan vector ***** ");
		for (String temp : vector2) {
			System.out.print(temp + " ");
		}
		
		// Generics olan yaz�lan vector
		Vector<String> vector3 = new Vector<String>(4);
		vector3.add("Malatya");
		vector3.add("Balikesir");
		vector3.add("Adana");
		vector3.add("Malatya");
		System.out.println("Size:" + vector3.size());
		System.out.println("\n ***** Generics olan yaz�lan vector ***** ");
		for (String temp : vector3) {
			System.out.print(temp + " ");
		}
		
	}
	
	public static void main(String[] args) {
		vectorLoop();
	}
	
}
