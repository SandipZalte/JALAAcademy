package Utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime {
	public static String CurrentDateTime() {
		DateTimeFormatter dtf =DateTimeFormatter.ofPattern("dd-MM-yyyy-hh-mm-ss");
		LocalDateTime ldt= LocalDateTime.now();
		String datetime=ldt.format(dtf);
		return datetime;
	}

}
