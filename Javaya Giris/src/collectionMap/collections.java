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
		Iterator<String> iteratorlist = list.iterator(); //baþtan sona sýralar. her koleksiyon sýnýfýnýn iterator() metodu vardýr.
		iteratorlist.hasNext(); //sonraki deðerin olup olmadýðýný sorgular.
		list.forEach(x -> System.out.println(x)); //
		
		Iterator<String> forkey = hashmap.keySet().iterator();
		Iterator<Integer> forvalue = treemap.values().iterator();
		
		if(forkey.hasNext()== true) forvalue.next();
		
		ListIterator<String> listiterator = linkedlist.listIterator();
		listiterator.next(); //bir sonraki elemaný çaðýrýr
		listiterator.hasNext(); //bir sonraki elemanýn var olup olmadýðýný sorgular
		listiterator.previous(); //bir önceki elemaný çaðýrýr
		listiterator.hasPrevious(); //bir önceki elemanýn var olup olmadýðýný sorgular
		listiterator.remove(); //next() ile döndürülen elemaný siler
	}
}
