package collectionMap;

import java.util.HashMap;
import java.util.Map;

public class hashMap {

	public static void main(String[] args) {
		
		//T�rk�e-�ngilizce s�zl���
		
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
		sozluk.put("��", "three");
		sozluk.put("d�rt", "four");
		sozluk.put("d�rt", "four");
		sozluk.putIfAbsent("be�", "five");
		
		System.out.println(sozluk);
		
	}
	
}
