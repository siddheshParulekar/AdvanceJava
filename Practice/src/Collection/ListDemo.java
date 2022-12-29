package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(21);
		list1.add(52);
		list1.add(39);
		list1.add(94);
		list1.add(56);

		// metrhods
		System.out.println(list1);
		list1.add(3, 10);
		System.out.println("Size of aaraylist is: " + list1.size());
		System.out.println(list1);
		list1.remove(1);

		System.out.println("Size of aaraylist is: " + list1.size());

		// iterrating using foreach
		System.out.println("usimg foreach");
		for (Integer integer : list1) {
			System.out.println(integer);
		}

		// iterarting using iterator

		System.out.println("usig iterator");
		Iterator<Integer> iterator = list1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		//sorting the arrayList
		System.out.println("Soriting the arrayList");
		
		System.out.println("before soting" + list1);
		
		 Collections.sort(list1);
		System.out.println("after sorting" + list1);
		
		System.out.println("Sorting is reverse order");
		
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(212);
		list2.add(521);
		list2.add(393);
		list2.add(944);
		list2.add(566);

		// metrhods
		System.out.println(list2);
		
		list1.addAll(list2);
		
		System.out.println(list1);
		
		
		
		// Declare LinkedList 
	      LinkedList<String> ll=new LinkedList<String>();  

	      // Adding elements to the LinkedList
	        ll.add("A");
	        ll.add("B");
	        ll.addLast("C");
	        ll.addFirst("D");
	        ll.add(2, "E");
	        ll.add("F");
	        ll.add("G");
	        System.out.println("LinkedList : " + ll);
	 
	        // Removing elements from the LinkedList
	        ll.remove("C");
	        ll.remove(2);
	        ll.removeFirst();
	        ll.removeLast();
	        System.out.println("LinkedList after deletion: " + ll);
		

	}

}
