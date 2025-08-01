package com.FunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPRedicate implements Predicate<Integer> {
	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}
}

class SystemOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer a) {
		System.out.println(a);
	}
}

class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer num) {
		return num * num;
	}
}

public class LambdaBehindTheScreenRunner {
	public static void main(String[] args) {

		System.out.println("\nUsing regular Lambda function :");
		List.of(23, 34, 45, 67, 34, 43, 36, 48).stream().filter(n -> n % 2 == 0).forEach(e -> System.out.println(e));

		System.out.println("\nUsing Functional Intefaces :");
		List.of(23, 34, 45, 67, 34, 43, 36, 48).stream().filter(new EvenNumberPRedicate())
				.forEach(new SystemOutConsumer());

		// Implementing the Map function for the above expressions
		System.out.println(
				"\n\nImplementing the Map function for the above expressions using regular lLambda and Functional Interfaces \n");
		System.out.println("\nUsing regular Lambda function :");
		List.of(23, 34, 45, 67, 34, 43, 36, 48).stream().filter(n -> n % 2 == 0).map(n -> n * n)
				.forEach(e -> System.out.println(e));

		System.out.println("\nUsing Functional Intefaces :");
		List.of(23, 34, 45, 67, 34, 43, 36, 48).stream().filter(new EvenNumberPRedicate()).map(new NumberSquareMapper())
				.forEach(new SystemOutConsumer());

	}

}
