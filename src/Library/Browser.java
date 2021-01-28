package Library;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	 static WebDriver driver;
	 public static void invokeBrowers()
	  {
		  System.out.println("setting the driver path");
		  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"resources/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://automationpractice.com/index.php");
		  driver.manage().deleteAllCookies();
	      driver.manage().window().maximize();
	  }
}
