package FileHandlingPrg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("C:\\Users\\Dash\\Desktop\\Dinga.txt");
	fw.write("chukubuku");
	fw.write("railuu");
	fw.flush();
	System.out.println("Data is Written");
	
}
}
