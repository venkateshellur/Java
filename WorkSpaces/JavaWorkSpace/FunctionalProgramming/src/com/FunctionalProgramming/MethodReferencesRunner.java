package com.FunctionalProgramming;

import java.util.List;

public class MethodReferencesRunner {

	public static void main(String[] args) {
		List.of("Ant", "Cat", "Bat", "Mat", "Elephant", "Tiger", "Lion", "Cheetha").stream().map(s -> s.length())
				.forEach(s -> System.err.println(s));

		// Output is the same just that the print statement is made shorthand.
		List.of("Ant", "Cat", "Bat", "Mat", "Elephant", "Tiger", "Lion", "Cheetha").stream().map(s -> s.length())
				.forEach(System.out::println);

		// another way to get the things simplfied creating a static method
		List.of("Ant", "Cat", "Bat", "Mat", "Elephant", "Tiger", "Lion", "Cheetha").stream().map(s -> s.length())
				.forEach(MethodReferencesRunner::print);

		// Shorthand method can be used for any of the operation look at the changes for
		// the map operation :: is the way to use shorthand method.
		List.of("Ant", "Cat", "Bat", "Mat", "Elephant", "Tiger", "Lion", "Cheetha").stream().map(String::length)
				.forEach(MethodReferencesRunner::print);

		// Exercise
		System.out.println(List.of(23, 45, 67, 45, 89, 32).stream().filter(n -> n % 2 == 0)
				.max((n1, n2) -> Integer.compare(n1, n2)).orElse(0));

		// Exercise method refernce
		System.out.println(List.of(23, 45, 67, 45, 89, 34).stream().filter(MethodReferencesRunner::isEven)
				.max(Integer::compare).orElse(0));
	}

	public static void print(Integer number) {
		System.out.println(number);

	}

	public static boolean isEven(Integer num) {
		return num % 2 == 0;
	}
}
