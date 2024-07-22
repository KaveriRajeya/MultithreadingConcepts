package multithreadingrunnable;


public class Multithreadmain {
	public static void main(String[] args) 
	{
		Sample sample=new Sample();
		Thread thread1=new Thread(sample);
		thread1.start();
		
		Demo demo=new Demo();
		Thread thread2=new Thread(demo);
		thread2.start();
	}

}
