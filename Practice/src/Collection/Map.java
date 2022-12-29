package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Map {
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(10, "Value1");
		hashmap.put(2, "Value2");
		hashmap.put(3, "Value3");
		hashmap.put(4, "Value4");
		hashmap.put(5, "Value5");
		System.out.println("HashMap contains: " + hashmap);
		/* Get values based on key */
		String var = hashmap.get(2);
		System.out.println("Value at key 2 is: " + var);

		/* Remove values based on key */
		hashmap.remove(3);
		System.out.println("Map keys and values after removal:");
		Set set = hashmap.entrySet();
		Iterator it = set.iterator();
//		while (it.hasNext()) {
//			java.util.Map.Entry pair = (java.util.Map.Entry) it.next();
//			System.out.print("Key is: " + pair.getKey() + " and Value is: ");
//			System.out.println(pair.getValue());
//
//		}

		for (int key : hashmap.keySet()) {
			System.out.println("Key  " + key + " vale " + hashmap.get(key));

		}
		System.out.println(hashmap.size());

		HashMap<Integer, String> hashmap1 = new HashMap<Integer, String>();
		hashmap1.put(5, "z");
		hashmap1.put(3, "e");
		hashmap1.put(10, "a");
		hashmap1.put(6, "b");
		hashmap1.put(9, "q");

		System.out.println("before sorting" + hashmap1);
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>(hashmap1);
		System.out.println("After sorting" + treemap);

	}
}
