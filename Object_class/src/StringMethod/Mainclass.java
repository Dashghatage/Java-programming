package StringMethod;
class Mobile
{
	double mobile_cost;
	String mobile_model_name;
	String mobile_color;
	 Mobile(Double a,String b,String c)
	 {
		 mobile_cost=a;
		 mobile_model_name=b;
		 mobile_color=c;
	 }
	 @Override
	 public String toString()
	 {
		return "mobile cost is "+mobile_cost+"\n model is "+mobile_model_name+"\n mobile color is"+mobile_color;
}    }
public class Mainclass {
public static void main(String[] args) {
	Mobile m1=new Mobile(20000.50, "SONY", "GOLD");
	System.out.println(m1);
}
}
