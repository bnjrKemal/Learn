package stringMetodlar;

import java.util.Scanner;

public class copyValueOf {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int sayac = 0;
		String parola =  "java";
		Scanner gir = new Scanner(System.in);
		do {
			System.out.print("Parola: ");
			String girilen = gir.next();
			if(parola.compareTo(girilen) == 0) {
				System.out.println("Bildiniz.");
				break;
			}
			sayac++;
		}while(sayac<3);
		if(sayac>=3) {
			System.out.println("Hatalý parola. Hakkýnýz doldu!");
		}
	}

}
