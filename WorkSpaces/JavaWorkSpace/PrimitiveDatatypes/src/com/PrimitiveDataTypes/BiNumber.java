package com.PrimitiveDataTypes;

public class BiNumber {

	private int number1;
	private int number2;

	public BiNumber(int i, int j) {
		this.number1 = i;
		this.number2 = j;
	}

	public int add() {
		return number1 + number2;
	}

	public int multiply() {
		return number1 * number2;
	}

	public int getNumber1() {
		return this.number1;
	}

	public int getNumber2() {
		return this.number2;
	}

	public void doubleValue() {
		number1 *= 2;
		number2 *= 2;

	}
}
