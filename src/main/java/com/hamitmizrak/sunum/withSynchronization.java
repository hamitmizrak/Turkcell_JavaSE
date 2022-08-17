class Array {
	synchronized void printNumbers(int n) {// method synchronized
		for (int i = 1; i <= 3; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(500); // delayed a thread by 500 ms
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread {
	Array a;

	MyThread1(Array a) {
		this.a = a;
	}

	public void run() {
		a.printNumbers(1);
	}
}

class MyThread2 extends Thread {
	Array a;

	MyThread2(Array a) {
		this.a = a;
	}

	public void run() {
		a.printNumbers(10);
	}
}

public class withSynchronization {
	public static void main(String args[]) {
		Array myArr = new Array();// only one object
		MyThread1 t1 = new MyThread1(myArr);
		MyThread2 t2 = new MyThread2(myArr);
		t1.start();
		t2.start();
	}
}
