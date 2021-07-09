package collectionMap;

import java.util.Vector;

public class vectorIleDinamikDizi {

	public static void main(String[] args) {
		
		/*
		 * Vector, ne kadar büyüyebileceði bilmediðimiz durumlarda dinamik dizi tanýmlanmasý kullanýlýr.
		 * Dinamik dizi tanýmlamak için Vector ve ArrayList sýnýflarý kullanýlýr.
		 * 
		 */
		
		Vector<String> ad = new Vector<String>();
		String[] stringDizi = {"nuh", "isa", "musa", "adem"};
		for(String isim : stringDizi) ad.add(isim);
		
		System.out.println("Vector'ün ilk hali");
		System.out.println(ad);
		System.out.println("Eleman sayýsý: " + ad.size());
		ad.set(2, "osman");
		ad.add("ayþe");
		ad.add("ali");
		
		System.out.println("Vector'ün son hali: ");
		System.out.println(ad);
		System.out.println("Eleman sayýsý: " + ad.size());
		System.out.println("Ýlk elemaný: " + ad.firstElement());
		System.out.println("Son elemaný: " + ad.lastElement());

	}

}