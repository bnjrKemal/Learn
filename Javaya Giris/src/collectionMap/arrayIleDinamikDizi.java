package collectionMap;

import java.util.ArrayList;
import java.util.List;

public class arrayIleDinamikDizi {

	public static void main(String[] args) {

		List<String> ad = new ArrayList<String>();
		ad.add("Adem");
		ad.add("Ali");
		ad.add("Nuh");
		ad.add(1, "Musa"); //Araya isim ekler
		System.out.println("Eleman say�s�: " + ad.size());
		System.out.println("Liste: " + ad);
		System.out.println("�lk eleman: " + ad.get(0)); //Listenin ba��ndakini g�ster
		ad.remove(0); //Listenin ba��ndakini sil
		System.out.println("Yeni liste: " + ad);
		boolean a = ad.contains("Ali"); //"Ali" listede mevcut mu?
		System.out.println(a ? "Evet" : "Hay�r" );
		ad.clear(); //tamam�n� sil
		System.out.println("Bo� liste: " + ad);
		
	}

}
