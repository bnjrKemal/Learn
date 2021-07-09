package Diziler;

public class matrisAktarimi {
	
	static void f1(int V[]) {
		V[0] = 2;
		V[1] = 3;
	}
	
	static void f2(int M[][]) {
		M[0][0] = 4;
		M[1][0] = 8;
	}
	
	public static void main(String[] args) {
		int A[][] = new int[2][2];
		
		f1(A[1]);
		//f2(A);
				
		System.out.printf("%d\t%d", A[0][0], A[0][1]);
		
		System.out.printf("\n%d\t%d", A[1][0], A[1][1]);
		
	}
	
}
