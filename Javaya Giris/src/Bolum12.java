public class Bolum12{

	public static void main(String[] args) {
		assert (true);
		//assert (false);
	}
		/*
		System.out.printf("L�tfen 2 - 20 aras� bir say� gir: ");
		@SuppressWarnings("resource")
		int say� = (new Scanner(System.in)).nextInt();
		
		//E�er say� asal ise
		assert (say�%2==0|| say�==9||say�==15); //assert(true) : "";
		assert (say�%2==0|| say�==9||say�==15) : say� + " asald�r"; //
		System.out.printf("Girilen %d\n", say�);
		
	}
	
	
	/*
	static Scanner girS = new Scanner(System.in);
	
	public Bolum12(String s) {
		super(s);
	}
	
	public static void main (String[] args) {
		System.out.println("1. say�..: ");
		double pay = girS.nextInt();
		System.out.println("2. say�..: ");
		double payda = girS.nextInt();
		if(payda == 0) throw new Bolum12("se");
		System.out.println(pay/payda);
	}
	static Scanner girKat = new Scanner(System.in);
	/*
	public static void main(String[] args) {
		System.out.println("Ka��nc� kata ��kacaks�n?");
		int i = girKat.nextInt();
		int k = 0;
		if(k == 0) {
			System.out.println("selam");
			throw new ArithmeticException("Bu hatal�");
		}else {
			
		}
		//if(k==13) throw new ArithmeticException("Bu kata ��k�lmaz.");
		//else System.out.println(i + ". kata ��k�ld�.");
	}
	//static Scanner ts = new Scanner(System.in);
	/*
	public static void main(String[] args) {
		System.out.println("Gir bir say�: ");
		int i = TamsayiAl();
		System.out.println("Karesi : "  + i*i);
	}
	
	public static int TamsayiAl() {
		while(true)
		try {
			return ts.nextInt();
		}catch(InputMismatchException e){
			ts.next();
			System.out.println("Girilen tamsay� de�il\n" + "Tekrar deneyin: ");
		}
	}
	*/
}
