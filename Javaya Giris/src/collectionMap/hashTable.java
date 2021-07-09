package collectionMap;

import java.util.Hashtable;
import java.util.Iterator;

public class hashTable {

	public static void main(String[] args) {
		Hashtable<Integer, String> il = new Hashtable<>();
		il.put(34, "Ýstanbul");
		il.put(35, "Ýzmir");
		il.put(01, "Adana");
		il.put(60, "Tokat");
		il.put(26, "Eskiþehir");
		
		System.out.println(il);
		Iterator<Integer> plaka = il.keySet().iterator();
		Iterator<String> ilAd = il.values().iterator();
		while(plaka.hasNext()) System.out.println(plaka.next() + " : " + ilAd.next());		
	}

}
