package nov3;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintCell_method2 {

	public static void main(String[] args) throws Throwable {
		// Write a script to print cell data using alternate method
		FileInputStream fi = new FileInputStream("D:/readsheet.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Testng");
		int rc = ws.getLastRowNum();
		System.out.println("No of rows   "+ rc);
		String fname = ws.getRow(1).getCell(0).getStringCellValue();
		String lname = ws.getRow(3).getCell(1).getStringCellValue();
		int result = (int) ws.getRow(4).getCell(2).getNumericCellValue();
		System.out.println(fname+ "  "+ lname+"   "+ result);
		fi.close();
		wb.close();
		
		
	}

}
