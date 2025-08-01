import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	Student(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}

	}

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getMaximumMarks() {
		return Collections.max(marks);
	}

	public int getMinimumMarks() {
		return Collections.min(marks);
	}

	public int getTotalMarks() {
		int totalMarks = 0;
		for (int mark : marks) {
			totalMarks += mark;
		}
		return totalMarks;
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalMarks();
		int number = getNumberOfMarks();
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}
}