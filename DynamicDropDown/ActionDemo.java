package DynamicDropDown;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriver Driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\system\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.get("https://www.amazon.com/");
		Driver.manage().window().maximize();
		Actions a = new Actions(Driver);
		WebElement move =Driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		// Move to Specific Element
		a.moveToElement(move).build().perform();
		
		//a.moveToElement(Driver.findElement(By.xpath("//span[contains(text(),'Account & Lists' )][1]"))).build().perform();
		a.moveToElement(Driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		Driver.close();
		
		

	}

}
