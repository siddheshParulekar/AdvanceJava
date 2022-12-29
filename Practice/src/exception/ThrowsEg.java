package exception;

class Test{
	static int div(int a,int b) {
		
		return a/b;
	}
}

public class ThrowsEg {
	
	public static void main(String[] args) throws ArithmeticException {
		
		try {
			Test.div(2, 0);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("cant divide by zero");
		}
		
	}

}
