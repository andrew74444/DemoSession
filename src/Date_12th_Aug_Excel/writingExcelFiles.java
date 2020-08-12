package Date_12th_Aug_Excel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingExcelFiles {

	public static void main(String[] args) throws Exception {
		

		XSSFWorkbook wb= new XSSFWorkbook();
		
		XSSFSheet st1= wb.createSheet("Sheet2");
		
//		Row r1 = st1.createRow(0);
//		
//		
//		Cell c1= r1.createCell(0);
//		Cell c2= r1.createCell(1);
//		
//		
//		c1.setCellValue("first Cell");
//		c2.setCellValue("second Cell");
		
		
		for (int rows=0;rows<10;rows++) {
			Row r=st1.createRow(rows);
			for(int cols=0;cols<10;cols++) {
				Cell cell = r.createCell(cols);
				cell.setCellValue((int)(Math.random()*100));
			}
		}
		
		
		
		File f = new File("Excel.xlsx");
		FileOutputStream fo = new FileOutputStream(f,true);
		wb.write(fo);
		
	fo.close();	
	
	
	System.out.println("File created successfully !!!");
		
	}
}
