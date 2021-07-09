package Polymorphizm;

public class Alem {

	public static void main(String[] args) {
		
//		Hayvan hayvan = new Hayvan();
		
		Hayvan[] a = new Hayvan[3];		
		a[0] = new Kedi();
		a[1] = new Kopek();
		a[2] = new Inek();
		for(int i = 0; i<3; i++) {
			a[i].Konus();
			if(a[i] instanceof Kopek) {
				System.out.println("Köpektir.");
			}
		}
	}
}
