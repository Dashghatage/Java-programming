package Upcastingtopic;
class Tester1
{
	int x=10;
	void disp()
	{
		System.out.println("disp..");
	}
}
class Hullyacha extends Tester1
{
	void ho()
	{
		System.out.println("HOhooooo");
	}
}
public class Mainclass8 {
public static void main(String[] args) {
	Tester1 t1=new Hullyacha();
	System.out.println(t1.x);
	t1.disp();
	Hullyacha h1=(Hullyacha)t1;
	h1.ho();
	h1.disp();
	System.out.println(h1.x);
}
}
