package collectionMap;

import java.util.Vector;

public class vectorIleDinamikDizi {

	public static void main(String[] args) {
		
		/*
		 * Vector, ne kadar b�y�yebilece�i bilmedi�imiz durumlarda dinamik dizi tan�mlanmas� kullan�l�r.
		 * Dinamik dizi tan�mlamak i�in Vector ve ArrayList s�n�flar� kullan�l�r.
		 * 
		 */
		
		Vector<String> ad = new Vector<String>();
		String[] stringDizi = {"nuh", "isa", "musa", "adem"};
		for(String isim : stringDizi) ad.add(isim);
		
		System.out.println("Vector'�n ilk hali");
		System.out.println(ad);
		System.out.println("Eleman say�s�: " + ad.size());
		ad.set(2, "osman");
		ad.add("ay�e");
		ad.add("ali");
		
		System.out.println("Vector'�n son hali: ");
		System.out.println(ad);
		System.out.println("Eleman say�s�: " + ad.size());
		System.out.println("�lk eleman�: " + ad.firstElement());
		System.out.println("Son eleman�: " + ad.lastElement());

	}

}