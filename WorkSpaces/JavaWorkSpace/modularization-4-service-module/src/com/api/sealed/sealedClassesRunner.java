package com.api.sealed;

public class sealedClassesRunner {

	// Sealed class Vehicle permits Car, Truck, Bike to be extended
	sealed class Vehicle permits Car, Truck, Bike {
	}

	// The permitted classes must either be final, sealed or non-sealed
	final class Car extends Vehicle {
	}

	non-sealed class Truck extends Vehicle {
	}

	sealed class Bike extends Vehicle permits SuperBike {
	}

	final class SuperBike extends Bike {
	}

	// class Dog extends Vehicle {}

	public static void main(String[] args) {

	}

}
