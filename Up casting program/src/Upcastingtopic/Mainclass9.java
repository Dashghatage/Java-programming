package Upcastingtopic;
class Cool2
{
	void disp()
	{
		System.out.println("Displyyy..");
	}
}
class Dinga extends Cool2
{
	void tata()
	{
		System.out.println("Hi Tata");
	}
}
public class Mainclass9 {
public static void main(String[] args) {
	Cool2 c2=new Dinga();
	c2.disp();
	Dinga d1=(Dinga)c2;
	d1.tata();
	d1.disp();
	
	
}
}
