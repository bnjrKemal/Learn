public class Bolum10 {
	
	public static void main(String[] args) {
		
		//StrictMath.
		
		/*
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.round(9.4)); //en yak�n say�ya yuvarlar. rint(x)
		System.out.println(Math.floor(8.6)); //alt say�ya yuvarlar.
		System.out.println(Math.ceil(7.6)); //�st say�ya yuvarlar.
		System.out.println(Math.abs(65*-2)); //mutlak de�er verir. fabs(x)
		
		/*
		int tahmin, sayac= 0, puan = 100;
		Scanner tara = new Scanner(System.in);
		int tut = 1 + ((int) (Math.random() * 100));
		System.out.println("�lk tahmininiz: ");
		do {
			tahmin = tara.nextInt();
			sayac++;
			if (tahmin==tut)
					System.out.println("Bravo! " + sayac + " tahminde " + tut + " say�s�n� bildiniz!");
			else if (tahmin < tut)
				System.out.print("Daha b�y�k bir say� gir\n");
			else
				System.out.println("Daha k���k bir say� gir\n");
			puan-=10;
		}while(tahmin!=tut);
		System.out.println("Puan�n�z: " + puan);
		
		/*
		for(int i = 1; i <= 7; i++) {
			Random rnd = new Random();
			int s = (rnd.nextInt(10)+1) * 7;
			System.out.println(i+1+".say�.:"+s);
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
