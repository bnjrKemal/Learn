package Diziler;

import java.util.Arrays;
import java.util.Scanner;

class binarySearch {

	static int A[] = {2, 5, 6, 1, 78, 43, 23, 89, 9, 14};
	
	static int ikiliAra(int A[], int N, int ara) {
		int orta, alt = 0, ust = N - 1;
		while(alt <= ust) {
			orta = (alt+ust)/2;
			if(ara<A[orta]) alt = orta + 1;
			else if (ara >A[orta]) ust = orta - 1;
			else return 1;
		}
		return 0;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		for(int i = 0; i< 10; i++) {
			System.out.printf("%d ", A[i]);
		}
		int[] B = A;
		System.out.print("\n");
		Arrays.sort(B);
		int b = Arrays.binarySearch(A, 89);
		System.out.println(b);
		for(int i = 0; i < 10; i ++) {
			System.out.printf("%d ", B[i]);
		}
		int Aranan, bayrak = 0;
		System.out.printf("Aranan sayý: ");
		Aranan = new Scanner(System.in).nextInt();
		bayrak = ikiliAra(sirala(A), 9, Aranan);
		if(bayrak == 1) System.out.println("Aranan bulundu.");
		else System.out.println("Aranan bulunamadý.");
	}
	
	public static int[] sirala(int[] dizi) {
		int enk;
		for(int i = 0; i <= dizi.length ;i++) {
			for(int j = i + 1; j < dizi.length; j++) {
				if(dizi[i] < dizi[j]) {
					enk = dizi[i];
					dizi[i] = dizi[j];
					dizi[j] = enk;
				}
			}
		}
		return dizi;
	}
}
