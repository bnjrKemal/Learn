package Arac;

public class Arac {


	public static void main(String[] args) {

//		Taksi taksi = new Taksi();
		Kamyon kamyon = new Kamyon();
		
		System.out.println(kamyon.intgoster());
		
		/*
		Taksi taksi = new Taksi();
		Kamyon kamyon = new Kamyon();
		
		//Taksi taksi = arac.new Taksi();
		//Kamyon kamyon = arac.new Kamyon();
		
		//Taksi
		taksi.calis(30);
		taksi.goster();
		taksi.hizliGit();
		taksi.goster();
		
		//Kamyon
		kamyon.calis(50);
		kamyon.goster();
		*/
	}
	
	protected int aHiz = 0;
	private String renk = "sarý";
	private boolean durum = true;
	
	public void calis(int Hiz) {
		if (durum == true) aHiz = aHiz + Hiz;
	}
	public void dur() {
		if (durum == true) {
			aHiz = 0;
			durum = false;
		}
	}
	public void goster() {
		System.out.println("Çalýþma: " + durum + "\nHýzý: " + aHiz);
		System.out.println("Rengi: " + renk + "\n");
	}
	
}
