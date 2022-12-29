package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class multiThreadingDemo {
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new Thread1());
		executorService.execute(new Thread2());
		executorService.shutdown();
		
	}

}
