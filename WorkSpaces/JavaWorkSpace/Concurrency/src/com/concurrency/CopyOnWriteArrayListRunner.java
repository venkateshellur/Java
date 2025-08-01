
package com.concurrency;

//import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

	public static void main(String[] args) {
		// This provides the synchronized way while writing and skipping while reading
		// This method is worth when there are minimal write operations and many read
		// operations
		// List<String> list = new CoyOnWriteArrayList<>();

		// list.add("Ant");
		// list.add("Cat");
		// list.add("Cat");
//
		// for (String ele : list) {
		// System.out.println(ele);
		// }
	}

}
