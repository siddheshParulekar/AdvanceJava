package Collection;



import java.util.*;
class ConcurrentDemo extends Thread {
	static ArrayList<String> l = new ArrayList<String>();
	public void run()
	{
		try {
			Thread.sleep(200);
		}
		catch (InterruptedException e) {
			System.out.println("Child Thread"
					+ " going to add element");
		}

		// Child thread trying to add new
		// element in the Collection object
		l.add("D");
	}

	public static void main(String[] args)
		throws InterruptedException
	{
		l.add("A");
		l.add("B");
		l.add("c");

		
		ConcurrentDemo t = new ConcurrentDemo();
		t.start();

		// Now we iterate through the ArrayList
		// and get exception.
		Iterator<String> itr = l.iterator();
		while (itr.hasNext()) {
			String s = (String)itr.next();
			System.out.println(s);
			Thread.sleep(6000);
		}
		System.out.println(l);
	}
}
