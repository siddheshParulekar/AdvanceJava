package threading;

public class ThreadLambdaExpression {
	
	
	public static void main(String args[]) {  
	Runnable thread1 = () ->
	{
		for(int i = 1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	};
	
	
	Thread t1 =new Thread (thread1);
	t1.start();
	try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Thread t2 =new Thread (thread1);
	t2.start();
	
	}

}
