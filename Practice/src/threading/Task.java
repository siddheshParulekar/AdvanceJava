package threading;

public class Task extends Thread {
	
	private int number;

	public Task(int number) {
		this.number = number;
	}
	
public void run() {
		
		System.out.println("Thread" + number +" started");
		
		for(int i = number*100;i<=number*100 +10 ;i++) {
			System.out.println(i);
		}
		System.out.println("Thread" + number + "  Ended");
		
	}

}
