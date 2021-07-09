package stringMetodlar;

import java.util.Scanner;

public class parola {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner gir = new Scanner(System.in);
		String parola = "jaVa";
		System.out.println("Parola: ");
		String girilen = gir.next();
		if(parola.equalsIgnoreCase(girilen)) System.out.println("Doðru");
		else System.out.println("Yanlýþ");
	}
	
}
