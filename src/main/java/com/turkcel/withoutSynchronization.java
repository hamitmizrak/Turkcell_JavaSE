class ArraySecond {
	void printNumbers(int n) {// method not synchronized
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

class MyThreadFirst extends Thread {
	ArraySecond a;

	MyThreadFirst(ArraySecond a) {
		this.a = a;
	}

	public void run() {
		a.printNumbers(1);
	}
}

class MyThreadSecond extends Thread {
	ArraySecond a;

	MyThreadSecond(ArraySecond a) {
		this.a = a;
	}

	public void run() {
		a.printNumbers(10);
	}
}

public class withoutSynchronization {
	public static void main(String args[]) {
		ArraySecond myArr = new ArraySecond();// only one object
		MyThreadFirst t1 = new MyThreadFirst(myArr);
		MyThreadSecond t2 = new MyThreadSecond(myArr);
		t1.start();
		t2.start();
	}

}
