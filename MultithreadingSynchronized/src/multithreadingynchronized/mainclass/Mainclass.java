package multithreadingynchronized.mainclass;

import multithreadingynchronized.demo.Demo;
import multithreadingynchronized.sample.Sample;
import multithreadingynchronized.sharedresources.SharedResources;

public class Mainclass {
	
	public static void main(String[] args) {
		SharedResources sr= new SharedResources();
		Sample s1=new Sample(sr);
		Thread th1=new Thread(s1);
		th1.start(); //asyncronous method it returns immediately
		
		Demo d1=new Demo(sr);
		Thread th2=new Thread(d1);
		th2.start();
	}

}


// we can create threads in two ways 

// implementing runnable interface
// extending thread class