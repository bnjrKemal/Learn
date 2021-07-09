package Diziler;

import java.util.Scanner;

public class arama {

	private static Scanner ara;
	static int A[] = {2, 5, 6, 1, 78, 43, 23, 89, 9, 14};
	
	public static void main(String[] args) {
		int i, Aranan, bayrak = 0;
		System.out.println("Aranan sayý: ");
		ara = new Scanner(System.in);
		Aranan = ara.nextInt();
		for(i=0; i<10; i++) {
			if(Aranan == A[i]) {
				System.out.printf("%d. sýrada bulundu", i + 1);
				bayrak = 1;
				break;
			}
		}
		if(bayrak == 0) System.out.println("Aranan bulunamadý.");
	}
	
}
