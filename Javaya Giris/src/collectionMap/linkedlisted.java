package collectionMap;

import java.util.LinkedList;

public class linkedlisted {

	public static void main(String[] args) {
		
		LinkedList<String> bList = new LinkedList<>();
		bList.add("Mavi");
		bList.add("Gri");
		bList.add("Sar�");
		bList.add(2, "Mor");
		System.out.println("Boyutu: " + bList.size());
		System.out.println("Renk listesi: " + bList);
		
		bList.addFirst("Siyah");
		bList.addLast("Beyaz");
		System.out.println("Boyutu: " + bList.size());
		System.out.println("Renk listesi: " + bList);
		
		bList.sort(null);
		System.out.println("S�ral� Liste: " + bList);
		var isaretci = bList.listIterator();
		while(isaretci.hasNext()) System.out.print(isaretci.next() + " -> ");
		System.out.println();
		while(isaretci.hasPrevious()) System.out.print(isaretci.previous() + " <- ");
		
	}
}
