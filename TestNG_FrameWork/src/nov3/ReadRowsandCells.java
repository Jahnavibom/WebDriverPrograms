package nov3;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadRowsandCells {

	public static void main(String[] args) throws Throwable {
		// Write a program to read excel sheet and count no of rows in excel sheet and cells in each column
		//Read path of input stream excel file
		FileInputStream fi = new FileInputStream("D:/readsheet.xlsx");
		//get work book
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws = wb.getSheet("Testng");
		//to get first row from sheet
		XSSFRow rr = ws.getRow(0);
		//to count no of rows in sheet
		int x = ws.getLastRowNum();
		System.out.println("No of rows   "+ x);
	
		int cc = rr.getLastCellNum();
		System.out.println("No of cells   "+ cc);
		fi.close();
		wb.close();
		
		
		
		
		
		
		

	}

}
