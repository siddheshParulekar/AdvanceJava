package exception;

public class DemoException {

	public static void main(String args[]) throws MyException {

		int i = 1, m;
		int j = 0, k = 10;

		if (i < k) {
			throw new MyException("Enter valid value");
		}
//			m= i/j;
//			System.out.println(m);

		System.out.println("Heloooooo");
//		System.out.println(k);

	}

}

class MyException extends Exception {
	public MyException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
