package com.concurrency;

public class BiCounterWithLock {
	private int i = 0;
	private int j = 0;

	// Not a Thread Safe
	public void increment() {
		i++;
	}

	// Thread safe, makes the next thread wait till the current operation is done
	// Issue here is there are 2 synchronized methods so one has to wait till the
	// other is executed.
	synchronized public void synchronizedIncrementJ() {
		j++;
	}

	synchronized public void synchronizedIncrementI() {
		i++;
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}
}
