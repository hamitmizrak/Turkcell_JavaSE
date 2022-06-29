package com.hamitmizrak;

import java.util.StringTokenizer;

public class _16_StringTokenizer {
	public static void main(String[] args) {
		// Not: boşluk bir karakterdir &nbsp;
		String kelime = "Java+ jsp$jsf servlet~Spring framework springmvc springdata springrest spring$security";
		
		// 1-) parçalamak
		String[] parcala = kelime.split(" ");
		for (String temp : parcala) {
			System.out.println(temp);
		}
		
		System.out.println("*********************************************");
		// 2-) parçalama
		StringTokenizer stringTokenizer = new StringTokenizer(kelime, "+~&$ ");
		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
	}
}
