package nov3;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintRowCellData {

	public static void main(String[] args) throws Throwable {
	FileInputStream fi = new FileInputStream("D:/readsheet.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fi);
	XSSFSheet ws = wb.getSheet("Testng");
	XSSFRow row = ws.getRow(5);
	int rc = ws.getLastRowNum();
	System.out.println("No of rows:    "+rc);
	XSSFCell c1 = row.getCell(0);
	XSSFCell c2 = row.getCell(1);
	XSSFCell c3 = row.getCell(2);
	String fname = c1.getStringCellValue();
	String lname = c2.getStringCellValue();
	int result = (int) c3.getNumericCellValue();
	System.out.println(fname+ "  "+ lname+"    "+ result);
	fi.close();
	wb.close();

	}

}
