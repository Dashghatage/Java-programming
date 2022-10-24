package Switch_Case;

public class Sample {
	static void add()
	{
		System.out.println("its Addittion");
	}
	static void mul()
	{
		System.out.println("its multiplication");
	}
	static void sub()
	{
		System.out.println("its substraction");
	}
	public static void main(String[] args) {
		int input=1;
		switch (input) {
		case 1:add();
		       break;
		case 2:mul();
		       break;
		case 3:sub();
		       break;
		default:System.out.println("invalid input");
		                    break;
		}
	}
}
