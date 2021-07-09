package collectionMap;

import java.util.HashMap;
import java.util.Map;

public class hashMap {

	public static void main(String[] args) {
		
		//Türkçe-Ýngilizce sözlüðü
		
		/*
		 * 
		 * put(key, value) eleman ekler
		 * putAll(Map, M) 
		 * putIfAbsent(key,value) yoksa eleman ekler varsa eklemez
		 * containsKey(key)
		 * containsValue(value)
		 * get()
		 * 
		 */
		
		Map<String, String> sozluk = new HashMap<>();
		sozluk.put("bir", "one");
		sozluk.put("iki", "two");
		sozluk.put("üç", "three");
		sozluk.put("dört", "four");
		sozluk.put("dört", "four");
		sozluk.putIfAbsent("beþ", "five");
		
		System.out.println(sozluk);
		
	}
	
}
