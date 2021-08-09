package pack.a;
java.io.File;
import java.io.FileWriter;
import java,io.IOException;
public class File
{
	public static void main(String[] args)
	{
		//file resd write
		try
		{
			File f =new File("myFile.txt");
			FileWriter fw=new FileWriter(f);
			fw.write("hello thanks for attending session");
			fw.close();
		}
	catch(IOException io)
		{
		}
		}
}
		
		

