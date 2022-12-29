package exception;

import abstraction.interfaceDemo;

public class ExceptionHandling {

	public static void main(String[] args) {
//		int x1 = 100;
//	      int y1 = 0;
//	      int z1 = x1 / y1;
//		

		// handling exception
		try {
			
			System.out.println("l1");
			try {
				System.out.println("l2");
				try {
					System.out.println("l3");
					int x = 100;
					int y = 0;
					int z = x / y;
				} catch (ArithmeticException e) {
					// TODO: handle exception
					System.out.println("Inner catch block");
				}
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println(e);
				System.out.println("Value cant be divide by zero");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Outer");
		} finally {
			System.out.println("Implementing finally block");
		}

		System.out.println("Helooo ");

	}

}
