package multithreadingrunnable;

public class Demo implements Runnable{

	public void run()
	{
		for(int i=101;i<=110;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException exception)
			{
				exception.printStackTrace();
			}
		}
	}

}
