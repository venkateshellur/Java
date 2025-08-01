package com.api.a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Venky");
		names.add("Deepu");
		names.add("Pranav");
		names.add("Kishan");

		// The test in the method will be added
		doNotChange(names);

		// the text in the method will not be added and will throw error as the copyOf
		// gives immutable list
		List<String> copyOfNames = List.copyOf(names);
		doNotChange(copyOfNames);
	}

	private static void doNotChange(List<String> copyOfNames) {
		copyOfNames.add("should not change");

	}

}
