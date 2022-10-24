package Encaps_program;
class Twitter
{
private String passWord="Dinga";

public String getPass()
{
	return passWord;
	
}
public void setPass(String passWord)
{
	this.passWord=passWord;
	
}
}
public class Mainclass1 {
public static void main(String[] args) {
	Twitter f1=new Twitter();
	System.out.println(f1.getPass());
	f1.setPass("Dingi");
	System.out.println(f1.getPass());		
}
}