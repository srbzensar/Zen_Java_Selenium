package u.myutilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
Method to read contents of an excel file whose name with path is passed as an argument 
and return a 2d String array  
*/


public class AllUtils 
{

	public static String[][] readExcelToArray(String filePath, String sheetName) 
	{
		FileInputStream fis;
		try
		{
			fis = new FileInputStream(filePath);		
			
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			
	        int rowCount = sheet.getPhysicalNumberOfRows();
	        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
	
	        String[][] data = new String[rowCount][colCount];
	
	        for (int i = 0; i < rowCount; i++) 
	        {
	            Row row = sheet.getRow(i);
	            for (int j = 0; j < colCount; j++) 
	            {
	                Cell cell = row.getCell(j);
	                data[i][j] = getCellValueAsString(cell);
	            }
	        }
	        return data;
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			return new String[0][0]; // Return empty array on error
		}
    }

    private static String getCellValueAsString(Cell cell) 
    {
        if (cell == null) return "";
        switch (cell.getCellType()) 
        {
            case STRING: return cell.getStringCellValue();
            case NUMERIC: return String.valueOf(cell.getNumericCellValue());
            case BOOLEAN: return String.valueOf(cell.getBooleanCellValue());
            case FORMULA: return cell.getCellFormula();
            case BLANK: return "";
            default: return "UNKNOWN";
        }
    }
}
