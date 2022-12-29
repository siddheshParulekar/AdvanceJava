package abstraction;

public class interfaceImpl  implements interfaceDemo{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawiing");
		
	}
	
	//overriding default method
	@Override
	public void Printable() {
		System.out.println("In child class");
	}
	
	
	public static void main(String[] args) {
		interfaceDemo in1 = new interfaceImpl();
		System.out.println(in1.a);
		in1.draw();
		in1.Printable();
		//interfaceDemo.super.Printable();
		interfaceDemo.staticMethod();
	}

}
