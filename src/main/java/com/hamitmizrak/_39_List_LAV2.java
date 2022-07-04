package com.hamitmizrak;

import java.util.ArrayList;
import java.util.List;

// List : LAV
// List bir interface'dir.
// java.util paketinde gelir

// LinkedList:Araya yerle�tirme, silme i�lemlerinde bi�ilmi� kaftan
// ArrayList: Ekleme ve Arama i�in bi�ilmi� kaftan
// Vector: veri defaulta 10 bunun dolaca��n� anlad��nda dinamik olarak Haf�za
// uzay� art�r�r.
public class _39_List_LAV2<T> {
	
	// Liste D�ng�s�
	public static void listLoop() {
		// Java 1.7 gelen diamond operator
		// Unutma: Generics Referans Type kullan (Byte,Short,Integer,Long) v.s
		List<String> listem = new ArrayList<String>();
		listem.add("Malatya"); // add: eklemek
		listem.add("Balikesir");
		listem.add("Adana");
		listem.add("Malatya");
		
		// list: indisler 0 (s�f�rdan) ba�lar
		// get: listedeki veriye eri�mek i�in kullan�l�r
		System.out.println(listem.get(0));
		
		// size: saymaya 1 ba�lar
		// size: eleman say�s� size: return ==> int
		System.out.println("Eleman say�s�: " + listem.size());
		
		// indexOf: S�f�rdan(0) ba�lar
		// indexOf soldan arayarak Bulur buldu�u indisi d�nd�r�r yoksa (-1) d�ner
		System.out.println("indexOf: " + listem.indexOf("Malatya"));
		
		// lastIndexOf: S�f�rdan(0) ba�lar
		// lastIndexOf sa�da arayarak Bulur buldu�u indisi d�nd�r�r yoksa (-1) d�ner
		System.out.println("indexOf: " + listem.lastIndexOf("Malatya"));
		
		// isEmpty: Bo� mu , Dolu mu
		System.out.println("Bo� mu: " + listem.isEmpty());
		
		// ForEach d�ng�s�: indis laz�m de�ilse
		System.out.println("\n****  ForEach d�ng�s� ****");
		for (String temp : listem) {
			System.out.print(temp + " ");
		}
		
		// toArray() ==> Listeyi Array'e �evirmek i�in kullan�r�z.
		// Dikkat: Object t�r�ndendir E�er Integer vs �evirmek istersem
		// �nce String'e sonra Integer'a �evirmelisin
		// List ==> Array
		System.out.println("\n**** List To Array d�ng�s� ****");
		Object[] dizi = listem.toArray();
		for (Object temp : dizi) {
			System.out.print(temp + " ");
		}
		
		// subList: Listeden istedi�imiz aral�kta veri g�ndersin
		// subList: S�f�rdan ba�lar
		System.out.println("\n****  subList d�ng�s� ****");
		for (String temp : listem.subList(0, 3)) { // 0 <= X<= 3-1
			System.out.print(temp + " ");
		}
		
		// addAll: Bir listeyi ba�ka bir listeye tamamen ekler
		// addAll: yaln�z iki liste ayn� Referans type olacak
		System.out.println("\n****  addAll d�ng�s� ****");
		List<String> yeniListem = new ArrayList<>();
		yeniListem.add("44");
		yeniListem.add("34");
		yeniListem.addAll(listem);
		yeniListem.forEach(System.out::println);
		
		// remove: Listedeki veriyi siler
		// remove: ister String ister number olarak silinir.
		listem.remove(0);
		listem.remove(0);
		listem.remove("Adana");
		System.out.println("\n**** remove d�ng�s� ****");
		for (String temp : listem) {
			System.out.print(temp + " ");
		}
		
		// clear(): listedeki b�t�n elemanlar� siler
		listem.clear();
		System.out.println("\n**** remove d�ng�s� ****");
		for (String temp : listem) {
			System.out.print(temp + " ");
		}
		
	}
	
	public static void main(String[] args) {
		listLoop();
	}
	
}
