package OverridingLoading;



class Demo {

	public void sub() {

		System.out.println("Parent method");

	}
	protected void name(String name) {
		System.out.println("Protected parent");
		
	}
	public static void staticdemo() {
		System.out.println("parent static method");
	}

}

public class OverLoading extends Demo {

	// overriding
	public void sub() {

		System.out.println("Child method");

	}
	//overriding
	protected void name(String name) {
		System.out.println("Protected child");
		
	}
	//overriding
	public static void staticdemo() {
		System.out.println("child static method");
	}

	// overloading
	public int add(int a, int b) {
		return a + b;
	}
	
	public String add(Float a,int b ) {
		return "Hello";
	}

	public int add(int a, int b, int c) {
		return a + b + b;

	}

	public double add(double a, double b) {
		return a + b;
	}
	public static double add(double a,int b) {
		return a+b;
	}
	
	public Integer add(Integer a) {
		System.out.println("warpper");
		return a ;
	}
	public int add(int a) {
		System.out.println("Primitive");
		return a ;
	}
	
	

	public static void main(String[] args) {

		OverLoading objLoading = new OverLoading();
		Demo objOverridingDemo =new OverLoading();
		System.out.println(objLoading.add(1, 2));
		System.out.println(objLoading.add(1, 2, 3));
		System.out.println(objLoading.add(1.0, 2.0));
		
		objLoading.add(2);
		objLoading.add(1);
		
		//overriding
		objOverridingDemo.sub();
		objOverridingDemo.name("hello");
		//overrinng static methods
		objOverridingDemo.staticdemo();

	}

}
