package practice_package;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_MultipleData_From_Excel_File {

	public static void main(String[] args) throws Throwable {
		
		//step1 :get java representation object of physical file
		FileInputStream fis = new FileInputStream("./src/test/resources/excel.xlsx");
			
		//step2: create object for workbook
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		int last_row = sh.getLastRowNum();
		int last_col =sh.getRow(1).getLastCellNum();
		
		for (int i = 0; i<=last_row; i++) {
			for (int j = 0; j<=last_col; j++) {
				String d = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.println(d);
			}
		}
		
		}
}
