package TestClasses;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.Category;

public class TestCategory {

	@Test
	public void verifyCategory()
	{
		System.out.println("setting the driver path");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        
        Category categ = new Category(driver);
        
        categ.ClickSubCatregory();
        
        driver.quit();
	}
	
}
