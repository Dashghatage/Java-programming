package FileHandlingPrg;

import java.io.File;
import java.io.IOException;

public class CreateFile {
public static void main(String[] args) throws IOException {
	File f1=new File("C:\\Users\\Dash\\Desktop\\Dash1.doc");
	if (f1.createNewFile()) {
		System.out.println("File created...");
	} else {
     System.out.println("File not Creted...");
	}
}
}
