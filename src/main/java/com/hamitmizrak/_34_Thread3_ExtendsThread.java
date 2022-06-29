package com.hamitmizrak;

// Thread Kullaným Þekilleri

// 1-) extends (Kalýtým) ==> Class
// public class MultiThreadExam extends Thread{}
// extends ==> javada 1 tane extends kullanabilirsin
// extends zorunlu olarak run metotudunu eklemez
public class _34_Thread3_ExtendsThread extends Thread {
	
	private String className;
	
	// getter and setter
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	// parametresiz constructor
	public _34_Thread3_ExtendsThread() {
		
	}
	
	// parametreli constructor
	public _34_Thread3_ExtendsThread(String className) {
		this.className = className;
	}
	
	// run metodu
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				// 1000ms =1 sn uyu
				Thread.sleep(500);
				if (i == 1) {
					System.out.println("\n####Baþlangýç####");
					System.out.println(this.className + "\n");
				} else if (i == 10) {
					System.out.println("\n####Bitiþ####");
					System.out.println(this.className + "\n");
				} else {
					System.out.println(this.className);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
