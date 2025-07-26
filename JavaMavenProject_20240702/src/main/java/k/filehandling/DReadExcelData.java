package k.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DReadExcelData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(new File("files/info.xlsx"));
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("users");
		
//		iterate thru the rows one by one
		Iterator<Row> rowIterator = sheet.rowIterator();
		
		while(rowIterator.hasNext())
		{
			Row row = rowIterator.next();

//			iterate thru the cells one by one
			Iterator<Cell> cellIterator = row.cellIterator();
			while(cellIterator.hasNext())
			{
				Cell cell = cellIterator.next();
				
				switch(cell.getCellType())
				{
					case NUMERIC:
						System.out.print(cell.getNumericCellValue() + "\t");
						break;
					case STRING:
						System.out.print(cell.getStringCellValue() + "\t");
						break;
				}
			}
			System.out.println();
		}
		file.close(); // imp to close the file once the operation is done
		
	}

}
