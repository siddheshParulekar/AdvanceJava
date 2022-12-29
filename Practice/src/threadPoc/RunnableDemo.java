package threadPoc;

import java.util.Iterator;

import java8F.ThreadingUsingMethRef;

public class RunnableDemo implements Runnable {

	private int number;

	public RunnableDemo(int number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		return "RunnableDemo [number=" + number + "]";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
			System.out.println("Thread " + number + "  " + i);

		}

	}

	public static void main(String[] args) {
		RunnableDemo r1 = new RunnableDemo(1);
		RunnableDemo r2 = new RunnableDemo(2);

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();

		//

		// using lamda
		
		Runnable r3 = ()->{
			
			 for (int i = 0; i<5; i++) {
				 System.out.println(i);
				
			}
		};
		
		Thread t3 = new Thread(r3);
	//	t3.start();
		
		Thread t4 = new Thread(r3);
		t3.start();
		t4.start();

				
	}

}
