package collectionMap;

import java.util.Deque;
import java.util.LinkedList;

public class LIFO {

	public static void main(String[] args) {
		
		//Stack&Dequeue
		
		Deque<String> yigin = new LinkedList<String>();
		yigin.push("Bade"); //[Bade]
		yigin.push("Veli"); //[Veli, Bade]
		yigin.push("Ali"); //[Ali, Veli, Bade]
		System.out.println(yigin); //goster
		System.out.println(yigin.peek()); //0. elemaný goster
		System.out.println("Elemanlar çýkartýlýyor");
		while(!yigin.isEmpty()) System.out.println(yigin.pop()); //sondaki elemanlar çýkartýlýyor
		System.out.println(yigin);
		
	}
	
}
