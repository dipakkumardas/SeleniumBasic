package DynamicDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown 
{
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriver Driver;
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/system/chromedriver.exe"); /*for browser launch*/
		Driver = new ChromeDriver();
		Driver.get("https://www.makemytrip.com/");
		Driver.manage().window().maximize();
		
		WebElement Source = Driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']"));
		Source.click();
		Source.sendKeys("CCU");
		Source.sendKeys(Keys.ENTER);
		
		WebElement Destination = Driver.findElement(By.xpath("//input[@id='hp-widget__sTo']"));
		Destination.click();
		Destination.sendKeys("DEL");
		//Destination.sendKeys(Keys.DOWN);
		Actions A = new Actions(Driver);
		A.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
		
		// edited by swarnendu for testing
		
		
		
		
		

	}

}
