package com.CollectionsSample;

import java.util.HashMap;
import java.util.Map;

public class MapRunner<T> {

	public static void main(String[] args) {
		String str = "This is an awesome occation." + "This has never happened before.";

		Map<Character, Integer> occurances = new HashMap<>();

		char[] characters = str.toCharArray();

		for (char character : characters) {
			Integer inti = occurances.get(character);
			if (inti == null) {
				occurances.put(character, 1);
			} else {
				occurances.put(character, inti + 1);
			}

		}

		System.out.println(occurances);
	}

}
