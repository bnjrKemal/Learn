package abstracClass;


public class Test {

	
	public static void main(String[] args) {
		
//		Hayvan hayvan = new Hayvan();
		
		Hayvan[] a = new Hayvan[3];
		a[0] = new Inek();
		a[1] = new Kopek();
		a[2] = new Kedi();
		System.out.println("**Hayvanlar konuþuyor**");
		for(int i = 0; i < 3; i++) {
			a[i].Konus();
		}
	}
	
}
