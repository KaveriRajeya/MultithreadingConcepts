package multithreadingynchronized.sample;

import multithreadingynchronized.sharedresources.SharedResources;

 public class Sample extends Thread{

	SharedResources sr1;
	public Sample(SharedResources sr1)
	{
		this.sr1=sr1;
	}
	public void run()
	{
		sr1.res1();
	}
}
