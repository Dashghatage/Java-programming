package Abstraction_programe;
interface Hospital
{
	public void treat();
}
class Cardiology implements Hospital
{
	public void treat()
	{
		System.out.println("treat on Heart");
	}
}
class Orthopedic implements Hospital
{
	public void treat()
	{
		System.out.println("treat on bones");
	}
}
class Neurology implements Hospital
{
	public void treat()
	{
		System.out.println("treat on Brain");
	}
}
class Patients
{
	static void disease(Hospital h1)
	{
		h1.treat();
	}
}
public class Mainclass5 {
	public static void main(String[] args) {
		Cardiology c1=new Cardiology();
		Orthopedic o1=new Orthopedic();
		Neurology n1=new Neurology();
		Patients.disease(c1);
		Patients.disease(o1);
		Patients.disease(n1);
		
	}

}