package com.hamitmizrak;

import java.io.IOException;

public class _23_TryCatch {
	// java.lang>Object> Throwable> 1-)Exception 2-)Error
	// try-catch-finally-throw-throws
	
	// metot
	public static void fakeMailSend(String data) {
		System.out.println("admine mail gönderildi" + data);
	}
	
	public static void main(String[] args) throws ArithmeticException, NullPointerException, IOException {
		try {
			// istisna meydana gelecek kodlar
			int number = 4 / 0;
			System.out.println(number);
		} catch (ArithmeticException | NullPointerException ae) { // catch özelden(hızlı) genele doğru
			fakeMailSend(ae.getMessage());
			fakeMailSend(ae.toString());
			ae.printStackTrace();
		} catch (Exception e) {
			fakeMailSend(e.getMessage());
			fakeMailSend(e.toString());
			e.printStackTrace();
		} finally {
			System.out.println("db.closed() port.close()");
		}
		System.out.println("son satır");
	}
}
