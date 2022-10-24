package EqualsMethod;
class Tv
{
	int tv_cost;
	String tv_brand;
	String tv_type;
	public Tv(int tv_cost, String tv_brand, String tv_type) {
		super();
		this.tv_cost = tv_cost;
		this.tv_brand = tv_brand;
		this.tv_type = tv_type;
	}
	@Override
	public boolean equals(Object obj)
	{
		Tv t2=(Tv)obj;
		return this.tv_type==t2.tv_type;
	}
}
public class Mainclass4 {
public static void main(String[] args) {
	Tv t1=new Tv(30000, "ONIDA", "LCD");
	Tv t2=new Tv(25000, "LG", "HD");
	if(t1.equals(t2))
	{
		System.out.println("TV Display  type is same");
	}else{
		System.out.println("TV Display type is not same");
	}
	
}
}
