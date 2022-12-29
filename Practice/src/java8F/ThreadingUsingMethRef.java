package java8F;

public class ThreadingUsingMethRef {
	
	
	public static void main(String[] args) {
		Runnable r1 = MethodRef::add1;
		Thread t1 = new Thread(r1);
		t1.start();
	}
	

}
