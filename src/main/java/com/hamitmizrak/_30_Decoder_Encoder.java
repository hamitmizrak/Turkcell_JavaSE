package com.hamitmizrak;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Scanner;

public class _30_Decoder_Encoder {
	
	// Encoder(Şifrelemek) Decoder(Çözmek)
	// Encoder : yazılımda Bir kelimeyi belli bir formatta şifreleme için kullanılır
	// Decoder: yazılımda Şifrelenmiş bir kodu, Çözmek için kullanılır
	// Base64 kütüphanesini kullanırız.
	// Encoder-Decoder JWT en çok kullanıyoruz.
	// Neden kullanıyoruz ? Büyük verilerde az yer kaplar.
	// Decoder-Encoder , MD5 , SHA ile karıştırmayalım ......
	
	// Kullanıcıdan veri almak
	public static String getDataFromUser() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("+++++++++++\nLütfen bir seyler yaziniz..");
		String vocabulary = klavye.nextLine();
		return vocabulary;
	}
	
	// Encoder(Şifreleme)
	public static String getEncoderData(String vocabulary) {
		Encoder encoder = Base64.getEncoder();
		String encrypted = encoder.encodeToString(vocabulary.getBytes());
		return encrypted;
	}
	
	// Decoder(Çözümleme)
	public static String getDecoderData(String vocabulary) {
		Decoder decoder = Base64.getDecoder();
		String solved = new String(decoder.decode(vocabulary));
		return solved;
	}
	
	public static void encoderDecoderMainMethod() {
		String kelime = getDataFromUser();
		System.out.println("ilk hali: " + kelime);
		
		// Encoder(Şifreleme)
		String encrypted = getEncoderData(kelime);
		System.out.println("sifrelenmis data: " + encrypted);
		
		// Decoder(Çözmek)
		String solved = getDecoderData(getEncoderData(kelime));
		System.out.println("cozulmus data: " + solved);
	}
	
	public static void main(String[] args) {
		encoderDecoderMainMethod();
	}
	
}
