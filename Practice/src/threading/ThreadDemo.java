package threading;

public class ThreadDemo extends Thread {
	
	public void run() {
		System.out.println("Tread is running");
	}
	
	
	
	
	
	public static void main(String[] args) {
//		ThreadDemo t1 = new ThreadDemo();
//		ThreadDemo t2 = new ThreadDemo();
//		t1.start();
//		t2.start();
		Thread1 t1 = new Thread1();
		Thread2 thread2 = new Thread2();
		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		thread2.start();
		
	}

}
