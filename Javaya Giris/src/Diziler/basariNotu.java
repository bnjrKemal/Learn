package Diziler;

public class basariNotu {

	public static void main(String[] args) {
		double ort;
		double A[][] = new double[10][7];
		for(int i = 0; i<=9;i++) {
			A[i][0] = i + 1; //��renci numaralar�
			for(int j = 1; j <=5; j++) { //Notlar rastgele �retiliyor.
				A[i][j] = 1 + (int) (Math.random() * 100);
			}
			
			//Ba�ar� notu hesaplan�yor.
			
			ort = (((A[i][1]*15) + (A[i][2]*15) + (A[i][3]*20) + (A[i][4]*50)) * 0.3/100 + (A[i][5] * 70) / 100);
			A[i][6] = Math.round(ort); //yuvarlat�l�yor.
		}
		System.out.println(" No" + "\t" + "KS-1" + "\t" + "KS-2" + "\t" + "�dev" + "\t" + "Vize" + "\t" + "Final" + "\t" + "Ba�ar� Notu");
		System.out.println(" ====\t====\t====\t====\t====\t====\t====\t====");
		for(int k = 0; k <= 9; k++) {
			for(int m = 0; m <= 6; m++) {
				System.out.print(" " + (A[k][m]) + "\t");
				if(m == 6) {
					if(A[k][6] >= 50) System.out.print("Ge�ti");
					else System.out.print("Kald�");
				}
			}
			System.out.println();
		}
	}
	
}
