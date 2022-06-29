package com.hamitmizrak;

import com.hamitmizrak._33_Ulke._33_Il._33_Ilce;

// static olan inner class
// Ulke Il Il�e Mahalle
public class _33_Ulke {
	
	private String ulkeAdi;
	
	public String getUlkeAdi() {
		return ulkeAdi;
	}
	
	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}
	
	// �� static olan class (�l)
	public static class _33_Il {
		private String ilAdi;
		
		public String getIlAdi() {
			return ilAdi;
		}
		
		public void setIlAdi(String ilAdi) {
			this.ilAdi = ilAdi;
		}
		
		// �� static olan class (�l�e)
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
		ulke.setUlkeAdi("T�rkiye");
		
		_33_Il il = new _33_Il();
		il.setIlAdi("Malatya");
		
		_33_Ilce ilce = new _33_Ilce();
		ilce.setIlceAdi("Battalgazi");
		
		System.out.println(
				"�lke Ad�: " + ulke.getUlkeAdi() + " �l ad�: " + il.getIlAdi() + " �l�e Ad�: " + ilce.getIlceAdi());
	}
}
