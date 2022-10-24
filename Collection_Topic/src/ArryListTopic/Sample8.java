package ArryListTopic;

import java.util.ArrayList;

public class Sample8 {
	void size()
	{
		
	}
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add("Banglore");
	l1.add(null);
	l1.add(true);
	l1.add(5);
	l1.add('A');
	System.out.println(l1.size());
	
	for(int i=0;i<l1.size();i++)
	{
		Object obj=l1.get(i);
	}	System.out.println(l1);			
}
}
