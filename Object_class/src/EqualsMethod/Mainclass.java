package EqualsMethod;
class Employee
{
  int empid;
  String empname;
  double empsal;
public Employee(int empid, String empname, double empsal) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.empsal = empsal;
}
@Override
public  boolean equals(Object obj)
{
	Employee e2=(Employee)obj;	 
	return this.empsal==e2.empsal;
}
}
public class Mainclass
{
	public static void main(String[] args) {
		Employee e1=new Employee(123, "Dinga", 50000.00);
		Employee e2=new Employee(126, "Dingi", 50000.00);
	
	if(e1.equals(e2))
	{
		System.out.println("Salery is smae");
	}else{
		System.out.println("Salery is not same");
	}
}

}