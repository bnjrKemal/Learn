package Bolum13;

public class S�n�f {
	
	//S�n�f de�i�kenleri
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
		S�n�f kamyon = new S�n�f();
		S�n�f taksi = new S�n�f();
		//Bilgi gir
		kamyon.ozellik("BMW", "K�rm�z�", 3000, 9000);
		taksi.ozellik("Renault", "F�me", 1600, 2800);
		//Ekrana yazd�r
		kamyon.yaz();
		taksi.yaz();
	}
}
