package u.myutilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class AllUtils 
{

	public static String[][] readCsvToArray(String filePath) 
	{
        List<String[]> rows = new ArrayList<>();

//        try-with-resources for automatic resource management
        try (CSVReader readCsv = new CSVReader(new FileReader(filePath))) 
        {
            String[] nextLine;
            while ((nextLine = readCsv.readNext()) != null) 
            {
                rows.add(nextLine);
            }

         // Convert List<String[]> to String[][]
            String[][] data = new String[rows.size()][];
            for (int i = 0; i < rows.size(); i++) 
            {
                data[i] = rows.get(i);
            }
            return data;

        } catch (IOException | CsvValidationException e) 
        {
            e.printStackTrace();
            return new String[0][0];
        }
    }

//	public static String[][] readCsvToArray(String filePath) {
//		
//        List<String[]> rows = new ArrayList<>();
//
//        try
//        {
//	        CSVReader readCsv = new CSVReader(new FileReader(filePath));
//	        String[] nextLine;
//	        
//	        while ((nextLine = readCsv.readNext()) != null) 
//	        {
//	          rows.add(nextLine);
//	        }
//	        readCsv.close();
//	        
//	        // Convert List<String[]> to String[][]
//	        String[][] data = new String[rows.size()][];
//	        for (int i = 0; i < rows.size(); i++) {
//	            data[i] = rows.get(i);
//	        }
//	        return data;
//        }
//        catch (IOException | CsvValidationException e) 
//		{
//			e.printStackTrace();
//			return new String[0][0]; // Return empty array on error
//        }
//    }

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
