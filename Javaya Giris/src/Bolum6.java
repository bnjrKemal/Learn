
import javax.swing.JOptionPane;

public class Bolum6 {

	public static void main(String [] args) {

		String[] secenekler = {"Çok þekerli", "Þekerli", "Az þekerli", "Þekersiz"};
		
		String mesaj = "Kahveye þeker ister misiniz?";
		int secim =JOptionPane.showOptionDialog(null, mesaj, "Kemal Restoran", JOptionPane.YES_NO_CANCEL_OPTION, 2, null, secenekler, null);
		JOptionPane.showMessageDialog(null, (secenekler[secim]) + " kahveniz hemen geliyor, efendim", "Kemal Restoran", 1, null);
		
		//JOptionPane.showConfirmDialog(null, "Kahveye kaç þeker istersiniz?", "Kemal Restoran", 3, 2, null, secenekler, null);
	}
		/*
		System.out.println("Bülent bey...");
		int sonuc = JOptionPane.showConfirmDialog(null, "Kahve alýr mýsýn?", "Kemal Restoran", 0);
		if (sonuc == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Sipariþ verildi", "Kemal Restoran", 1);
		}else {
			JOptionPane.showMessageDialog(null, "Siz bilirsiniz.", "Kemal Restoran", 1);
		}
	}
		//Onay(Confirm) Diyalog Kutusu
		//-1 = ok
		//0 = yes no
		//1 = yes no cancel
		//2 = ok cancel
		
		/*Kullanýcýlarýn onaylarý
		 * JOptionPane.OK_OPTION
		 * JOtionPane.YES_OPTION
		 * JOptionPane.NO_OPTION
		 * JOptionPane.CANCEL_OPTION
		 */
		/*
		JOptionPane.showConfirmDialog(null, "Emin misin?", "Kahve sipariþi", -1, 2);
		JOptionPane.showConfirmDialog(null, "Emin misin?", "Kahve sipariþi", 0, 2);
		JOptionPane.showConfirmDialog(null, "Emin misin?", "Kahve sipariþi", 1, 2);
		JOptionPane.showConfirmDialog(null, "Emin misin?", "Kahve sipariþi", 2, 2);
		
		/*
		String first = JOptionPane.showInputDialog(null, "Hesap makinesi" ,"1. sayý giriniz: ", 3);
		String second = JOptionPane.showInputDialog(null, "Hesap makinesi", "2. sayý giriniz: ", 3);
		
		JOptionPane.showMessageDialog(null,
				(first + " + " + second + " = " + (Integer.parseInt(first) + Integer.parseInt(second))) + "\n" +
				(first + " - " + second + " = " + (Integer.parseInt(first) - Integer.parseInt(second))) + "\n" +
				(first + " * " + second + " = " + (Integer.parseInt(first) * Integer.parseInt(second))) + "\n" +
				(first + " / " + second + " = " + (Float.parseFloat(first) / Float.parseFloat(second)))
				,"Hesap makinesi", 1);
		/*
		String str1 = JOptionPane.showInputDialog(null, "1. sayý; ");
		String str2 = JOptionPane.showInputDialog(null, "2. sayý; ");
		JOptionPane.showMessageDialog(null, "Toplam: " + (Integer.parseInt(str2) + Integer.parseInt(str1)));
		/*
		//Input(Veri Giriþi) Ýletiþim Kutusu
		JOptionPane.showInputDialog(null, "Mesaj", "Baþlýk", 3);
		/*
		String ileti = "Kurs öðrenciler; \n" + "1. Raci baba\n" + "2. Kemal abi\n" + "3. Mecnun Çýnar";
		JOptionPane.showMessageDialog(null, ileti);
		/*
		//Message Ýletiþim Kutusu
		JOptionPane.showMessageDialog(null, "Emin misiniz?", "Kahve Ýçer misiniz?", 3);
		JOptionPane.showMessageDialog(null, "Siz  bilirsiniz", "Kahve istemediniz", 2);
		*/
		//3 = 3 soru 1 cevap
		//2 = dikkat
		//1 = 1 bilgi (I)nformation
		//0 = err0r
		//-1= simge yok
		/*
		JOptionPane.showConfirmDialog(null, "Adýnýz?"); //Kullanýcýdan aldýðý cevaba göre iþlem yapýlmasýný saðlayan kutu
		JOptionPane.showMessageDialog(null, "Merhaba"); //Kullanýcýya bilgi veren iletiþim kutusu
		JOptionPane.showInputDialog("Kahve ister misin?"); //Kullanýcýdan bilgi almak için (String tipinde) kullanýlan kutu
		JOptionPane.showOptionDialog(null, args, null, 0, 0, null, args, args); //Kullanýcýlarýn seçtiði seçeneklerden birini
		*/																	//kullanýlmasý istendiðinde kullanýlan kutu
		/*
		double a;
		int b, c;
		System.out.println("Gir kenarlarý\n");
		Scanner tara = new Scanner(System.in);
		b = tara.nextInt();
		c = tara.nextInt();
		a = Math.sqrt(b * b + c * c);
		System.out.println("Hipotenüs ; " + a);
		*/		
		/*
		//Veritipi degiskenadi = new Scanner(System.in).Metot();
		float C;
		System.out.printf("Gir, fahrenati\n");
		Scanner tara = new Scanner(System.in);
		var F = tara.next();
		//C = (float) ((F - 32) / 1.8);
		System.out.println(F);
		*/
		//System.in
		//System.out
		//System.err
		/*
		 * Giriþ çýkýþ iþlemleri
		 * System.in = klavye giriþi
		 * System.out = çýktýsý
		 * System.err = hata mesajlarýný alma
		 * 
		 * Erkana yazdýrma
		 * System.out.printf
		 * System.out.format
		 * System.out.print
		 * System.out.println
		 * 
		 * 
		 * 
		 */
		/*String str = "bnjrKemal";
		System.out.printf("%h", str.hashCode());
		JOptionPane.showConfirmDialog(null, str);
		*/
		/*
		int a;
		a = new Scanner(System.in).nextInt();
		Scanner in = new Scanner(System.in);
		int a1 = in.nextInt();
		*/
	}
