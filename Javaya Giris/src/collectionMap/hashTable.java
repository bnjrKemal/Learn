package collectionMap;

import java.util.Hashtable;
import java.util.Iterator;

public class hashTable {

	public static void main(String[] args) {
		Hashtable<Integer, String> il = new Hashtable<>();
		il.put(34, "�stanbul");
		il.put(35, "�zmir");
		il.put(01, "Adana");
		il.put(60, "Tokat");
		il.put(26, "Eski�ehir");
		
		System.out.println(il);
		Iterator<Integer> plaka = il.keySet().iterator();
		Iterator<String> ilAd = il.values().iterator();
		while(plaka.hasNext()) System.out.println(plaka.next() + " : " + ilAd.next());		
	}

}
