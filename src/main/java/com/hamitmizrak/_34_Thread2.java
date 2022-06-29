package com.hamitmizrak;

// Thread Kullanım Şekilleri

// 1-) extends (Kalıtım) ==> Class
// public class MultiThreadExam extends Thread{}
// extends ==> javada 1 tane extends kullanabilirsin
// extends zorunlu olarak run metotudunu eklemez
public class _34_Thread2 extends Thread {
	@Override
	public void run() {
	}
}

// 2-) implements (Interface) ==> interface
// public class MultiThreadExam implements Runnable{}
// implements ==> Javada istediğimiz kadar implements virgül koyarak
// yazabiliriz.
// implement zorunlu olarak run metotudunu zorunlu ekler
class _34_Thread2Implements implements Runnable {
	@Override
	public void run() {
	}
}

// 3-) anonymous (isimsiz) ==> Metot olarak
// Thread thread= new Thread(new Runnable(){});
class _34_Thread2Method {
	public void threadMetotu() {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				
			}
		});
	}
}
