package ThreadProg;
class Demo3 extends Thread
{
	public void run()
	{
		for (int i = 100; i <=110; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class Sample3 extends Thread
{
	public void run()
	{
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
		     e.printStackTrace();
			}
		}
	}
}
public static class Mainclass4 {
public static void main(String[] args) {
	Sample2 s1 = new Sample2();
	Thread th1=new Thread(s1);
	th1.start();
	Demo2 d2=new Demo2();
	Thread th2=new Thread(d2);
	th2.start();
}
}
}
