package java8F;

public class constructoerEh {
	
	int a;
	String xString;
	public constructoerEh(int a, String xString) {
//		super();
		this.a = a;
		this.xString = xString;
	}
	
	
	 
	
	
@Override
	public String toString() {
		return "constructoerEh [a=" + a + ", xString=" + xString + "]";
	}





public static void main(String[] args) {
	constructoerEh c1 = new constructoerEh(0, "sid");
	   System.out.println(c1);
}
}
