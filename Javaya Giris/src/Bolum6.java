
import javax.swing.JOptionPane;

public class Bolum6 {

	public static void main(String [] args) {

		String[] secenekler = {"�ok �ekerli", "�ekerli", "Az �ekerli", "�ekersiz"};
		
		String mesaj = "Kahveye �eker ister misiniz?";
		int secim =JOptionPane.showOptionDialog(null, mesaj, "Kemal Restoran", JOptionPane.YES_NO_CANCEL_OPTION, 2, null, secenekler, null);
		JOptionPane.showMessageDialog(null, (secenekler[secim]) + " kahveniz hemen geliyor, efendim", "Kemal Restoran", 1, null);
		
		//JOptionPane.showConfirmDialog(null, "Kahveye ka� �eker istersiniz?", "Kemal Restoran", 3, 2, null, secenekler, null);
	}
		/*
		System.out.println("B�lent bey...");
		int sonuc = JOptionPane.showConfirmDialog(null, "Kahve al�r m�s�n?", "Kemal Restoran", 0);
		if (sonuc == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Sipari� verildi", "Kemal Restoran", 1);
		}else {
			JOptionPane.showMessageDialog(null, "Siz bilirsiniz.", "Kemal Restoran", 1);
		}
	}
		//Onay(Confirm) Diyalog Kutusu
		//-1 = ok
		//0 = yes no
		//1 = yes no cancel
		//2 = ok cancel
		
		/*Kullan�c�lar�n onaylar�
		 * JOptionPane.OK_OPTION
		 * JOtionPane.YES_OPTION
		 * JOptionPane.NO_OPTION
		 * JOptionPane.CANCEL_OPTION
		 */
		/*
		JOptionPane.showConfirmDialog(null, "Emin misin?", "Kahve sipari�i", -1, 2);
		JOptionPane.showConfirmDialog(null, "Emin misin?", "Kahve sipari�i", 0, 2);
		JOptionPane.showConfirmDialog(null, "Emin misin?", "Kahve sipari�i", 1, 2);
		JOptionPane.showConfirmDialog(null, "Emin misin?", "Kahve sipari�i", 2, 2);
		
		/*
		String first = JOptionPane.showInputDialog(null, "Hesap makinesi" ,"1. say� giriniz: ", 3);
		String second = JOptionPane.showInputDialog(null, "Hesap makinesi", "2. say� giriniz: ", 3);
		
		JOptionPane.showMessageDialog(null,
				(first + " + " + second + " = " + (Integer.parseInt(first) + Integer.parseInt(second))) + "\n" +
				(first + " - " + second + " = " + (Integer.parseInt(first) - Integer.parseInt(second))) + "\n" +
				(first + " * " + second + " = " + (Integer.parseInt(first) * Integer.parseInt(second))) + "\n" +
				(first + " / " + second + " = " + (Float.parseFloat(first) / Float.parseFloat(second)))
				,"Hesap makinesi", 1);
		/*
		String str1 = JOptionPane.showInputDialog(null, "1. say�; ");
		String str2 = JOptionPane.showInputDialog(null, "2. say�; ");
		JOptionPane.showMessageDialog(null, "Toplam: " + (Integer.parseInt(str2) + Integer.parseInt(str1)));
		/*
		//Input(Veri Giri�i) �leti�im Kutusu
		JOptionPane.showInputDialog(null, "Mesaj", "Ba�l�k", 3);
		/*
		String ileti = "Kurs ��renciler; \n" + "1. Raci baba\n" + "2. Kemal abi\n" + "3. Mecnun ��nar";
		JOptionPane.showMessageDialog(null, ileti);
		/*
		//Message �leti�im Kutusu
		JOptionPane.showMessageDialog(null, "Emin misiniz?", "Kahve ��er misiniz?", 3);
		JOptionPane.showMessageDialog(null, "Siz  bilirsiniz", "Kahve istemediniz", 2);
		*/
		//3 = 3 soru 1 cevap
		//2 = dikkat
		//1 = 1 bilgi (I)nformation
		//0 = err0r
		//-1= simge yok
		/*
		JOptionPane.showConfirmDialog(null, "Ad�n�z?"); //Kullan�c�dan ald��� cevaba g�re i�lem yap�lmas�n� sa�layan kutu
		JOptionPane.showMessageDialog(null, "Merhaba"); //Kullan�c�ya bilgi veren ileti�im kutusu
		JOptionPane.showInputDialog("Kahve ister misin?"); //Kullan�c�dan bilgi almak i�in (String tipinde) kullan�lan kutu
		JOptionPane.showOptionDialog(null, args, null, 0, 0, null, args, args); //Kullan�c�lar�n se�ti�i se�eneklerden birini
		*/																	//kullan�lmas� istendi�inde kullan�lan kutu
		/*
		double a;
		int b, c;
		System.out.println("Gir kenarlar�\n");
		Scanner tara = new Scanner(System.in);
		b = tara.nextInt();
		c = tara.nextInt();
		a = Math.sqrt(b * b + c * c);
		System.out.println("Hipoten�s ; " + a);
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
		 * Giri� ��k�� i�lemleri
		 * System.in = klavye giri�i
		 * System.out = ��kt�s�
		 * System.err = hata mesajlar�n� alma
		 * 
		 * Erkana yazd�rma
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
