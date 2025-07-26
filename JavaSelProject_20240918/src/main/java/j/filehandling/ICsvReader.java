package j.filehandling;

import java.io.IOException;

import static u.myutilities.AllUtils.readCsvToArray;

public class ICsvReader 
{

	public static void main(String[] args) throws IOException 
	{
		
		String[][] fileData = readCsvToArray("files/players.csv");

        for (String[] row : fileData) 
        {
            for (String cell : row) 
            {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
		
	}
}
