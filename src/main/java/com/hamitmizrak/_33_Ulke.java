package com.hamitmizrak;

import com.hamitmizrak._33_Ulke._33_Il._33_Ilce;

// static olan inner class
// Ulke Il Ilçe Mahalle
public class _33_Ulke {
	
	private String ulkeAdi;
	
	public String getUlkeAdi() {
		return ulkeAdi;
	}
	
	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}
	
	// Ýç static olan class (Ýl)
	public static class _33_Il {
		private String ilAdi;
		
		public String getIlAdi() {
			return ilAdi;
		}
		
		public void setIlAdi(String ilAdi) {
			this.ilAdi = ilAdi;
		}
		
		// Ýç static olan class (Ýlçe)
		public static class _33_Ilce {
			private String ilceAdi;
			
			public String getIlceAdi() {
				return ilceAdi;
			}
			
			public void setIlceAdi(String ilceAdi) {
				this.ilceAdi = ilceAdi;
			}
			
		}
		
	}
	
	// main test
	public static void main(String[] args) {
		_33_Ulke ulke = new _33_Ulke();
		ulke.setUlkeAdi("Türkiye");
		
		_33_Il il = new _33_Il();
		il.setIlAdi("Malatya");
		
		_33_Ilce ilce = new _33_Ilce();
		ilce.setIlceAdi("Battalgazi");
		
		System.out.println(
				"Ülke Adý: " + ulke.getUlkeAdi() + " Ýl adý: " + il.getIlAdi() + " Ýlçe Adý: " + ilce.getIlceAdi());
	}
}
