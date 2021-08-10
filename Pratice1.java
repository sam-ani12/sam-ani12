package exception1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Pratice1 {
public static void main(String[] args) throws IOException{
	File f=new File("myFile.txt");
	try(FileWriter fw=new FileWriter(f);)
	{
		fw.write("bye");
	}
	System.out.println("--------------");
	try {
		int a=10;
		int b=0;
		int c=a/b;
	}
	
	catch(Exception e) {
		System.out.println("cannot divide by zero");
	}finally {
		System.out.println("used for closing and releasing object");
	}
}
}
	
	


