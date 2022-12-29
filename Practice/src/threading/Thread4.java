package threading;

public class Thread4 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task2 stared");
		for (int i=1;i<=10;i++) {
			System.out.println("Task2");
		}
		
		System.out.println("Task 2 ended");
		
	}

}
