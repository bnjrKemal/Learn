package Date;

import java.time.Duration;
import java.time.Instant;
import java.util.Calendar;

public class calender {

	public static void main(String[] args) {
		Instant basla = Instant.now();
		Calendar c = Calendar.getInstance();
		System.out.println(c.toString());
		Instant bitir = Instant.now();
		Duration gecenSure = Duration.between(basla, bitir);
		System.out.println("MSN: " + gecenSure.toNanos() + " msn");
	}
	
}
