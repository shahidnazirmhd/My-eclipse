package basic.classesObjects;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeMain1 {

	public static void main(String[] args) {
		LocalTime mytime=LocalTime.now();
		LocalDate mydate=LocalDate.now();
		System.out.println(mytime);
		System.out.println(mydate);
		LocalDateTime mydatetime=LocalDateTime.now();
		System.out.println(mydatetime);
		DateTimeFormatter myformat = DateTimeFormatter.ofPattern("E, MMM dd yyyy hh-mm-ss");
		String formatted= mydatetime.format(myformat);
		System.out.println("\n"+formatted);
		
	}

}
