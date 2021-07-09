package Encapsulation;

public class TV {

	private int boy;
	private int en;
	private int yukseklik;
	public int b = 5;
	
	//setter fonksiyonları
	public void setUz(int p) {
		boy = p;
	}
	public void setEn(int p) {
		en = p;
	}
	public void setYuk(int p) {
		yukseklik = p;
	}
	public int getSes() {
		return boy*en*yukseklik;
	}
	
	public static void main(String[] args) {
		TV nesne = new TV();
		float ses;
		nesne.setEn(10);
		nesne.setUz(8);
		nesne.setYuk(6);
		ses = nesne.getSes();
		System.out.println("Ses ayarı: " + ses + " birim");
	}
}
