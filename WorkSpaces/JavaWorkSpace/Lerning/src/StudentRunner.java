
public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = { 99, 97, 100 };
		Student student = new Student("Venky", marks);
		int number = student.getNumberOfMarks();
		System.out.println(number);
		System.out.println(student.getTotalMarks());
		System.out.println(student.getAverageMarks());
	}

}