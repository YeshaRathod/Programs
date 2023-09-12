class Shared1
{
    int i;
 
    synchronized void SharedMethod()
    // void SharedMethod()
    {
        Thread t = Thread.currentThread();
 
        for(i = 0; i <= 10; i++)
        {
            System.out.println(t.getName()+" : "+i);
        }
    }
}
public class ThreadSyncro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  final Shared1 s1 = new Shared1();
		  
	        Thread t1 = new Thread("Thread - 1")
	        {
	            @Override
	            public void run()
	            {
	                s1.SharedMethod();
	            }
	        };
	 
	        Thread t2 = new Thread("Thread - 2")
	        {
	            @Override
	            public void run()
	            {
	                s1.SharedMethod();
	            }
	        };
	 
	        t1.start();
	 
	        t2.start();
	}

}