package Encaps_program;
class Snapchat
{
	private String pass="hello";
	public String getOtp()
	{
		return pass;
	}
	public void setPass(String pass)
	{
		this.pass=pass;
}
}
public class Mainclass5 {
public static void main(String[] args) {
	Snapchat s1=new Snapchat();
	System.out.println(s1.getOtp());
	s1.setPass("Snap@123");
	System.out.println(s1.getOtp());
}
}
