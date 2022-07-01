package com.hamitmizrak;

public enum _35_FileIO4_2_Enum {
	// ADMIN(X+,W+,R+) , WRITER(X-,W+,R+) , USER(X-, W- ,R+) x=execute w=write
	// r=read
	ADMIN(1, "admin"), WRITER(2, "writer"), USER(3, "user");
	
	// final verdi�imizde sadece getter gelir
	// interface b�t�n implementlerin gelmemesi i�in ==> public final interface
	// IDeneme{}
	private final int key;
	private final String value;
	
	// constructur final olmal�d�r ki bu enum'� instance (new) yapamayal�m.
	private _35_FileIO4_2_Enum(int key, String value) {
		this.key = key;
		this.value = value;
	}
	
	// getter
	public int getKey() {
		return key;
	}
	
	public String getValue() {
		return value;
	}
	
}
