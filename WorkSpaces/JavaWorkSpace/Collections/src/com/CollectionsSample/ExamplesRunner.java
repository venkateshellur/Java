package com.CollectionsSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class ExamplesRunner {

	public static void main(String[] args) {
		// ListExample();
		// SetsExample();
		queueExample();
	}

	public static void ListExample() {
		List<Student> students = List.of(new Student(1, "Venky"), new Student(2, "Deepika"), new Student(3, "pranav"),
				new Student(4, "Kishan"), new Student(5, "FifthPerson"), new Student(6, "SixthPerson"),
				new Student(7, "SeventhPerson"), new Student(100, "HundredthPerson"),
				new Student(80, "EightiethPerson"), new Student(95, "NinthFifthPerson"),
				new Student(8, "EighthPerson"));

		// System.out.println(students);

		// Sorted Collections implementation
		System.out.println("\n Sorted Collections ");
		List<Student> studentsAL = new ArrayList<>(students);
		Collections.sort(studentsAL);
		// System.out.println(studentsAL);

		// Implementing the custom comparator
		Collections.sort(studentsAL, new AscendingStudentComparator());
		System.out.println(
				"\n\n Ascending Order Results using the CUSTOM COMPARATOR class implementation \nAsc : " + studentsAL);

		// Another way of Implementing the custom comparator
		studentsAL.sort(new AscendingStudentComparator());
		System.out.println(
				"\n\n Ascending Order Results using the CUSTOM COMPARATOR class implementation \nAsc : " + studentsAL);

	}

	public static void SetsExample() {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'J', 'C', 'H', 'K', 'D', 'D', 'E', 'F');
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println(treeSet); // The list is sorted in ascending order by default ignoring the duplicates
										// which is the nature of treeset.

		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println(linkedHashSet); // Stores the data in the order it was provided ignoring the Duplicates.

		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println(hashSet); // HashSet neither sorts or follows the order of the data in which it was
										// entered.

	}

	public static void queueExample() {
		Queue<String> queue = new PriorityQueue<>();
		queue.addAll(List.of("Lion", "Tiger", "Elephant", "Monkey")); // Stores the data in Ascending order
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
}