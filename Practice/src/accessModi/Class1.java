package accessModi;

public class Class1 {
	
	int a=10;
	public void demo() {
		System.out.println("Public demo method");
	}
	
	protected void demo1() {
		System.out.println("Protected demo method");
	}
	
	private void demo2() {
		System.out.println("Private demo method");
		
			
	}
	private  static void demo3() {
		System.out.println("Private static demo method");
		
		}
	
	
	public static void main(String[] args) {
		
		Class1 obj1 = new Class1();
		obj1.demo();
		obj1.demo1();
		obj1.demo2();
		Class1.demo3();
		
	}
	
	
	

}
