package practiccc;

public class BubbleSort {
public static void main(String[] args) {
     int[]arr={5,4,7,1,3,6};
     for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length-1; j++) {
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
     for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]);
	}
}
}
   