package com.firstjavaproject;

public class MultiplicationTable {

	public void print(int multiple) {
		for (int i = 1; i <= 10; i++) {
			print(multiple, 1, 10);
		}
	}

	public void print(int table, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d x %d = %d", table, i, table * i).println();
		}
	}
}
