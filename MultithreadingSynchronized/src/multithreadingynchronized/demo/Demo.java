package multithreadingynchronized.demo;

import multithreadingynchronized.sharedresources.SharedResources;

 public class Demo extends Thread {

	SharedResources sr2;
	public Demo(SharedResources sr2){
		this.sr2=sr2;
	}
	
	public void run() // overriding the run method / whatever code we want to run/execute the particular thread we will write under run method
	{
		sr2.res2();
	}
}
