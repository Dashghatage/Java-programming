package FileHandlingPrg;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Sampl4 {
public static void main(String[] args) throws IOException {
	File f1=new File("C:\\Users\\Dash\\Desktop\\Dinga.txt");
	FileReader fr=new FileReader(f1);
	char[]arr=new char[(int) f1.length()];
	fr.read(arr);
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	
}
}
