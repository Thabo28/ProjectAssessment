package Pages;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import Library.Global;

public class NavigationMenu {

	static WebDriver driver;
	Actions action;
	
	
	public NavigationMenu(WebDriver driver) {
		action  = new Actions(driver);
	}
	public static void main(String[] args) throws Exception {
	
		 
		  System.out.println("setting the driver path");
		  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"resources/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://automationpractice.com/index.php");
		  driver.manage().deleteAllCookies();
	      driver.manage().window().maximize();
	      
	      HoverOverImage(driver);
	}

	public static void HoverOverImage(WebDriver driver)
	{
		   
		Global navHover = new Global(driver);
		
		//a. It should cater for either hovering over or clicking the categories “Women,Dresses, T-Shirts”.
		//List<WebElement> myElements = driver.findElements(By.xpath("//*[@id=\"block_top_menu\"]/ul"));
		for(int i = 0; i<=2; i++)
	    {
			WebElement hoverOverMenu = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
			navHover.perfomMouseOver(hoverOverMenu);
		
		    System.out.println("Test");
	    }
		
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	
	public static void subCategory(WebDriver driver)
	{
		   
		Global navHover = new Global(driver);
		
		//a. It should cater for either hovering over or clicking the categories “Women,Dresses, T-Shirts”.
		
		WebElement hoverOverMenu = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		navHover.perfomMouseOver(hoverOverMenu);
		
		WebElement ClickSubMenu = driver.findElement(By.xpath(""));
		ClickSubMenu.click();

	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
}
