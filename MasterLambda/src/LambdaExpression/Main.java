package LambdaExpression;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Main method");
		
		//using anonymous function
		MyInterface interface1 = new MyInterface() {
			
			@Override
			public void saHello() {
				// TODO Auto-generated method stub
				System.out.println("hello");
			}
		};
		
		interface1.saHello();
		
		//using lambda Expression
		MyInterface interface2 = () ->{
			System.out.println("hiiiiiie");
		};
		
		interface2.saHello();
		
		//addition using lambda Expression
		SumInterface sumInterface =( a ,b, c) -> {
			return a + b + c;
			};
		
		System.out.println(sumInterface.add(23, 2,5));
		
		MulInter mukInter =( a, b) -> {
			System.out.println(a*b);};
		mukInter.mul(2, 2);
	}

}
