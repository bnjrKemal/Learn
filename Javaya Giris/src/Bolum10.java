public class Bolum10 {
	
	public static void main(String[] args) {
		
		//StrictMath.
		
		/*
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.round(9.4)); //en yakın sayıya yuvarlar. rint(x)
		System.out.println(Math.floor(8.6)); //alt sayıya yuvarlar.
		System.out.println(Math.ceil(7.6)); //üst sayıya yuvarlar.
		System.out.println(Math.abs(65*-2)); //mutlak değer verir. fabs(x)
		
		/*
		int tahmin, sayac= 0, puan = 100;
		Scanner tara = new Scanner(System.in);
		int tut = 1 + ((int) (Math.random() * 100));
		System.out.println("İlk tahmininiz: ");
		do {
			tahmin = tara.nextInt();
			sayac++;
			if (tahmin==tut)
					System.out.println("Bravo! " + sayac + " tahminde " + tut + " sayısını bildiniz!");
			else if (tahmin < tut)
				System.out.print("Daha büyük bir sayı gir\n");
			else
				System.out.println("Daha küçük bir sayı gir\n");
			puan-=10;
		}while(tahmin!=tut);
		System.out.println("Puanınız: " + puan);
		
		/*
		for(int i = 1; i <= 7; i++) {
			Random rnd = new Random();
			int s = (rnd.nextInt(10)+1) * 7;
			System.out.println(i+1+".sayı.:"+s);
		}
		
		/*
		int zar;
		for(zar = 0; zar<10; zar++) {
			System.out.print(((int) (Math.random()*6) + 1) + " ");
		}
		
		/*
		System.out.println((int) (Math.random()*10));
		*/
	}
	
}
