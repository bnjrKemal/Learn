import java.util.Scanner;

public class romaRakam {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner gir = new Scanner(System.in);
		System.out.print("Gir bir sayý: ");
		int sayi = gir.nextInt();
		String Roma = "";
		String R[] = {"M", "D", "C", "L", "X", "V", "I"};
		int D[] = {1000, 500, 100, 50, 10, 5, 1};
		
		for(int i = 0; i< D.length; i++) {
			while(sayi >= D[i]) {
				if(sayi == 4) {
					Roma = Roma + "IV";
					sayi -= 4;
					continue;
				}
				if(sayi == 9) {
					Roma = Roma + "IX";
					sayi -= 9;
					continue;
				}
				Roma = Roma + R[i];
				sayi = sayi - D[i];
			}
		}
		
		System.out.println("Romen = " + Roma);
		
	}

}
