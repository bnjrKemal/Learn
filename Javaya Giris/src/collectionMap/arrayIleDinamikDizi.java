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
		System.out.println("Eleman sayýsý: " + ad.size());
		System.out.println("Liste: " + ad);
		System.out.println("Ýlk eleman: " + ad.get(0)); //Listenin baþýndakini göster
		ad.remove(0); //Listenin baþýndakini sil
		System.out.println("Yeni liste: " + ad);
		boolean a = ad.contains("Ali"); //"Ali" listede mevcut mu?
		System.out.println(a ? "Evet" : "Hayýr" );
		ad.clear(); //tamamýný sil
		System.out.println("Boþ liste: " + ad);
		
	}

}
