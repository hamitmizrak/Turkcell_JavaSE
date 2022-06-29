package com.hamitmizrak;

public class _34_Thread6_MainClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		_34_Thread3_ExtendsThread multiple1 = new _34_Thread3_ExtendsThread("1.instance");
		_34_Thread3_ExtendsThread multiple2 = new _34_Thread3_ExtendsThread("2.instance");
		_34_Thread3_ExtendsThread multiple3 = new _34_Thread3_ExtendsThread("3.instance");
		
		// start() önce thread yaþamaz
		// System.out.println("1. thread " + multiple1.isAlive());
		
		multiple1.start();
		// öncelikle thread 1 bitmesi gerekiyor 1.thread bittikten sonra diðerleri
		// baþlar
		multiple1.join();
		System.out.println("1.Thread ID" + multiple1.getId());
		System.out.println("1.Thread ID" + multiple1.getName());
		multiple1.setName("Degisti 1");
		System.out.println("1.Thread ID" + multiple1.getName());
		System.out.println("******************************************");
		
		multiple2.start();
		multiple2.wait(); // 2.emre kadar Thread 2 dursun
		multiple2.notify();
		multiple2.notifyAll();
		
		multiple3.start();
		
		// System.out.println("1. thread" + multiple1.isAlive());
		// System.out.println("2. thread" + multiple2.isAlive());
		// System.out.println("3. thread" + multiple3.isAlive());
		
	}
}
