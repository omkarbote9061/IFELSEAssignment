package ifelseassignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DATAdrivenTESTING {

	public static XSSFWorkbook workbook;
	
	public static void main(String[] args) throws IOException {

		FileInputStream	fis = new FileInputStream("D:\\workspace\\ifelseassignment\\src\\ifelseassignment\\ddt.xlsx");
		
		
		workbook=new XSSFWorkbook(fis);
	
      XSSFSheet sheet=workbook.getSheet("Sheet1");
      Iterator<Row> row=sheet.iterator();
	while(row.hasNext()) {
	        System.out.println(row.next());
	}
		
		
		
	}

}
