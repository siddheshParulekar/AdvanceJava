package lockImpl;

public class ClassLockImpl implements Runnable {
	
	 public void run() { Lock(); }
	 
	    public void Lock()
	    {
	        System.out.println(
	            Thread.currentThread().getName());
	        synchronized (ClassLockImpl.class)
	        {
	            System.out.println(
	                "in block "
	                + Thread.currentThread().getName());
	            System.out.println(
	                "in block "
	                + Thread.currentThread().getName()
	                + " end");
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	        ClassLockImpl g1 = new ClassLockImpl();
	        Thread t1 = new Thread(g1);
	        Thread t2 = new Thread(g1);
	        ClassLockImpl g2 = new ClassLockImpl();
	        Thread t3 = new Thread(g2);
	        t1.setName("t1");
	        t2.setName("t2");
	        t3.setName("t3");
	        t1.start();
	        t2.start();
	        t3.start();
	    }

}
