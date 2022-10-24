package FileHandlingPrg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writerad {
public static void main(String[] args) throws IOException {
	File f1=new File("C:\\Users\\Dash\\Desktop\\Dinga.txt");
	FileWriter fw=new FileWriter(f1);
	fw.write("hello");
	fw.write("hooo");
	System.out.println("Data is written...");
}
}
