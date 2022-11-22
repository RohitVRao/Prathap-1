package com.LIMS.genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	/**
	 * This method is used to read data from excel
	 * 
	 * @author Prathap
	 * @param Sheetname
	 * @param RowNo
	 * @param ColNo
	 * @return
	 * @throws Throwable
	 */
	public String readDataFromExcelFile(String Sheetname, int RowNo, int ColumnNo) throws Throwable {
		FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(Sheetname);
		Row row = sh.getRow(RowNo);
		Cell cel = row.getCell(ColumnNo);
		String value = cel.getStringCellValue();
		return value;
	}

	/**
	 * This method is used to write data into excel
	 * 
	 * @author Prathap
	 * @param Sheetname
	 * @param RowNo
	 * @param ColumnNo
	 * @param data
	 * @throws Throwable
	 */
	public void writeDataIntoExcelFile(String Sheetname, int RowNo, int ColumnNo, String data) throws Throwable {
		FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(Sheetname);
		Row row = sh.getRow(RowNo);
		Cell cel = row.getCell(ColumnNo);
		cel.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(IPathConstants.ExcelPath);
		wb.write(fos);
	}

	/**
	 * This method is used to get last row count
	 * 
	 * @author Prathap
	 * @param Sheetname
	 * @return
	 * @throws Throwable
	 */
	public int getLastRowNo(String Sheetname, int RowNo) throws Throwable {
		FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(Sheetname);
		int rowCount = sh.getLastRowNum();
		return rowCount;
	}

	/**
	 * This method is used to get last col count
	 * 
	 * @author Prathap
	 * @param Sheetname
	 * @param RowNo
	 * @return
	 * @throws Throwable
	 */
	public int getLastColumnNo(String Sheetname, int RowNo, int ColumnNo) throws Throwable {
		FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(Sheetname);
		Row row = sh.getRow(RowNo);
		short columnCount = row.getLastCellNum();
		return columnCount;
	}
}
