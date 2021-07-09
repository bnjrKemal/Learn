package Bolum13;

public class Constructor {
	
	//bir s�n�ftan nesne t�retildi�inde o nesneye ba�lang�� de�eri atayabilmek i�in constructors (yap�c� metotlar) kullan�l�r.
	
	//Garbage collector
	//nesneyi silmek i�in finalize()
	
	/*
	 * �zellikleri
	 * 1. bir s�n�f yap�c�s�n�n ad�, s�n�f ad� ile ayn� olmal�
	 * 2. yap�c� metot geriye de�er d�nd�rmez
	 * 3. yap�c� metotlar parametreli ve parametresiz kullan�labilir
	 * 4. bir s�n�f�n birden fazla yap�c� metodu (s�n�f�n ad� ayn� olmak �art�yla) olabilir.
	 */
	
	//this = nesnenin kendisini referans etmesini sa�lar. this.nesneAdi;
	//super = �st s�n�fa ait metoda eri�mek i�in kullan�l�r.
		/*
	 * De�i�kenlere yap�c� fonksiyon i�erisinde ilk de�erleri verilir.
	 */
		public double PI;
		public double r;
		
		/*
		 * Parametresiz yap�c� fonksiyon tan�m�
		 */
		public Constructor() {
			PI = 3.14;
			r = 4;
		}
		/*
		 * Parametreli yap�c� fonksiyon tan�m�
		 */
		public Constructor(double x, double y) {
			PI = x;
			r = y;
		}
		/*
		 * Alan� hesaplayan fonksiyon
		 */
		public double Alan() {
			return PI * r * r;
		}
		public static void main(String[] args) {
			System.out.println("**Test i�lemi**");
			Constructor fd = new Constructor();
			Constructor fd2 = new Constructor(3.14, 5);
			System.out.println(" Yar��ap: 4 cm olan dairenin alan�: " + fd.Alan());
			System.out.println(" Yar��ap: 5 cm olan dairenin alan�: " + fd2.Alan());
		}
}