package com.SelExcel;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.commons.math3.analysis.function.Constant;
import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	private static XSSFSheet ExcelWSheet;
	 
	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;
	static String cellValue = null;
	
	public static String getCellData(int rowNum, int cellNum) throws Exception {
		 	
		
			try {

   			// Open the Excel file
				
			File file = new File("C:\\Users\\Plucky\\Desktop\\jars and files\\selenium\\Excel files\\Book1.xlsx");

			FileInputStream ExcelFile = new FileInputStream(file);

			// Access the required test data sheet

			ExcelWBook = new XSSFWorkbook(ExcelFile);

			ExcelWSheet = ExcelWBook.getSheet("test");
			Row = ExcelWSheet.getRow(rowNum);
			Cell = Row.getCell(cellNum);
			String cellValue = Cell.getStringCellValue();
			System.out.println("cellValue "+cellValue);

			} catch (Exception e){

				throw (e);

			}
			return cellValue;

	}

	/*//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

    public static String getCellData(int RowNum, int ColNum) throws Exception{

			try{

  			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

  			String CellData = Cell.getStringCellValue();

  			return CellData;

  			}catch (Exception e){

				return"";

  			}

    }*/

	//This method is to write in the Excel cell, Row num and Col num are the parameters

	public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

			try{

  			Row  = ExcelWSheet.getRow(RowNum);

			Cell = Row.getCell(ColNum);

			if (Cell == null) {

				Cell = Row.createCell(ColNum);

				Cell.setCellValue(Result);

				} else {

					Cell.setCellValue(Result);

				}

  // Constant variables Test Data path and Test Data file name

  				FileOutputStream fileOut = new FileOutputStream(SeleniumWrite.first + SeleniumWrite.second);

  				ExcelWBook.write(fileOut);

  				fileOut.flush();

					fileOut.close();

				}catch(Exception e){

					throw (e);

			}

		}

}


