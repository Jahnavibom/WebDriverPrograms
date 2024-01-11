package nov5;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormatCells {

	public static void main(String[] args) throws Throwable {
		// Write a script to formate cell using bold and color options
		FileInputStream fi = new FileInputStream("D:/readsheet.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Testng");
		int rc = ws.getLastRowNum();
		System.out.println(rc);
		for(int i=1;i<=rc;i++)
		{
			//ws.getRow(i).createCell(3).setCellValue("Pass");
			//ws.getRow(i).createCell(3).setCellValue("False");
			ws.getRow(i).createCell(3).setCellValue("Blocked");
			XSSFCellStyle style = wb.createCellStyle();
			XSSFFont font = wb.createFont();
			//colour text with green
			//font.setColor(IndexedColors.GREEN.getIndex());
			//font.setColor(IndexedColors.RED.getIndex());
			font.setColor(IndexedColors.BLUE.getIndex());
			font.setBold(true);
			style.setFont(font);
			ws.getRow(i).getCell(3).setCellStyle(style);
				
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("D:/output.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
			

	}

}
