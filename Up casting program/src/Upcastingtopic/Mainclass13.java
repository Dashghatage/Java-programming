package Upcastingtopic;
class Sample21
{
	void co()
	{
		System.out.println("Coooo");
	}
}
class Hahoha extends Sample21
{
	void disp()
	{
		System.out.println("Disp..");
	}
}
public class Mainclass13 {
public static void main(String[] args) {
	Sample21 s2=new Hahoha();
	s2.co();
	Hahoha h1=(Hahoha)s2;
	h1.disp();
	h1.co();
}

}
