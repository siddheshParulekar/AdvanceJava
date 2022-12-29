package java8F;



interface interfaceDemo{
	void add();
}

public class MethodRef {
	public static void add1() {
		System.out.println("Doing addition");
		System.out.println("Doing addition again");
	} 


	
	public static void main(String[] args) {
		interfaceDemo ifDemo =MethodRef::add1;
		ifDemo.add();
	}
	

}
