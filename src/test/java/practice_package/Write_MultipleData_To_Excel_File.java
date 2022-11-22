package practice_package;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Write_MultipleData_To_Excel_File {

public static void main(String[] args) throws Throwable {
		
		//step1 :get java representation object of physical file
		FileInputStream fis = new FileInputStream("./src/test/resources/excel.xlsx");
			
		//step2: create object for workbook
		Workbook book = WorkbookFactory.create(fis);
		String[] s= {"prathap","pramod","naveen","shivamma","ramaiah"};
		FileOutputStream fos = new FileOutputStream("./src/test/resources/excel.xlsx");
		
		for (int i = 0; i < s.length; i++) {
			book.getSheet("Sheet2").createRow(1).createCell(0).setCellValue(s[i]);
			book.write(fos);
		}
		}
}
