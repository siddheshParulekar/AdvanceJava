package staticFinalDemo;

import abstraction.interfaceDemo;

//cant override the class
final class poc1{
	void grand() {
		
	}
}

class poc {
	final void parent(int a) {
		System.out.println("Parent Method");
	}
	final void parent(int a,int b) {
		System.out.println("Parent Method");
	}
	

}

public class FinalDemo extends poc {

	// cant override
//	void parent() {
//		System.out.println("Hello form child class");
//	}
	final int p= 10;
//	
//	 int b = 10;
////    b = p+12;
//	
//	p=b+5;
	
	
	

	public static void main(String[] args) {
		
		FinalDemo f1 = new FinalDemo();
		System.out.println(f1.p);
//		f1.p = 20;
		
	}

}
