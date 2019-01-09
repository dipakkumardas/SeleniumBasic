package DynamicDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/system/chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://jqueryui.com/droppable/");
		//Driver.findElement(By.id("droppable")).isDisplayed();
		System.out.println(Driver.findElements(By.tagName("iframe")).size());
		Driver.switchTo().frame(0);
		//Driver.switchTo().frame(Driver.findElement(By.cssSelector("iframe.demo-frame")));
		Driver.findElement(By.id("droppable")).click();
		Actions a = new Actions(Driver);
		WebElement Source = Driver.findElement(By.id("draggable"));
		WebElement Destination = Driver.findElement(By.id("droppable"));
		a.dragAndDrop(Source, Destination).build().perform();
		Driver.switchTo().defaultContent();
		System.out.println(Driver.getTitle());
		Driver.close();
		
		
		

	}

}
