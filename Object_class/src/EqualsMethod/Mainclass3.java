package EqualsMethod;
class School
{
	String schoo_name;
	char school_grade;
	int school_strength;
	public School(String school_name, char school_grade, int school_strength) {
		super();
		this.schoo_name= school_name;
		this.school_grade = school_grade;
		this.school_strength = school_strength;
	}
	@Override
	public boolean equals(Object obj)
	{
		School s2=(School)obj;
		return this.school_grade==s2.school_grade;		
	}
}
public class Mainclass3 {
	public static void main(String[] args) {
		School s1=new School("ABC", 'A', 2000);
		School s2=new School("xyz", 'B', 2000);
		if(s1.equals(s2))
		{
			System.out.println("School Grade is same");
		}else{
			System.out.println("School Grade is not same");
		}
	}
}