package Encaps_program;
class BookMyShow
{
	private int Account=123466;
	public int getTiket()
	{
		return Account;
		
	}
	public void setSeatno(int Account)
	{
		this.Account=Account;
	}
}
public class Mainclass2 {
public static void main(String[] args) {
BookMyShow b1=new BookMyShow();
	System.out.println(b1.getTiket());
	b1.setSeatno(25896);
	System.out.println(b1.getTiket());
    
}
}
