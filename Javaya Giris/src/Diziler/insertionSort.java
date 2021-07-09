package Diziler;

public class insertionSort {

	
	public static void main(String[] args) {
		int A[] = {2, 5, 6, 1, 78, 43, 23, 89, 9, 14};
		int i, ekle;
		for(i = 1; i < 10; i++) {
			ekle = A[i];
			while(i > 0 && A[i-1] < ekle) {
				A[i] = A[i - 1];
				i = i - 1;
			}
			A[i] = ekle;
		}
		System.out.println("Sýralý hali:\n");
		for(i=0;i<10;i++) {
			System.out.printf("%d ", A[i]);
		}
	}
	
}
