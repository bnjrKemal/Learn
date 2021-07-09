package stringMetodlar;

import java.util.Scanner;

public class sezar {

	@SuppressWarnings("resource")
	public static void main(String[] ar) {
		
		Scanner gir = new Scanner(System.in);
		System.out.println("Kelime: ");
		String x = gir.nextLine();
		x.toLowerCase();
		char[] k = x.toCharArray();
		System.out.printf("\nÞifrelenmiþ Kelime: ");
		for(int i = 0; i< x.length();i++) {
			k[i] = (char) (x.codePointAt(i) + 4);
			System.out.printf("%c", k[i]);
		}
		
	}
	
}
