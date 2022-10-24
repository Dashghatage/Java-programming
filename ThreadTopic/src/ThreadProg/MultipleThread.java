package ThreadProg;


class Demo2 extends Thread
{
	public void run()
	{
		System.out.println("hiii");
	}
}
class Sample2 extends Thread
{
	public void run()
	{
		System.out.println("hello");
	}
}

public class MultipleThread {
public static void main(String[] args) {
	Sample2 s1=new Sample2();
	Thread th1=new Thread(s1);
	th1.start();
	Demo2 d1=new Demo2();
	Thread th2=new Thread(d1);
	th2.start();
}
}
