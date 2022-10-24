package ArryListTopic;

import java.util.ArrayList;

public class Sample5 {
	void remove()
	{
		
	}
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add("Banglore");
	l1.add("null");
	l1.add(true);
	l1.add(5);
	l1.add('A');
	System.out.println("b4--->"+l1);
	l1.remove(0);
	System.out.println("a4--->"+l1);
}
}
