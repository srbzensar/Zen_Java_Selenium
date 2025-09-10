package com.projectOrangehrm.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.projectOrangehrm.BaseClass.BaseClass;

import java.io.File;

public class NewExcelLibrary extends BaseClass{

	//public static String path = null;
	public static String path ="./TestData/TestDataFile.xlsx";

	// public String path;
	public static FileInputStream file = null;

	public static XSSFWorkbook workbook = null;
	public static XSSFSheet sheet = null;
	public static XSSFRow row = null;
	public static XSSFCell cell = null;

//	public NewExcelLibrary(String path) {
//
//		this.path = path;
//		try {
//			 file=new FileInputStream(new File(path));
//			
//			 workbook =new XSSFWorkbook(file);
//			
//			 sheet = workbook.getSheet("users");
//			 file.close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	public NewExcelLibrary(String path) {

		this.path = path;
		try {
			file = new FileInputStream(new File(path));
			workbook = new XSSFWorkbook(file);
			sheet = workbook.getSheetAt(0);
			file.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getRowCount(String sheetName) {
		int index = workbook.getSheetIndex(sheetName);
		if (index == -1)
			return 0;
		else {
			sheet = workbook.getSheetAt(index);
			int number = sheet.getLastRowNum() + 1;
			return number;
		}

	}


	// returns the data from a cell
	public String getCellData(String sheetName,int colNum,int rowNum){
		try{
			if(rowNum <=0)
				return "";
		
		int index = workbook.getSheetIndex(sheetName);

		if(index==-1)
			return "";
		
	
		sheet = workbook.getSheetAt(index);
		row = sheet.getRow(rowNum-1);
		if(row==null)
			return "";
		cell = row.getCell(colNum);
		if(cell==null)
			return "";
		
	  if(cell.getCellType().name().equals("STRING"))
		  return cell.getStringCellValue();
	  else if(cell.getCellType().name().equals("NUMERIC") || cell.getCellType().name().equals("FORMULA") ){
		  
		  String cellText  = String.valueOf(cell.getNumericCellValue());
		
		  
		  
		  return cellText;
	  }else if(cell.getCellType().name().equals("BLANK"))
	      return "";
	  else 
		  return String.valueOf(cell.getBooleanCellValue());
		}
		catch(Exception e){
			
			e.printStackTrace();
			return "row "+rowNum+" or column "+colNum +" does not exist  in xls";
		}
	}

	public boolean isSheetExist(String sheetName) {
		int index = workbook.getSheetIndex(sheetName);
		if (index == -1) {
			index = workbook.getSheetIndex(sheetName.toUpperCase());
			if (index == -1)
				return false;
			else
				return true;
		} else
			return true;
	}

	// returns number of columns in a sheet
	public int getColumnCount(String sheetName) {
		// check if sheet exists
		if (!isSheetExist(sheetName))
			return -1;

		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(0);

		if (row == null)
			return -1;

		return row.getLastCellNum();

	}
	
	@DataProvider(name = "AdminData")
	public Object[][] getSupportAdminLogin() {
		// Totals rows count
		int rows = getRowCount("users");
		// Total Columns
		int column = getColumnCount("users");
		int actRows = rows - 1;

		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = getCellData("users", j, i + 2);
			}
		}

		return data;
	}
}