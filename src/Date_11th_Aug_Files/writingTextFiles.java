package Date_11th_Aug_Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class writingTextFiles {

	public static void main(String[] args) throws Exception {
		

		File f = new File(System.getProperty("user.dir")+"//text.csv");
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter writer = new BufferedWriter(fw);
		
//		writer.newLine();
//		writer.write("First Line");
//		writer.newLine();
//		writer.write("Second Line");
//		writer.newLine();
//		writer.write("Third Line");
//		writer.newLine();
//		
		
		for(int i =0;i<5;i++) {
			for(int j=0;j<5;j++) {
				int num = (int) (Math.random()*100);
				
				writer.write(num+"\t"+",");
			}
			
			writer.newLine();
		}
		
		writer.close();
		
		
			
	}

}
