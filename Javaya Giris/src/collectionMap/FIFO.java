package collectionMap;

import java.util.List;
import java.util.PriorityQueue;

public class FIFO {

	public static void main(String[] args) {
		
		List<String> liste = List.of("Kemal", "Leyla", "�evval", "Hakan", "Eflin", "Yusra");
		PriorityQueue<String> kuyruk = new PriorityQueue<>(liste);
		kuyruk.offer("Sare");
		kuyruk.add("Rana");
		System.out.print(kuyruk + "\n");
		
		System.out.println("Elemanlar� ��kart�l�yor");
		while(!kuyruk.isEmpty()) System.out.println(kuyruk.remove());
		kuyruk.poll();
		System.out.println(kuyruk);
		
	}
	
}
