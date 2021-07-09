package Bolum13;

public class Sýnýf {
	
	//Sýnýf deðiþkenleri
	private String marka;
	private String renk;
	private int kapasite;
	private int motor;
	
	public void ozellik(String ma, String r, int m, int k) {
		marka = ma;
		renk = r;
		motor = m;
		kapasite = k;
	}
	
	public void yaz() {
		System.out.println(marka);
		System.out.println(renk);
		System.out.println(motor);
		System.out.println(kapasite);
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		Sýnýf kamyon = new Sýnýf();
		Sýnýf taksi = new Sýnýf();
		//Bilgi gir
		kamyon.ozellik("BMW", "Kýrmýzý", 3000, 9000);
		taksi.ozellik("Renault", "Füme", 1600, 2800);
		//Ekrana yazdýr
		kamyon.yaz();
		taksi.yaz();
	}
}
