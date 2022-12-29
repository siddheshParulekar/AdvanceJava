package exception;


public class ThrowEg {
	
	static void checkAge(int age){
		
		if(age<18) {
			throw new ArithmeticException("Not Qualififed"); 
		}else {
			System.out.println("access granted");
		}
		
	}
	
	public static void main(String[] args) {
		checkAge(10);
		
		System.out.println("Rest code");
		
		
	}

}
