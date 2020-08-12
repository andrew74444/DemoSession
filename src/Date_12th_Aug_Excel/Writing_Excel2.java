package Date_12th_Aug_Excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Excel2 {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook();

		XSSFSheet st1 = wb.createSheet("Sheet34");
		XSSFSheet st2 = wb.createSheet("Sheet36");
		
		
		
		for (int rows=0;rows<10;rows++) {
			
			Row r=st1.createRow(rows);
			
			for(int cols=0;cols<10;cols++) {
				
				Cell cell = r.createCell(cols);
				
				cell.setCellValue((int)(Math.random()*100));
			}
		}
		
		
		File f = new File("Excel2.xlsx");
		FileOutputStream fo = new FileOutputStream(f, true);
		wb.write(fo);

		fo.close();

		System.out.println("File created successfully !!!");

	}

}
