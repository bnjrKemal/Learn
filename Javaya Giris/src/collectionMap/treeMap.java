package collectionMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class treeMap {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner tara = new Scanner(System.in);
		Map<String, String> sozluk = new TreeMap<>();
		sozluk.put("bir", "one");
		sozluk.put("iki", "two");
		sozluk.put("üç", "three");
		sozluk.put("dört", "four");
		
		System.out.println(sozluk);
		System.out.println("Aranan kelime: ");
		String ara = tara.next();
		if(sozluk.containsKey(ara)) System.out.println(sozluk.get(ara));
		else System.out.println("Sözlükte yoktur.");
		
	}
	
}
