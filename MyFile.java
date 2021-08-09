package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyFile {

	public static void main(String[] args) {
		try {
		File f=new File("myfile.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("hello");
          fw.close();
		}catch(IOException io) {
			
		}	
		}

}
