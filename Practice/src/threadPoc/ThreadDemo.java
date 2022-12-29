package threadPoc;

import abstraction.interfaceDemo;

class task extends Thread {

	private int number;

	public task(int number) {
		this.number = number;

	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("Thread " + number +"  " + i);

		}

	}

}

public class ThreadDemo {
	
	public static void main(String[] args) {
		task t1 = new task(1);
		task t2 = new task(2);
		task t3 = new task(3);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
