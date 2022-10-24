package EqualsMethod;
class laptop
{
	String laptop_color;
	double laptop_cost;
	String laptop_brand;
	public laptop(String laptop_color, double laptop_cost, String laptop_brand) {
		super();
		this.laptop_color = laptop_color;
		this.laptop_cost = laptop_cost;
		this.laptop_brand = laptop_brand;
	}
	@Override
	public boolean equals(Object obj)
	{
		laptop l2=(laptop)obj;
		return this.laptop_cost==l2.laptop_cost;
	}
}
public class Mainclass2 {
public static void main(String[] args) {
	laptop l1=new laptop("Silver", 55000.00, "Dell");
	laptop l2=new laptop("Gold", 55000.00, "hp");
	if(l1.equals(l2))
	{
		System.out.println("laptop cost is same");
	}else{
		System.out.println("laptop cost is not same");
	}
}
}
