package Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
	
	
	public static void main(String[] args) {
		// Declare HashSet 
	      HashSet<String> hashset = 
	             new HashSet<String>();

	      // Adding elements to the HashSet
	      hashset.add("Apple");
	      hashset.add("Pear");
	      hashset.add("Mango");
	      hashset.add("Papaya");
	      hashset.add("Orange");
	      //Addition of duplicate elements
	      hashset.add("Apple");
	      hashset.add("Mango");
	      //Addition of null values
	      hashset.add(null);
	      hashset.add(null);

	      //Displaying HashSet elements
	      System.out.println(hashset);
	      
	      TreeSet<String> ts = new TreeSet<String>();
	      TreeSet<String> ts1 = new TreeSet<String>();
	      TreeSet<String> ts3 = new TreeSet<String>();

	      
	      // Add elements to the TreeSet
	      ts.add("A");
	      ts.add("B");
	      ts.add("E");
	      ts.add("F");
	      ts.add("D");
	      
	      //Display TreeSet elements
	      System.out.println(ts);
	      
	    ts1=  (TreeSet<String>) ts.clone();
	    
	    System.out.println(ts);
	   System.out.println(ts.contains("A")); 
	   ts3 = (TreeSet<String>) ts.descendingSet();
	   System.out.println(ts3);
	   
	
	}

}
