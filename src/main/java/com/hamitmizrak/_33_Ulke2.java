package com.hamitmizrak;

// static olmayaaaaannnn inner class
//// Ulke Il Il�e Mahalle
public class _33_Ulke2 {
	
	private String ulkeAdi;
	
	public String getUlkeAdi() {
		return ulkeAdi;
	}
	
	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}
	
	// �� olan class (�l)
	public class _33_Il {
		private String ilAdi;
		
		public String getIlAdi() {
			return ilAdi;
		}
		
		public void setIlAdi(String ilAdi) {
			this.ilAdi = ilAdi;
		}
		
		// �� olan class (�l�e)
		public class _33_Ilce {
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
		_33_Ulke2 ulke = new _33_Ulke2();
		ulke.setUlkeAdi("T�rkiye");
		
		_33_Ulke2._33_Il il = new _33_Ulke2().new _33_Il();
		il.setIlAdi("Malatya");
		
		_33_Ulke2._33_Il._33_Ilce ilce = new _33_Ulke2().new _33_Il().new _33_Ilce();
		ilce.setIlceAdi("Battalgazi");
		
		System.out.println(
				"�lke Ad�: " + ulke.getUlkeAdi() + " �l ad�: " + il.getIlAdi() + " �l�e Ad�: " + ilce.getIlceAdi());
	}
}
