package learningDateAndTimeInJava;
import java.time.LocalDate; //import the LocalDate class
import java.time.LocalTime; //import the LocalTime class
import java.time.LocalDateTime; //import the LocalDateTime class
public class learnDateAndTime {

	public static void main(String[] args) {
		LocalDate myObj = LocalDate.now(); //create a date object
		System.out.println(myObj);//display the current date
		LocalTime myObj2 = LocalTime.now();
		System.out.println(myObj2);
		LocalDateTime myObj3 = LocalDateTime.now();
		System.out.println(myObj3);
	}
}
