package threading;

public class Thread2 extends Thread {
	
public void run() {
		
		System.out.println("Thread Two started");
		
		for(int i = 11;i<=20;i++) {
			System.out.println("Thhread 2" +i);
//			try {
//				sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		System.out.println("Thread Two ended");
		
		
	}

}
