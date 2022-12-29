package OverridingLoading;

class Test{ 
	void show(int a) {// Type of argument
		System.out.println("1");
	}
	void show(float a) {
		System.out.println("2");
	}
	
	void print(int a, String b) { // Sequence of argument
		System.out.println("10");
	}
	void print(String b, int a) {
		System.out.println("20");
	}
	
	void call(int a) {// No of argument
		System.out.println("11");
	}
	void call() {
		System.out.println("12");
	}
	
}

class Test1{
	int show(int a) {// Important : ReturnType same nhi hoga, but parameter different hona chaiyea : 
		return a;
	}
	float show(float b) {
		return b;
	}
	
}

public class demo1 {
	public static void main(String[] args) {
		Test test = new Test();
//		test.show(3);
//		test.show(2.0f);
		
//		test.print(1, "akash");
//		test.print("akash", 2);
		
//		test.call();
//		test.call(2);
		
		Test1 test1 = new Test1();
		System.out.println( test1.show(2f));
		test1.show(2);
		
		
		
		
		
		
		
		
	}
}
