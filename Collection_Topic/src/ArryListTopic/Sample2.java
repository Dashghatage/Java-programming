package ArryListTopic;

import java.util.ArrayList;

public class Sample2 {
	void add(Object obj)
	{
		
	}
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add(20.56);
	l1.add(10);
	l1.add('A');
	l1.add("Hello");
	System.out.println(l1.toString());
	l1.add(2,'A');
	System.out.println(l1);
}
}
