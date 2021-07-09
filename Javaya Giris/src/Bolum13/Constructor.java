package Bolum13;

public class Constructor {
	
	//bir sýnýftan nesne türetildiðinde o nesneye baþlangýç deðeri atayabilmek için constructors (yapýcý metotlar) kullanýlýr.
	
	//Garbage collector
	//nesneyi silmek için finalize()
	
	/*
	 * Özellikleri
	 * 1. bir sýnýf yapýcýsýnýn adý, sýnýf adý ile ayný olmalý
	 * 2. yapýcý metot geriye deðer döndürmez
	 * 3. yapýcý metotlar parametreli ve parametresiz kullanýlabilir
	 * 4. bir sýnýfýn birden fazla yapýcý metodu (sýnýfýn adý ayný olmak þartýyla) olabilir.
	 */
	
	//this = nesnenin kendisini referans etmesini saðlar. this.nesneAdi;
	//super = üst sýnýfa ait metoda eriþmek için kullanýlýr.
		/*
	 * Deðiþkenlere yapýcý fonksiyon içerisinde ilk deðerleri verilir.
	 */
		public double PI;
		public double r;
		
		/*
		 * Parametresiz yapýcý fonksiyon tanýmý
		 */
		public Constructor() {
			PI = 3.14;
			r = 4;
		}
		/*
		 * Parametreli yapýcý fonksiyon tanýmý
		 */
		public Constructor(double x, double y) {
			PI = x;
			r = y;
		}
		/*
		 * Alaný hesaplayan fonksiyon
		 */
		public double Alan() {
			return PI * r * r;
		}
		public static void main(String[] args) {
			System.out.println("**Test iþlemi**");
			Constructor fd = new Constructor();
			Constructor fd2 = new Constructor(3.14, 5);
			System.out.println(" Yarýçap: 4 cm olan dairenin alaný: " + fd.Alan());
			System.out.println(" Yarýçap: 5 cm olan dairenin alaný: " + fd2.Alan());
		}
}