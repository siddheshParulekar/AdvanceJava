package abstraction;

abstract class demo extends class2 {

	// abstract int a=10; we cant

	// constructor of abstract
	public demo() {
		super();
		System.out.println("Inside abstract constructor");
	}

	abstract void run1();

	//final non abstract method
	final void heloo() {
		System.out.println("Hellooooo");
	}

	// static method of abstract class
	public static void chor() {
		System.out.println("Static method");
	}

}

class fun extends demo {

	@Override
	void run1() {
		System.out.println("Overriding method");
	}

	@Override
	void mock() {
		// TODO Auto-generated method stub
		System.out.println("Implementing parent abstract ");

	}

}

public class abstractclass {

	public static void main(String[] args) {

		// creating object of demo class using annonymous class
//		demo do1 = new demo() {
//			
//			@Override
//			void run1() {
//				// TODO Auto-generated method stub
//				
//			}
//		};

		demo d1 = new fun();// it will call abstract constructor
		d1.heloo();
		d1.mock();
		fun f1 = new fun();
		demo.chor();
		f1.run1();
		f1.mock();

	}

}
