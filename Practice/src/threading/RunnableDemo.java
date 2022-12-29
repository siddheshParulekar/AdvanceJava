package threading;

public class RunnableDemo {
	
	
	public static void main(String[] args) {
		
		Thread3 thread3= new Thread3();
		Thread4 thread4 = new Thread4();
		
		
		Thread threadT = new Thread(thread3);
		Thread threadFThread = new Thread(thread4);
		threadT.start();
		threadFThread.start();
		
	}

}
