package Sample;

public class Demo_v1 {
	void sell()
	{
		@SuppressWarnings("unused")
		int x=10;
	}
}
class Demo_v2 extends Demo_v1
{
  void Cool()
  {
   System.out.println("hey i cool ");
  }
}
class Tester_1 extends Demo_v2
{
	int z=20;
}
class Mainclass
{
	public static void main(String[]args)
	{
	  Tester_1 t1=new Tester_1();
	   t1.Cool();
	   System.out.println('z');
	}
	
}
