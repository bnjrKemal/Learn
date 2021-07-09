package collectionMap;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class collections {

	//Collection
	//1. List
	static List<String> list = new ArrayList<String>();
	static Vector<String> vector = new Vector<String>();
	static List<String> linkedlist = new LinkedList<>();
	
	//2. Set
	static Set<Integer> hashset =new HashSet<Integer>();
	static TreeSet<Integer> treeset = new TreeSet<Integer>();
	static Set<Integer> linkedhashset = new LinkedHashSet<Integer>();
	
	//3. Queue
	static Queue<String> queue = new LinkedList<>();
	static PriorityQueue<String> priorityqueue = new PriorityQueue<>();
	static Deque<String> deque = new LinkedList<String>();
	static ArrayDeque<String> arraydequ = new ArrayDeque<>();
	static Stack<String> stack = new Stack<String>();
	
	//Map
	static Map<String, Integer> hashmap = new HashMap<String, Integer>();
	static Map<String, Integer> treemap = new TreeMap<String, Integer>();
	static Map<String, Integer> linkedhashmap = new LinkedHashMap<String, Integer>();
	static Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
	
	public static void main(String[] args) {		
		Iterator<String> iteratorlist = list.iterator(); //ba�tan sona s�ralar. her koleksiyon s�n�f�n�n iterator() metodu vard�r.
		iteratorlist.hasNext(); //sonraki de�erin olup olmad���n� sorgular.
		list.forEach(x -> System.out.println(x)); //
		
		Iterator<String> forkey = hashmap.keySet().iterator();
		Iterator<Integer> forvalue = treemap.values().iterator();
		
		if(forkey.hasNext()== true) forvalue.next();
		
		ListIterator<String> listiterator = linkedlist.listIterator();
		listiterator.next(); //bir sonraki eleman� �a��r�r
		listiterator.hasNext(); //bir sonraki eleman�n var olup olmad���n� sorgular
		listiterator.previous(); //bir �nceki eleman� �a��r�r
		listiterator.hasPrevious(); //bir �nceki eleman�n var olup olmad���n� sorgular
		listiterator.remove(); //next() ile d�nd�r�len eleman� siler
	}
}
