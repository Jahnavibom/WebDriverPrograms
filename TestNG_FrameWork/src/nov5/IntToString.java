package nov5;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IntToString {

	public static void main(String[] args) throws Throwable {
		//Write a script to convert integer type cell to string type
		FileInputStream fi = new FileInputStream("D:/readsheet.xlsx");
		XSSFWorkbook va = new XSSFWorkbook(fi);
		XSSFSheet ws = va.getSheet("Testng");
		int rc = ws.getLastRowNum();
		System.out.println(rc);
		for( int i=1; i<=rc;i++)
		{
			if(va.getSheet("Testng").getRow(i).getCell(2).getCellType()==CellType.NUMERIC)
			{
				int celldata = (int) va.getSheet("Testng").getRow(i).getCell(2).getNumericCellValue();
				//convert int type to string type
				String rid = String.valueOf(celldata);
				System.out.println(rid);
			}
		}
		fi.close();
		va.close();
		
		

	}

}
