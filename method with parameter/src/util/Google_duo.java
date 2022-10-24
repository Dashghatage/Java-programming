package util;
class Google_duo
{
	static void call(String Call_group)
	{
		System.out.println("Search group "+Call_group);
	}
	void call(int mob_num, String name)
	{
		System.out.println("search mobile number and "+mob_num+"search name "+name);
	}
	void call(String call_type,double call_time)
	{
		System.out.println("search call type and "+call_type +" set call timing "+ call_time);
	}
	public static void main(String[] args) {
		Google_duo g1=new Google_duo();
		Google_duo.call("School Friends");
		g1.call(3443, "Dash ghatage");
		g1.call("Audio & Video", 10.25);
		
	}
	
	
	

}
