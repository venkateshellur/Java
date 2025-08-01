
public class GenericsRunner {

	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList<>();

		list.addElement("Element-1");
		list.addElement("Element-2");
		list.addElement("Element-3");
		System.out.println(list);
		System.out.println(list.Get(1));

		MyCustomList<Integer> list2 = new MyCustomList<>();

		list2.addElement(Integer.valueOf(3));
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		System.out.println(list2);
		System.out.println(list2.Get(2));
	}
}
