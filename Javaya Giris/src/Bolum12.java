public class Bolum12{

	public static void main(String[] args) {
		assert (true);
		//assert (false);
	}
		/*
		System.out.printf("Lütfen 2 - 20 arasý bir sayý gir: ");
		@SuppressWarnings("resource")
		int sayý = (new Scanner(System.in)).nextInt();
		
		//Eðer sayý asal ise
		assert (sayý%2==0|| sayý==9||sayý==15); //assert(true) : "";
		assert (sayý%2==0|| sayý==9||sayý==15) : sayý + " asaldýr"; //
		System.out.printf("Girilen %d\n", sayý);
		
	}
	
	
	/*
	static Scanner girS = new Scanner(System.in);
	
	public Bolum12(String s) {
		super(s);
	}
	
	public static void main (String[] args) {
		System.out.println("1. sayý..: ");
		double pay = girS.nextInt();
		System.out.println("2. sayý..: ");
		double payda = girS.nextInt();
		if(payda == 0) throw new Bolum12("se");
		System.out.println(pay/payda);
	}
	static Scanner girKat = new Scanner(System.in);
	/*
	public static void main(String[] args) {
		System.out.println("Kaçýncý kata çýkacaksýn?");
		int i = girKat.nextInt();
		int k = 0;
		if(k == 0) {
			System.out.println("selam");
			throw new ArithmeticException("Bu hatalý");
		}else {
			
		}
		//if(k==13) throw new ArithmeticException("Bu kata çýkýlmaz.");
		//else System.out.println(i + ". kata çýkýldý.");
	}
	//static Scanner ts = new Scanner(System.in);
	/*
	public static void main(String[] args) {
		System.out.println("Gir bir sayý: ");
		int i = TamsayiAl();
		System.out.println("Karesi : "  + i*i);
	}
	
	public static int TamsayiAl() {
		while(true)
		try {
			return ts.nextInt();
		}catch(InputMismatchException e){
			ts.next();
			System.out.println("Girilen tamsayý deðil\n" + "Tekrar deneyin: ");
		}
	}
	*/
}
