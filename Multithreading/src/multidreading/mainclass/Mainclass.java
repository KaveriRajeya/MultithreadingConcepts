package multidreading.mainclass;

import multidreading.demo.Demo;
import multidreading.sample.Sample;

public class Mainclass {

	public static void main(String[] args) {
		Sample sample=new Sample();
		Thread thread1=new Thread(sample);
		thread1.start();
		
		Demo demo=new Demo();
		Thread thread2=new Thread(demo);
		thread2.start();
	}

}
