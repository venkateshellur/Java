
public class StringRunner {

	public static void main(String[] args) {
		String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		System.out.println("The day with longest name is : " + getLongestDayName(days));

	}

	public static String getLongestDayName(String... days) {
		int length = 0;
		String longestDayName = "";
		for (String day : days) {
			if (length < day.length()) {
				length = day.length();
				longestDayName = day;
			}
		}
		return longestDayName;
	}
}
