package StringMethod;
class Course 
{
	String course_name;
	String univr_name;
	double exam_cost;
	public Course(String course_name, String univr_name, double exam_cost) {
		super();
		this.course_name = course_name;
		this.univr_name = univr_name;
		this.exam_cost = exam_cost;
	}
	@Override
	public String toString()
	{
		return "course name is "+course_name+"\n University name "+univr_name+"\n Exam cost is "+exam_cost;
	}
}
public class Mainclass5 {
public static void main(String[] args) {
	Course c1=new Course("Fullstack java Developer", "Jspider", 330000.55);
	System.out.println(c1);
}
}
