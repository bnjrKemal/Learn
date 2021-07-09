package collectionMap;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		
		/*
		 * add()
		 * offer()
		 * 
		 * poll()
		 * remove()
		 */
		
		List<String> queuE = List.of("Ali", "Bade", "Can"); //queuE liste oluþturuldu.
		Queue<String> kuyruk = new LinkedList<>(queuE);
		kuyruk.offer("Sare");
		kuyruk.add("Rana");
		System.out.println(kuyruk);
		kuyruk.poll();
		System.out.println(kuyruk);
		
		System.out.println("Kuyruktan elemanlar çýkartýlýyor");
		while(!kuyruk.isEmpty()) System.out.println(kuyruk.remove());
		System.out.println(kuyruk);
		
	}
}
