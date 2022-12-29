package threading;

import java.util.Iterator;

public class YieldExample {

	public static void main(String[] args) {

		Runnable r1 = () -> {

			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				
			}

		};
		Thread t1 = new Thread(r1);
		t1.start();
		Thread.yield();
		
		
		
		System.out.println("Main thread is running");
		for (int i = 11; i < 15; i++) {
			
			System.out.println(i);
			
		}
		
		
		//Thread.yield();
		
		
	}

}
