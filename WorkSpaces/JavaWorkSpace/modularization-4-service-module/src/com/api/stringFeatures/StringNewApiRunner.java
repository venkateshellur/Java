package com.api.stringFeatures;

public class StringNewApiRunner {

	public static void main(String[] args) {
		System.out.println("".isBlank());
		System.out.println(" L R ".strip().replace(" ", "@"));
		System.out.println(" L R ".stripLeading().replace(" ", "@"));
		System.out.println(" L R ".stripTrailing().replace(" ", "@"));
		"Line1\nLine2\nLine3\nLine4\n".lines().forEach(System.out::println);

		System.out.println("Upper".transform(s -> s.toUpperCase()));
		System.out.println("Upper".transform(s -> s.substring(2)));
		System.out.println("I am %s and age is %d".transform(s -> s.formatted("Venkatesh", 24)));
	}

}
