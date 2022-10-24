package Encaps_program;
class Netflix
{
	private String pass="123@pass";
	public String getMovies()
	{
		return pass;
		
	}
	public void setPlan(String pass)
	{
		this.pass=pass;
	}
}
public class Mainclass3 {
public static void main(String[] args) {
	Netflix n1=new Netflix();
	System.out.println(n1.getMovies());
	n1.setPlan("Pass@123");
	System.out.println(n1.getMovies());
}
}
