package BubbleSort;

public class Bubble {
public static void main(String[] args) {
	int[]arr={5,4,7,1,3,6};
	for(int i=0; i<arr.length-1;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i]>arr(j+i))
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		for(int i1=0;i1<arr.length;i1++)
		{
		   System.out.println(arr[i1]);
		}
				
}
}

private static int arr(int i) {
	// TODO Auto-generated method stub
	return 0;
}


}

