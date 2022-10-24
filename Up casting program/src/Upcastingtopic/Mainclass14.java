package Upcastingtopic;
class Cola13
{
	int f=30;
	void dispu()
	{
		System.out.println("Dispuu..");
	}
}
class Chungacha1 extends Cola13
{	
	int d=15;
}
public class Mainclass14 {
	public static void main(String[] args) {
		Cola13 c3=new Chungacha1();
		c3.dispu();
		System.out.println(c3.f);
		Chungacha1 c1=(Chungacha1)c3;
		System.out.println(c1.d);
        System.out.println(c1.f);
        c1.dispu();
	}
}
