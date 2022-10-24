package compiletime_polypmorphism_programm;
class Whatsapp
{
	void send(int no)
	{
		System.out.println("sending no");
	}
	void send(String textmsg)
	{
		System.out.println("sending txtmsg");
	}
	void send(int no,String txtmsg)
	{
		System.out.println("sending no & txtmsg");
	}
	void send(String txtmsg,int no)
	{
		System.out.println("sending txtmsg & no");
	}
}
public class Mainclass {
	public static void main(String[] args) {
		Whatsapp w1=new Whatsapp();
		w1.send(123);
		w1.send("hi");
		w1.send(123,"hi");
		w1.send("hello", 1213);
	}

}
