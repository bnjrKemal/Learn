
public class Bolum11 {

	static int recursivefakt(int m) {
		if(m<=1) {
			return m;
		}else {
			return m * recursivefakt(m - 1);
		}
	}
	
	static int fakt(int n) {
		int i,f = 1;
		for(i = n; i>0; i--) {
			f*=i;
		}
		return f;
	}
	
	public static void main(String[] args) {
		System.out.println(fakt(5));
		System.out.println(recursivefakt(4));
		}
		
	}
	
	
	/*
	static int toplam(int x, int y) {
		return x + y;
	}
	public static void main(String[] args) {
		
		System.out.println(toplam(toplam(1, 2), 5));
		
	}
}
	
	/*
	static int s1 = 4;
	static int DegFonk(int s1) {
		s1 = 8; // Deðerini alan fonksiyon
		return s1;
	}
	static int RefFonk(int s1) {
		Bolum11.s1 = 8; //Referansýný alan fonksiyon
		return Bolum11.s1;
	}

	public static void main(String[] args) {
		
		System.out.println("Deðerini al-iþle");
		DegFonk(s1);
		System.out.println("s1..:" + DegFonk(s1)); //8
		System.out.println("s1..:" + s1); //4
		
		System.out.println("Referansý al-iþle");
		RefFonk(s1);
		System.out.println("s1..:" + RefFonk(s1)); //8
		System.out.println("s1..:" + s1); //8
	}
	
	
}
	
	/*
	static void oyna() {
		for(int i = 1; i <= 100; i++) {
			if (i%15==0) {
				System.out.print("FizzBuzz \n");
				continue;
			}
			if (i%3==0) {
				System.out.print("Fizz \n");
				continue;
			}
			else if (i%5==0) {
				System.out.print("Buzz \n");
				continue;
			}
			else {
				System.out.print(i + " \n");
			}
			
	
			}
		
		}
	}
			
			/*
	public static void main(String[] args) {
				
		Selam();
		(new Bolum11()).Selam1();
		
	}

	static void Selam() {
		System.out.println("Çalýþtýrýldý. 1");
	}
	void Selam1() {
		System.out.println("Çalýþtýrýldý. 2");
	}
	*/