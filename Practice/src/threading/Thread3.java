package threading;

public class Thread3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task1 stared");
		for (int i=1;i<=10;i++) {
			System.out.println("Task1");
		}
		
		System.out.println("Task 1 ended");
		
	}

}
