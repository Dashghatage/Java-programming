package interface_programm;
abstract interface Sample
{
	abstract void test();
	abstract void disp();
}
class Tester implements Sample
{
	public void test()
	{
		System.out.println("Hello");
	}
	public void disp()
	{
		System.out.println("Hi");
	}
}
public class Mainclass {
	public static void main(String[]args)
	{
		Tester t1=new Tester();
		t1.disp();		
		t1.test();
	}
}
