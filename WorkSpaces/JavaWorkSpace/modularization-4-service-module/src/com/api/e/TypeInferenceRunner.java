package com.api.e;

import java.util.List;

public class TypeInferenceRunner {
	public static void main(String[] args) {
		List<String> names1 = List.of("Venky", "Deepu");
		List<String> names2 = List.of("Pranav", "Kishan");

		// List<List<String>> names = List.of(names1, names2);

		// Type inference to make the declaration simpler
		var names = List.of(names1, names2);
		names.stream().forEach(System.out::println);
	}
}
