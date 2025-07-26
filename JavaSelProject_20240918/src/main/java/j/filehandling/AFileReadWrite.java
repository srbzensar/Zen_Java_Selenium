package j.filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AFileReadWrite {

	public static void writeToFile()
	{
		FileWriter fw = null;
		String filePath = "files/file1.txt";
		
		try
		{
			fw = new FileWriter(filePath,true); // true: append mode
			fw.write("Hello, how are you?");
			System.out.println("file writing completed");
		//	fw.close();
		}
		catch(IOException e)
		{
			System.out.println("Please check for the file path and name " + filePath); 
		}
		finally
		{
			try
			{
				fw.close();
			}
			catch(Exception e)
			{
				System.out.println("cannot close file, as it was not opened successfully");
			}
		}
		
	}
	
	public static void readFromFile() throws IOException  
	{
		FileReader fr = null;
		String filePath = "files/file2.txt";
		
		fr = new FileReader(filePath);
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}
	
	
	public static void main(String[] args) {

		writeToFile();
		
		try 
		{
			readFromFile();
		} catch (IOException e) 
		{
//			e.printStackTrace();
			System.out.println("Please check for the file path and name ");
		}
		
	}

}
