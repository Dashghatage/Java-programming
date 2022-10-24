package StringMethod;
class Car
{
	int car_cost;
	String car_model_name;
	String car_type;
	public Car(int car_cost, String car_model_name, String car_type) {
		super();
		this.car_cost = car_cost;
		this.car_model_name = car_model_name;
		this.car_type = car_type;
	}
	@Override
	public String toString()
	{
		return "car cost is "+car_cost +"\n car model "+car_model_name+"\n car type "+car_type;
	}
	
	
}
public class Mainclass1 {
public static void main(String[] args) {
Car c1=new Car(2500000, "BMW", "petrol");
System.out.println(c1);
}
}
