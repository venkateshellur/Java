package com.api.sealed;

// Sealed interfaces same as Sealed Classes.
public class SealedInterfaceRunner {

	sealed interface Flyable permits Bird, Aeroplane, Helicopter {
	}

	final class Bird implements Flyable {
	}

	sealed class Aeroplane implements Flyable permits Boeing {
	}

	final class Boeing extends Aeroplane {
	}

	non-sealed class Helicopter implements Flyable {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
