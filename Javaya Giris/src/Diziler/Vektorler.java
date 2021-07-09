package Diziler;

public class Vektorler {

	public static void main(String[] args) {
		char A[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
		char B[] = new char[10];
		System.out.println("B[10]= ");
		for(int i = 0; i<=9; i++) {
			B[i] = A[9-i];
			System.out.printf("\t%c", B[i]);
		}
		System.arraycopy(A, 4, B, 4, 5);
		System.out.println(A[9]);
	}
}
	
	/*
	
	private static Scanner tara;
	
	public static void main(String[] args) {
		int Para, Sa, i;
		int K[] = {200, 100, 50, 20, 10, 5, 1};
		tara = new Scanner(System.in);
		Para = tara.nextInt();
		for(i = 0; i<=6; i++) {
			Sa = (int) Para / K[i];
			Para = Para - Sa * K[i];
			if(Sa != 0) {
				System.out.println(Sa + " adet " + K[i] + " TL ");
			}
		}
		System.out.println(" vermelisin.");
	}
	
	/*
	public static void main(String[] args) {
		int dizi[] = new int[10];
		for(int i = 0; i<10; i++) {
			dizi[i] = (int) (Math.random()*100);
			System.out.println(dizi[i]);
		}
	}
	*/
