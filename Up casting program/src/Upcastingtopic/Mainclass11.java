package Upcastingtopic;
class Cool4
{
	void add()
	{
		int a=5;
		int b=6;
		int c=a+b;
		System.out.println(c);
	}
}
class Gootata extends Cool4
{
	int r=3;
	void dispu()
	{
		System.out.println("dispu....");
	}
}
public class Mainclass11 {
	public static void main(String[] args) {
		Cool4 c4=new Gootata();
		c4.add();
		Gootata g1=(Gootata)c4;
		g1.dispu();
		System.out.println(g1.r);
		g1.add();
	}

}
