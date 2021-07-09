package collectionMap;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class linkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> km = new LinkedHashSet<Integer>(Arrays.asList(5, 7, 2, 9));
		var km1 = new LinkedHashSet<Integer>(Arrays.asList(5, 7, 2, 9));
		km.add(6);
		km1.add(10);
		System.out.println(km);
		System.out.println(km1);
		km.remove(5);
		km1.remove(7);
		var dizi = km.toArray();
		var dizi1 = km1.toArray();
		for(var i : dizi) System.out.print(i + " ");
		System.out.println();
		for(var i : dizi1) System.out.print(i + " ");
		
	}

}
