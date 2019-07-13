package training;

public class ThreadPriority {

	public static void main(String[] args)  throws Exception
	{
		Thread t1 = new Thread(() ->
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hi  " + Thread.currentThread().getPriority());
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		});
		Thread t2 = new Thread(() ->
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hello " + Thread.currentThread().getPriority());
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		});
		t1.setName("HI Thread");  // to set name of thread
		t2.setName("HELLO Thread");
		System.out.println(t1.getName());
		System.out.println(t2.getName());  // to print name of thread
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		 
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority()); // to print priority
		
		t1.start();
		try {Thread.sleep(10);} catch(Exception e) {}
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Bye");
		
	}
}
