package Collection;

//Java program to illustrate ConcurrentCollection uses

//Java program to illustrate ConcurrentCollection uses
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;
public class CopyOnWrite extends Thread {
	static CopyOnWriteArrayList<String> l =
					new CopyOnWriteArrayList<String>();
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
		l.add("C");

		// We create a child thread that is
		// going to modify ArrayList l.
		CopyOnWrite t = new CopyOnWrite();
		t.start();

		// Now we iterate through the ArrayList
		// and get exception.
		Iterator<String> itr = l.iterator();
		while (itr.hasNext()) {
			String s = (String)itr.next();
			System.out.println(s);
			Thread.sleep(600);
		}
		System.out.println(l);
	}
}