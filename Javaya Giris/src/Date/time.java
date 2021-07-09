package Date;

import java.util.Date;

public class time {

	public static void main(String[] args) {
		long firstMS = System.currentTimeMillis();
		Date d = new Date();
		System.out.println(d);
		System.out.println("Ping: " + (System.currentTimeMillis() - firstMS) + " ms");
	}
	
}
