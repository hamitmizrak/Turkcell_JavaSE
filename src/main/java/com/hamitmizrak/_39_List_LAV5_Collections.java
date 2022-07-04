package com.hamitmizrak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class _39_List_LAV5_Collections<T> {
	
	// Collections:
	// Java.util paketinden gelir
	// java.util.Collections.sort(listem);
	// Collections.sort(listem);
	public static void vectorLoop() {
		// Java 1.7 gelen diamond operator
		List<String> listem = new ArrayList<String>();
		listem.add("Malatya"); // add: eklemek
		listem.add("Balikesir");
		listem.add("Adana");
		listem.add("Zongundak");
		
		// sort: Listeyi Küçükten Büyüðe doðru sýralama
		Collections.sort(listem);
		listem.forEach(System.out::println);
		
		// reverse: Listeyi ters çevirir
		// ancak önce sort yapýp sonra reverse yaparsak: Büyükten küçüðe gelecektir
		Collections.sort(listem);
		Collections.reverse(listem);
		listem.forEach(System.out::println);
		
		// shuffle: rastgele gelecektir.
		Collections.shuffle(listem);
		listem.forEach(System.out::println);
		
		// binarySearch: ikili arama
		// Saymaya sýfýrýncý indisten baþlar.
		// Dikkat: önce küçükten büyüðe doðru sýralamasýn(sort)
		// Collections.sort(listem);
		Iterator<String> iterator = listem.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(Collections.binarySearch(listem, "Malatya"));
		
		// unmodifiableList: bundan sonra listeye veri eklemene istemiyorum.
		// excaption type: Exception in thread "main"
		// java.lang.UnsupportedOperationException
		listem = Collections.unmodifiableList(listem);
		listem.add("yeni data");
		
	}
	
	public static void main(String[] args) {
		vectorLoop();
	}
	
}
