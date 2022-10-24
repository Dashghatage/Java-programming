package EqualsMethod;
class Mobile
{
	int mobile_cost;
	String mobile_model;
	String mobile_color;
	public Mobile(int mobile_cost, String mobile_model, String mobile_color) {
		super();
		this.mobile_cost = mobile_cost;
		this.mobile_model = mobile_model;
		this.mobile_color = mobile_color;
	}
	@Override
	public boolean equals(Object obj)
	{
		Mobile m2=(Mobile)obj;
		return this.mobile_model==m2.mobile_model;
	}
}
public class Mainclass1 {
public static void main(String[] args) {
	@SuppressWarnings("unused")
	Mobile m1=new Mobile(20000, "SAMSUNG", "Gold");
	Mobile m2=new Mobile(15000, "SAMSUNG", "Black");

if(m2.equals(m2))
{
	System.out.println("Mobile model is same");
}else{
	System.out.println("Mobile model is not same");
}
}
}