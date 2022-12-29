package exception;

class MyException1 extends Exception {

	public MyException1(String message) {
		super(message);

	}

}

public class UserDefinedException {

	public static void main(String[] args)throws MyException1 {

		try {

			throw new MyException1("UserDefined Error");
		} catch (MyException1 e) {
			// TODO: handle exception
			System.out.println("Caught exception");
			System.out.println(e.getMessage());
		}

	}

}
