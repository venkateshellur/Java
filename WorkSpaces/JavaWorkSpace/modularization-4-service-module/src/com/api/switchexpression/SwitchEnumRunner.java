package com.api.switchexpression;

import java.time.DayOfWeek;

public class SwitchEnumRunner {

	public static void main(String[] args) {

		DayOfWeek day = DayOfWeek.FRIDAY;

		// In case of Enums Compiler is smart enough to understand if all enum values
		// are implemented to ignore the default case as below.
		// Ensures all enum values are handled
		String str = switch (day) {
		case MONDAY -> "First Day of the week!";
		case TUESDAY, WEDNESDAY, THURSDAY -> "Middle of the work Week";
		case FRIDAY -> "Getting ready for the weekend !!!";
		case SATURDAY, SUNDAY -> "Yeah !!! it's Weekend !!!";
		};

		System.out.println(str);
	}

}
