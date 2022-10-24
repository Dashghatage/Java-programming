package Abstraction_programe;
interface Farmer
{
	public void grow();

}
class Ragi implements Farmer
{
	public void grow()
	{
		System.out.println("Ragi in india");
	}
}
class Corn implements Farmer
{
	public void grow()
	{
		System.out.println("Corn Famous in Maharstara");
	}
}
class Rice implements Farmer
{
	public void grow()
	{
		System.out.println("Rice in Karnataka");
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
