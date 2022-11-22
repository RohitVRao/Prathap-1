package practice_package;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_Data_To_Excel_File {

	public static void main(String[] args) throws Throwable {
		
		//step1 :get java representation object of physical file
		FileInputStream fis = new FileInputStream("./src/test/resources/excel.xlsx");
			
		//step2: create object for workbook
		Workbook book = WorkbookFactory.create(fis);
		
		//book.getSheet("Sheet2").createRow(0).createCell(0).setCellValue("prathap");
		Sheet sh = book.getSheet("Sheet2");
		sh.createRow(0).createCell(0).setCellValue("prathap");
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/excel.xlsx");
		book.write(fos);
		
		}
}
