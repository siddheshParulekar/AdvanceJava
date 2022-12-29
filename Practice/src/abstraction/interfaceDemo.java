package abstraction;


public interface interfaceDemo {
	int a = 10;

	//cant have constructor
	//interfaceDemo(){}
	void draw(); 

//	 protected void msg() {
//		System.out.println("hello");
//	}
	//public static method with body
	public static  void staticMethod() {
		System.out.println("heloooooo");
	}
	
	// private static method with body
//		private static  void hello() {
//			System.out.println("heloooooo");
//		}

	default void Printable() {
		System.out.println("printingtable");
		// msg();
	}
}
