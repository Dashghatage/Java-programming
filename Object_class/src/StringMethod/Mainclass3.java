package StringMethod;
class Tv
{
	double tv_cost;
	String tv_brand;
	String tv_type;
	public Tv(double tv_cost, String tv_brand, String tv_type) {
		super();
		this.tv_cost = tv_cost;
		this.tv_brand = tv_brand;
		this.tv_type = tv_type;
	}

@Override
public String toString()
{
	return "Tv cost is "+tv_cost+"\n Tv brand "+tv_brand+"\n Tv type is "+tv_type;
}
}
public class Mainclass3 {
public static void main(String[] args) {
	Tv t1=new Tv(15000.45, "SAMSUNG","LCD" );
	System.out.println(t1);
	Tv t2=new Tv(5000.55, "Sharp", "normal Display");
	System.out.println(t2);
	
}
}
