package com.hamitmizrak;

import java.util.ArrayList;
import java.util.List;

// List : LAV
// List bir interface'dir.
// java.util paketinde gelir

// LinkedList:Araya yerleþtirme, silme iþlemlerinde biçilmiþ kaftan
// ArrayList: Ekleme ve Arama için biçilmiþ kaftan
// Vector: veri defaulta 10 bunun dolacaðýný anladðýnda dinamik olarak Hafýza
// uzayý artýrýr.
public class _39_List_LAV2<T> {
	
	// Liste Döngüsü
	public static void listLoop() {
		// Java 1.7 gelen diamond operator
		// Unutma: Generics Referans Type kullan (Byte,Short,Integer,Long) v.s
		List<String> listem = new ArrayList<String>();
		listem.add("Malatya"); // add: eklemek
		listem.add("Balikesir");
		listem.add("Adana");
		listem.add("Malatya");
		
		// list: indisler 0 (sýfýrdan) baþlar
		// get: listedeki veriye eriþmek için kullanýlýr
		System.out.println(listem.get(0));
		
		// size: saymaya 1 baþlar
		// size: eleman sayýsý size: return ==> int
		System.out.println("Eleman sayýsý: " + listem.size());
		
		// indexOf: Sýfýrdan(0) baþlar
		// indexOf soldan arayarak Bulur bulduðu indisi döndürür yoksa (-1) döner
		System.out.println("indexOf: " + listem.indexOf("Malatya"));
		
		// lastIndexOf: Sýfýrdan(0) baþlar
		// lastIndexOf saðda arayarak Bulur bulduðu indisi döndürür yoksa (-1) döner
		System.out.println("indexOf: " + listem.lastIndexOf("Malatya"));
		
		// isEmpty: Boþ mu , Dolu mu
		System.out.println("Boþ mu: " + listem.isEmpty());
		
		// ForEach döngüsü: indis lazým deðilse
		System.out.println("\n****  ForEach döngüsü ****");
		for (String temp : listem) {
			System.out.print(temp + " ");
		}
		
		// toArray() ==> Listeyi Array'e çevirmek için kullanýrýz.
		// Dikkat: Object türündendir Eðer Integer vs çevirmek istersem
		// önce String'e sonra Integer'a çevirmelisin
		// List ==> Array
		System.out.println("\n**** List To Array döngüsü ****");
		Object[] dizi = listem.toArray();
		for (Object temp : dizi) {
			System.out.print(temp + " ");
		}
		
		// subList: Listeden istediðimiz aralýkta veri göndersin
		// subList: Sýfýrdan baþlar
		System.out.println("\n****  subList döngüsü ****");
		for (String temp : listem.subList(0, 3)) { // 0 <= X<= 3-1
			System.out.print(temp + " ");
		}
		
		// addAll: Bir listeyi baþka bir listeye tamamen ekler
		// addAll: yalnýz iki liste ayný Referans type olacak
		System.out.println("\n****  addAll döngüsü ****");
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
		System.out.println("\n**** remove döngüsü ****");
		for (String temp : listem) {
			System.out.print(temp + " ");
		}
		
		// clear(): listedeki bütün elemanlarý siler
		listem.clear();
		System.out.println("\n**** remove döngüsü ****");
		for (String temp : listem) {
			System.out.print(temp + " ");
		}
		
	}
	
	public static void main(String[] args) {
		listLoop();
	}
	
}
