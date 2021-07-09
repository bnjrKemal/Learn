package collectionMap;

import java.util.Collections;
import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {

		//Elemanlarýný eklerken sýralý þeklinde ekleniyor
		TreeSet<String> ts1 = new TreeSet<String>(/*Collections.reverseOrder()*/);
		ts1.add("Kemal");
		ts1.add("Leyla");
		ts1.add("Nezir Abi");
		ts1.add("Kemal"); //tekrarlanmaz
		System.out.println(ts1);
		
		var ts2 = new TreeSet<String>(Collections.reverseOrder());
		
		for(String s : ts1) ts2.add(s);
		System.out.println(ts2);
		
	}

}
