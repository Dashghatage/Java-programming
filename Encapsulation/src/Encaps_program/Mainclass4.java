package Encaps_program;
class Mobile
{
	private int pattern=12658;
	public int getPin()
	{
		return pattern;
	}
	public void setpin(int pattern)
	{
		this.pattern=pattern;
	}
}
public class Mainclass4 {
public static void main(String[] args) {
	Mobile m1=new Mobile();
System.out.println(m1.getPin());
	m1.setpin(143);
	System.out.println(m1.getPin());
}
}
