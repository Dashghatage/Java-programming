package Upcastingtopic;
class Demo
{
	int x=10;
}
class Pemocha extends Demo
{
	void ho()
	{
		System.out.println("hey ho.....");
	}
}
public class Mainclass1 {
	public static void main(String[] args) {
		Demo d1=new Pemocha();
		System.out.println(d1.x);
		Pemocha p1=(Pemocha)d1;
		p1.ho();
	}

}
