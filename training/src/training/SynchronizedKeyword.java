package training;

class Counter
{
	int count;
	
	public synchronized void increment()  //synchronized keyword makes the class & method thread safe , with synchronized keyword only one thread can use this method at a time
	{
		count++ ;
	}
}

public class SynchronizedKeyword {

	public static void main(String[] args) throws Exception
	{
		Counter c = new Counter();
		
		Thread t1 = new Thread(new Runnable()
				{
					public void run()
					{
						for(int i=1;i<=1000;i++)
						{
							c.increment();
						}
					}
				});
		Thread t2 = new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=1;i<=1000;i++)
				{
					c.increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("Count  " + c.count);
	}
}
