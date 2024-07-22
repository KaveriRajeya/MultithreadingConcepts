package multidreading.demo;

public class Demo extends Thread{

	public void run()
	{
		for(int i=101;i<=110;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000); //running in milliseconds
			}
			catch(InterruptedException exception)
			{
				exception.printStackTrace();
			}
		}
	}
	
}
