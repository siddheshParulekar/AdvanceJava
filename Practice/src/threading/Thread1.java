package threading;

import java.security.PublicKey;

public class Thread1 extends Thread{
	
	public void run() {
		
		System.out.println("Thread One started");
		
		for(int i = 1;i<=10;i++) {
			System.out.println("Thraed1" +i);
//			try {
//				sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		System.out.println("Thread One Ended");
		
	}

}
