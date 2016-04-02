package week4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(new File("./Excel/FirstFile.xlsx"));
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheetAt(0); // Sheet1 will be focused 
		System.out.println(sheet.getSheetName());
		
		int rowcount=sheet.getLastRowNum(); //Fetching the row count
		System.out.println("Number of rows:" +rowcount);
		
		for (int i = 0; i <= rowcount; i++) {
			int cellcount=sheet.getRow(i).getLastCellNum(); // Fetching the column count for a particular row
			for(int c=0;c<cellcount;c++){
				System.out.println(sheet.getRow(i).getCell(c).getStringCellValue()); // Printing the cell value
			}
		}
	}
}
