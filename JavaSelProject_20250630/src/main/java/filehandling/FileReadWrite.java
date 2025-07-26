package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

	public static void writeToFile()
	{
		FileWriter fw = null;
		String filePath = "files/file1.txt";
		
		try 
		{
			fw = new FileWriter(filePath, true);
			fw.write("Hi, how are you doing?\n");
			System.out.println("file writing completed");
		} 
		catch (IOException e) 
		{
			System.out.println("please check for file path and name");
		}
		finally
		{
			try 
			{
				fw.close();
			} 
			catch (IOException e) {
				System.out.println("cannot close the file");
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
		
		try {
			readFromFile();
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("unable to read the file, please check the path and name");
		}
		
		
	}

}
