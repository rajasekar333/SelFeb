package week4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(new File("./data/Inputdata.xlsx"));
		
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		
		XSSFSheet sheet =wb.getSheetAt(0);
		
		System.out.println(sheet.getSheetName());
		
		int rowCount = sheet.getLastRowNum();
		
		System.out.println(rowCount);
		XSSFRow headerrow = sheet.getRow(0);
		System.out.println(headerrow.getCell(0).getStringCellValue());
		System.out.println(headerrow.getCell(1).getStringCellValue());
		for (int r = 1; r <= rowCount; r++) {
			XSSFRow currentrow = sheet.getRow(r);
			for (int i = 0; i < currentrow.getLastCellNum(); i++) {
				XSSFCell currentcell = currentrow.getCell(i);
				System.out.println(currentcell.getStringCellValue());
			} 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
