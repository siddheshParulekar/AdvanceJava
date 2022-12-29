package lockImpl;

public class ObjectLockImpl implements Runnable {
	public void run() { Lock(); }
	 
    public void Lock()
    {
        System.out.println(
            Thread.currentThread().getName());
        synchronized (this)
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
        ObjectLockImpl g1 = new ObjectLockImpl();
        //Thread t1 = new Thread(g1);
        Thread t1 = new Thread(g1);
        Thread t2 = new Thread(g1);
        ObjectLockImpl g2 = new ObjectLockImpl();
        Thread t3 = new Thread(g2);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }

	
}
