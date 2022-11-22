package practice_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Data_From_Excel_File {

	public static void main(String[] args) throws Throwable {
		
	//step1 :get java representation object of physical file
	FileInputStream fis = new FileInputStream("./src/test/resources/excel.xlsx");
		
	//step2: create object for workbook
	Workbook book = WorkbookFactory.create(fis);
	
	//String d = book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	Sheet sh = book.getSheet("Sheet1");
	String d = sh.getRow(1).getCell(0).getStringCellValue();;
	System.out.println(d);
	}
}
