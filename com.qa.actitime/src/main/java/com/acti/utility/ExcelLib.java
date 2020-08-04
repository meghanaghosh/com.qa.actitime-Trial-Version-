 package com.acti.utility;  //VIDEO 37

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib {
	
	XSSFWorkbook excel;
	
	public ExcelLib(String xlPath) throws Exception 
	{
		
		File file = new File(xlPath);
		FileInputStream fis = new FileInputStream(file);
		excel = new XSSFWorkbook(fis);
		
		//dont hard code path so pass it as parameter as xlPath
		//File file = new File("/Users/meghanaghosh/Documents/workspace/SeleniumAutomation/TestData/TestData1.xlsx");
		// then select the following 3 lines and right click surround with, try catch
		
		/*
		try {
			File file = new File("xlPath");
			FileInputStream fis = new FileInputStream(file);
			//XSSFWorkbook excel = new XSSFWorkbook(fis);// make XSSFWorkbook as global variable
			excel = new XSSFWorkbook(fis);
		} 
		catch (Exception e) {
			System.out.println("No Excel Sheet found at this path "+e.getMessage());
		} */
	}
		
		
	public int getRowCount(int sheetNum)
	{
		int count = excel.getSheetAt(sheetNum).getLastRowNum()+1;
		return count;
	}
	
	
	public String getCellData(int sheetNum, int row, int col)
	{
		String data = excel.getSheetAt(sheetNum).getRow(row).getCell(col).toString();
		return data;
	}

}
