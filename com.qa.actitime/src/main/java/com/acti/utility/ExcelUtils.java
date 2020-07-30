package com.acti.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	

	XSSFWorkbook excel;
	
	public ExcelUtils(String xlPath)
	{
		try
		{
		File file = new File(xlPath);
		FileInputStream fis = new FileInputStream(file);
		excel = new XSSFWorkbook(fis);
		}
		catch (Exception e) 
		{
			System.out.println("Excel Sheet not found "+e.getMessage());
		}	
	
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
