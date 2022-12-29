package threading;

public class JoinExample {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		thread1.start();
		thread1.join();
		thread2.start();
	}

}
