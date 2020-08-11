package Date_11th_Aug_Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class readingTextFiles {

	public static void main(String[] args) throws Exception {
		

		File f = new File(System.getProperty("user.dir")+"//text.txt");
		
		FileReader fr = new FileReader(f);
		
		BufferedReader reader = new BufferedReader(fr);
		
//		System.out.println(reader.readLine());
		
		String line = null;
		while((line = reader.readLine())!=null)
		{
			System.out.println(line);
		}
				
		reader.close();
		
		
	}

}
