package Assign_polymorphism;
class Farmer
{
	void grow()
	{
		System.out.println("some Grow");
	}
}
class Ragi extends Farmer
{
	void grow()
	{
		System.out.println("Ragi in India");
	}
}
class Corn extends Farmer
{
	void grow()
	{
		System.out.println("Corn in South India");
	}
}
class Rice extends Farmer
{
	void grow()
	{
		System.out.println("Rice in North india");
	}
}
class Rain
{
	static void rainfall(Farmer f1)
	{
		f1.grow();
	}
}
public class Mainclass1 {
	public static void main(String[] args) {
		Ragi r1=new Ragi();
		Corn c1=new Corn();
		Rice r2=new Rice();
		Rain.rainfall(r1);
		Rain.rainfall(c1);
		Rain.rainfall(r2);
	}

}
