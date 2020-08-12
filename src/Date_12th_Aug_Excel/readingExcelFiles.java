package Date_12th_Aug_Excel;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readingExcelFiles {

	public static void main(String[] args) throws Exception {
		

	File f = new File(System.getProperty("user.dir")+"\\Excel2.xlsx");
		FileInputStream fi = new FileInputStream(f);
		
		Workbook wb= WorkbookFactory.create(fi);
		
		Sheet st1= wb.getSheet("Sheet34");
		
		Row r1 = st1.getRow(0);
		
		Cell c1= r1.getCell(0);
		Cell c2= r1.getCell(1);
		
		System.out.println(c1);
		
		
		Row r2;
		Cell c;
		for(int i=0;i<10;i++) {
			
			r2 = st1.getRow(i);
			
			for(int j=0;j<10;j++) {
				 
				c= r2.getCell(j);
				System.out.print(c+"\t");						
			}System.out.println();
			
		}

		System.out.println("File read successfully !!!");
		
		for(Row r : st1) {
			for (Cell cell: r) {
				
				switch(cell.getCellType()){
					case STRING:
						System.out.print(cell.getStringCellValue()+"\t");
						break;
					case NUMERIC:
						System.out.print(cell.getNumericCellValue()+"\t");
						break;
					case BLANK:
						System.out.print(""+"\t");					
				}
			}System.out.println();
			
		}
	
	
	
		
	}
}
