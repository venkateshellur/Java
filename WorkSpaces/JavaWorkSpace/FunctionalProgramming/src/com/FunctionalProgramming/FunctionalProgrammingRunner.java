/**
 * 
 */
package com.FunctionalProgramming;

import java.util.List;

/**
 * 
 */
public class FunctionalProgrammingRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Banana", "Orange", "PineApple");
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// printBasic(list);
		// printUsingFunctionPrograming(list);
		// printUsingFunctionProgramingWithFiltering(list);
		sumOfNumbersUsingFunctionalPrograming(numbers);
		sumOfOddNumbersUsingFunctionalPrograming(numbers);
		System.out.println(fpSum(numbers));
	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

	private static void printUsingFunctionPrograming(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
	}

	private static void printUsingFunctionProgramingWithFiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("le")).forEach(element -> System.out.println(element));
	}

	private static void sumOfNumbersUsingFunctionalPrograming(List<Integer> numbers) {
		int sumOfNumbers = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
		System.out.println("Sum of numbers in the list is  : " + sumOfNumbers);
	}

	private static void sumOfOddNumbersUsingFunctionalPrograming(List<Integer> numbers) {
		int sumOfNumbers = numbers.stream().filter(number -> number % 2 == 1).reduce(0,
				(number1, number2) -> number1 + number2);
		System.out.println("Sum of ODD Numbers in the list is : " + sumOfNumbers);
	}

	private static Integer fpSum(List<Integer> numbers) {
		return numbers.stream().reduce(0, (number1, number2) -> {
			System.out.println(number1 + " " + number2);
			return number1 + number2;
		});
	}
}
