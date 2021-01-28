package ReadDataExternal;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Library.ExcelReadingConf;

public class ReadBrowserData {

	public static void main(String[] args) throws Exception {
		
		System.out.println("setting the driver path");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		ExcelReadingConf excel = new ExcelReadingConf("C:\\Data\\TestData.xlsx");
		System.out.print(excel.GetData(0, 0));
		
        //TC3 – Repeat TC1 again this time using a data driven approach using an external data file such as an excel spreadsheet or text file.
		String x = excel.GetData(0, 0);
		driver.get(x);
		driver.manage().window().maximize();
			
	}

}
