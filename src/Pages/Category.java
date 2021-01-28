/**
 * 
 */
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Thabo Mokhobane
 *
 */
public class Category {

WebDriver driver;
	//c. Use generic page objects to select the appropriate category or subcategory item.
	By btnClickMenu = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
	

	public Category(WebDriver driver)
	{
	    	this.driver = driver;
	}
	public void ClickSubCatregory()
	{
		driver.findElement(btnClickMenu).click();
	}
}
