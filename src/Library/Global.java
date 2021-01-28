package Library;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Global {

	public static WebElement element= null;
	Actions action;
	
	public Global(WebDriver driver) {
		action  = new Actions(driver);
	}

	public void pressEnter(WebDriver driver) {
	   action.sendKeys(Keys.ENTER).perform();
	}

	public void scrollDown(WebDriver driver) {
		   JavascriptExecutor executor = (JavascriptExecutor) driver;
		   executor.executeScript("window.scrollBy(0,500)", "");
	}
	
	public void scrollUp(WebDriver driver) {
		   JavascriptExecutor executor = (JavascriptExecutor) driver;
		   executor.executeScript("window.scrollBy(0,500)", "");
	}

	public void perfomMouseOver(WebElement element) {
		   action.moveToElement(element).build().perform();	  
	}
	
	public void clickButton(WebDriver driver,WebElement element) {
		   JavascriptExecutor executor = (JavascriptExecutor) driver;
		   executor.executeScript("arguments,[0].click()", element);
	}
	
	public static void scroll(WebDriver driver) {

		Global objSearch = new Global(driver);
		objSearch.pressEnter(driver);
		objSearch.scrollDown(driver);
	}
	
	
	public static void scrollUpDrv(WebDriver driver) {

		Global objSearch = new Global(driver);
		objSearch.pressEnter(driver);
		objSearch.scrollUp(driver);
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		  driver.quit();
	}
	
}
