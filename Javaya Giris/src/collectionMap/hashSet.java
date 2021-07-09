package collectionMap;

import java.util.HashSet;
import java.util.Set;

public class hashSet {

	public static void main(String[] args) {

		//Elemanlarýný (tekrarsýz) kümeye ekler.
		
		Set<Integer> kume1 = Set.of(0, 2, 4, 6, 8, 1, 3, 5, 7, 9);
		Set<Integer> kume2 = Set.of(1, 3, 5, 7, 9);

		System.out.println(kume1);
		System.out.println(kume2);
		
		Set<Integer> kume = new HashSet<Integer>(kume1);
		System.out.println(kume);
		kume.add(10);
		System.out.println(kume);
		kume.addAll(kume2);
		System.out.println(kume);
		
	}

}