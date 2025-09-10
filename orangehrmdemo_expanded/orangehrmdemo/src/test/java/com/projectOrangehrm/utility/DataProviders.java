package com.projectOrangehrm.utility;

import org.testng.annotations.DataProvider;

import com.projectOrangehrm.BaseClass.BaseClass;



public class DataProviders extends BaseClass{
    NewExcelLibrary obj = new NewExcelLibrary("./TestData/TestDataFile.xlsx");


	@DataProvider(name = "AdminData")
	public Object[][] getSupportAdminLogin() {
		// Totals rows count
		int rows = obj.getRowCount("users");
		// Total Columns
		int column = obj.getColumnCount("users");
		int actRows = rows - 1;

		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("users", j, i + 2);
			}
		}

		return data;
	}
		
	}

	


