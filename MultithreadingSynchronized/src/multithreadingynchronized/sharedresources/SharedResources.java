package multithreadingynchronized.sharedresources;

 public class SharedResources {
	
	public synchronized void res1() 
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException exception)
			{
				exception.printStackTrace();
			}
		}
	}
		
	public synchronized void res2() 
	{
			for(int i=101;i<=110;i++)
			{
				System.out.println(i);
				try
				{
					Thread.sleep(2000);
				}
				catch(InterruptedException exception){
					exception.printStackTrace();
				}
			}
	}

}
