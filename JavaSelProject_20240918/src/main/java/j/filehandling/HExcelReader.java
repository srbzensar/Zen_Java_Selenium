package j.filehandling;

import static u.myutilities.AllUtils.readExcelToArray;

import java.io.IOException;

public class HExcelReader 
{

	public static void main(String[] args) throws IOException 
	{
		
		String[][] fileData = readExcelToArray("files/info.xlsx", "users");

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
