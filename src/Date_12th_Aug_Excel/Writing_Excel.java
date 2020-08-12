package Date_12th_Aug_Excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Excel {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook();

		XSSFSheet st1 = wb.createSheet("Sheet34");
		XSSFSheet st2 = wb.createSheet("Sheet36");
		Row r1 = st1.createRow(0);

		Cell c1 = r1.createCell(0);
		Cell c2 = r1.createCell(1);

		c1.setCellValue("first Cell");
		c2.setCellValue("second Cell");
		
		
		File f = new File("Excel.xlsx");
		FileOutputStream fo = new FileOutputStream(f, true);
		wb.write(fo);

		fo.close();

		System.out.println("File created successfully !!!");

	}

}
