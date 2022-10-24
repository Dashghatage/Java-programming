package StringMethod;
class School
{
	String school_name;
	String school_grade;
	int school_strength;
	public School(String school_name,String school_grade,int school_strength) {
		this.school_name=school_name;
		this.school_grade = school_grade;
		this.school_strength=school_strength;
	}
	@Override
	public String toString()
	{
		return "school name is "+school_name+"\n school garde "+school_grade+"\n school strength is "+school_strength;
	}
}
public class Mainclass2 {
public static void main(String[] args) {
	School s1=new School("Maharstra highschool Kolhapur", "A+", 20000);
	System.out.println(s1);
}
}
