package nov3;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AddingNewCell {

	public static void main(String[] args) throws Throwable {
		//Write a script to read all rows celldata and write as pass into newly created report cell
		FileInputStream fi = new FileInputStream("D:/readsheet.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Testng");
		int rc = ws.getLastRowNum();
		System.out.println("No of rows" + rc);
		for(int i=1;i<=rc;i++)
		{
			String fname = ws.getRow(i).getCell(0).getStringCellValue();
			String lname = ws.getRow(i).getCell(1).getStringCellValue();
			int result = (int) ws.getRow(i).getCell(2).getNumericCellValue();
			System.out.println(fname +"   "+ lname + "   "+ result);
			//Write text in to Report cell
			ws.getRow(i).createCell(3).setCellValue("Pass");
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("D:/output.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
		
		

	}

}
