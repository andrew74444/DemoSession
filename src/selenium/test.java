package selenium;

public class test {

	public static void main(String[] args) {

		String browser = "chrome";
		WebDriver driver = null;

		if (browser.equals("FF")) {
			driver = new FF();
			}
		if (browser.equals("IE")) {
			driver = new IE();
		}
		if (browser.equals("chrome")) {
			driver = new chrome();
		}

		driver.get();
		driver.click();
		driver.sendKeys();
		
		
		
		chrome cr = new chrome();
		WebDriver dr = new chrome();
		cr.get();
		dr.get();
		
		

	}

}
