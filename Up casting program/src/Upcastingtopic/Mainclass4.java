package Upcastingtopic;
class Cool
{
	void add()
	{
		int a=10;
		int b=20;
		int x=a+b;
		System.out.println(x);
	}
}
class Goolata extends Cool
{
	void dispu()
	{
		System.out.println("hey dispuu........");
	}
}
public class Mainclass4 {
	public static void main(String[] args) {
		Cool c1=new Goolata();
		c1.add();
		Goolata g1=(Goolata)c1;
	    g1.add();
	    g1.dispu();
	}

}
