package java8F;

import java.util.Iterator;

import abstraction.interfaceDemo;

public class LambdaExpression {

	public static void main(String[] args) {

		Runnable r1 = () -> {

			for (int i = 0; i <= 5; i++) {
				System.out.println("Thread1 " + i);
			}
		};

		Runnable r2 = () -> {
			for (int j = 0; j <= 5; j++) {
				System.out.println("Thread2  " + j);
			}
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t2.start();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
