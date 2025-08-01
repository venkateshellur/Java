package com.PrimitiveDataTypes;

public class MyChar {
	private char ch;

	public MyChar(char c) {
		this.ch = c;
	}

	public boolean isVowel() {
		if (Character.toLowerCase(ch) == 'a' || Character.toLowerCase(ch) == 'e' || Character.toLowerCase(ch) == 'i'
				|| Character.toLowerCase(ch) == 'o' || Character.toLowerCase(ch) == 'u') {
			return true;
		}
		return false;
	}

	public boolean isConsonent() {
		return (isVowel() && isAlphabet());
	}

	public boolean isDigit() {
		if (ch >= 48 && ch <= 57) {
			return true;
		}
		return false;
	}

	public boolean isLowerCaseAlphabet() {
		if ((ch >= 97 && ch <= 122)) {
			return true;
		}
		return false;
	}

	public boolean isUpperCaseAlphabet() {
		if (ch >= 65 && ch <= 90) {
			return true;
		}
		return false;
	}

	public boolean isAlphabet() {
		if (isLowerCaseAlphabet() || isUpperCaseAlphabet()) {
			return true;
		}
		return false;
	}
}
