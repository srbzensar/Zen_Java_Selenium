package filehandling;

import static u.myutilities.AllUtils.readExcelToArray;

import java.io.IOException;

public class ExcelReaderEx 
{

	public static void main(String[] args) throws IOException 
	{
		
		String[][] excelData = readExcelToArray("files/info.xlsx", "users");

        for (String[] row : excelData) 
        {
            for (String cell : row) 
            {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
		
	}
}
