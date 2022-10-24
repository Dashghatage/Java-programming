package interface_programm;
abstract interface Demo1
{
	public abstract void test();
	public abstract void cool();
}
abstract class Sample1 implements Demo1
{
	public void cool()
	{
		System.out.println("hey i am cool");
	}	
}
class Tester1 extends Sample1
{
	public void test()
	{
		System.out.println("Hello");
	}
	public static void main(String[]args)
	{
		Tester1 t1=new Tester1();
		t1.cool();
		t1.test();
	}
}
