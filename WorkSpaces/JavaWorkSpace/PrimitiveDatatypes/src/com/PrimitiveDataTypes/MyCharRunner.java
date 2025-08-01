package com.PrimitiveDataTypes;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('5');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isConsonent());
		System.out.println(myChar.isDigit());
	}
}
