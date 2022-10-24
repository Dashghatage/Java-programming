package Array;

public class TwodArray {
public static void main(String[] args) {
	TwodimenstionArray tda=new TwodimenstionArray(3,3);
	tda.arrayInsertion(0,0,1);
	tda.arrayInsertion(0,1,2);
	tda.arrayInsertion(0,2,3);
	tda.arrayInsertion(1,0,4);
	tda.arrayInsertion(1,1,5);
	tda.arrayInsertion(1,2,6);
	tda.arrayInsertion(2,0,7);
	tda.arrayInsertion(2,1,8);
	tda.arrayInsertion(2,2,9);
	
	tda.arrayInsertion(0,2,30);  //Reintialization
	tda.arrayInsertion(3,3,333);  //out of range
	tda.searcharray(7); //Searching array elements
	tda.deletingArray(1,1);
	tda.deletingArray(0,2);
	tda.deletingArray(3,3);
}
}
class TwodimenstionArray{
	int[][] array=null;
	
	//2D array creation
	public TwodimenstionArray(int row,int col){
		array=new int[row][col];
		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array.length; c++) {
				array [r][c]=Integer.MIN_VALUE;
			}
		}
	}
	
	// 2D array Insertion
	public void arrayInsertion(int row,int col,int values){
		try{
			if(array[row][col]==Integer.MIN_VALUE){
				array[row][col]=values;
				System.out.println("The successfuly inserted="+array[row][col]);
			}else{
				System.out.println("The cell is Already fill");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid Range");
		}
	}
	
	// Searching 2D array elements
	public void searcharray(int searchingvalues){
		for (int r = 0; r < array.length; r++) {  //---------->0(m)
			for (int c = 0; c < array[r].length; c++) { //---------->0(n) time
				if(array[r][c]==searchingvalues){ //------------->0(1) space
					System.out.println("The value is in "+r+ " row "+c+ " col="+array[r]);
				}
			}	
		}
	}
	// Deleting 2D array
	public void deletingArray(int row,int col){
		try{
			System.out.println("The value "+array[row][col]+" is deleted");
			array[row][col]=Integer.MIN_VALUE; //--------------->o(1)
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid Range");
			
		}
	}
}
