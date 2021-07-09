
public class Bolum789 {

	enum harflerim {k,e,m,a,l};
	
	public static void main(String[] args) {
		
		
		
		/*
		int i,j,k;
		for(i = 1; i <=5; i++) {
			for(j = 1; j <= 3; j++) {
				for(k = 1; k<=4; k++) {
					System.out.printf("*");
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
		}	
		/*
		int r, s;
		for(int i = 0; i<=10; i++) {
			s = 1;
			r = i + 1;
			for(int sut = 0; sut <=i; sut++) {
				if (sut > 0) s = s * (r - sut) / sut;
				System.out.print(s + " ");
			}
			System.out.println();
		}
		
		/*
		for(int i = 6; i> 0 ;i--) {
			for(int k = 1; k<=i ; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		/*
		System.out.println("\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10");
		System.out.print("\t----------------------------------------");
		System.out.print("----------------------------------------\n");
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d\t|", i);
			for(int j = 1; j <= 10; j++) {
				System.out.printf("%d\t", i * j);
			}
			System.out.println();
		}
		
		/*
		for(int x = 11; x<=20; x++) {
			for(int y = 11; y<=20; y++) {
				System.out.printf("%d*%d=%d\t", x,y,x*y);
			}
			System.out.println();
		}
		
		/*
		for(harflerim str : harflerim.values()) {
			System.out.print(str);
		}
		
		/*
		for(int x = 24; x>=0; x--) {
			if(x%2==1) continue;
			System.out.println(x);
		}
		
		/*
		int s = 0, top = 0, n;
		double ort;
		do {
			s++;
			System.out.println(s+".sayý" + "(Çýkmak için 0 gir): ");
			Scanner in = new Scanner(System.in);
			n = in.nextInt();
			top +=n;
		}while(n != 0);
		ort = (float) top / s - 1;
		System.out.println("Ortlama: " + ort);
		/*
		for(;koþul;) {}
		while(koþul) {}
		 eþdeðer
		/*
		/*
		var liste = Arrays.asList(0, 1, 2, 3, 4, 5);
		for(int sayi : liste) {
			System.out.println(sayi);
		}
		*/
		/*
		var listlambda = Arrays.asList(4,5,6,7,8,9);
		listlambda.forEach(
				sayi -> System.out.println(sayi));
		listlambda.forEach(System.out::println);
		
		/*
		int fakt=1;
		
		for(int i=6; i>=1;i-=1) {
			fakt*=i;
		}
		System.out.println(fakt);
		
		/*
		char c = 'A';
		for(; c <='Z'; c++) {
			System.out.print(c+" ");
		}
		System.out.println(c+1);
		
		/*
		int i, t=0;
		for(i=0;i<=24;i+=2) {
			t=t+i;
		}
		System.out.println(t);
		
		/*
		int x = 1;
		int z = 1;
			
		for(int xinloop=x*-1; xinloop<=x; xinloop++) {
			for(int zinloop=z*-1; zinloop<=z; zinloop++) {
				System.out.println("Lokasyon; " + xinloop + ", " + zinloop);
			}
		}
		*/
		
		
		/*
		for(int s=0; s<=5; ++s) {
			System.out.println(s);
		}
		*/
		/*
		int s=0;
		int t=0;
		do {
			t=t+(++s);
			System.out.println(t);
		}while(s<5);
		*/
	}
	
}
