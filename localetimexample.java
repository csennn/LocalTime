import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {
		// to print the current time
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime); // 21:44:39.292424700 --> but it is going to change

		// to print the 100. second of day
		localTime = LocalTime.ofSecondOfDay(100);
		System.out.println(localTime); // 00:01:40

	}

}
