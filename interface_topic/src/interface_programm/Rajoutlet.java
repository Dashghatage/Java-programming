package interface_programm;
abstract interface Puma
{
	public void shoes();
}
interface Nike extends Puma
{
	public abstract void bags();
}
public class Rajoutlet {
	public void shoes()
	{
		System.out.println("jinglila shoes");
	}
	public void bags()
	{
		System.out.println("jinglila bags");
	}
	public static void main(String[] args) {
		Rajoutlet r1=new Rajoutlet();
				r1.bags();
		        r1.shoes();	
	}
}
