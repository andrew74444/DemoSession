package Date_12th_Aug_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_Excel {

	public static void main(String[] args) throws IOException {

		File f = new File(System.getProperty("user.dir")+"\\Excel2.xlsx");
		FileInputStream fi = new FileInputStream(f);
		
		Workbook wb= WorkbookFactory.create(fi);
		
		Sheet st1= wb.getSheet("Sheet34");
		
		Row r1 = st1.getRow(0);
		
		Cell c1= r1.getCell(0);
		Cell c2= r1.getCell(1);
		
		System.out.println(c1);

	}

}
