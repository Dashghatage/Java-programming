package util;
abstract class Sample
{
	abstract void disp();
	abstract void cool();
}
class Demo extends Sample
{
	void disp()
	{
		System.out.println("Display......");
	}
	void cool()
	{
		System.out.println("Hey i am cool");
	}
}
class Mainclass1 {
	public static void main(String[]args) {
		Demo d1=new Demo();
		d1.cool();
		d1.disp();
	}

}
