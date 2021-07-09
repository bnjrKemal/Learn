package Diziler;

public class bubbleSort {

	final static int n = 10;
	
	public static void main(String[] args) {
		int A[] = {2, 5, 6, 1, 78, 43, 23, 89, 9, 14};
		int i, j, enk;
		for(i = 0; i<n; i++) {
			for(j = i+1; j<n; j++) {
				if(A[i]<A[j]) {
					enk = A[i];
					A[i] = A[j];
					A[j] = enk;
				}
			}
		}
		System.out.println("Sýralý hali:\n");
		for(i=0; i<n; i++) {
			System.out.printf("%d ", A[i]);
		}
	}
	
}
