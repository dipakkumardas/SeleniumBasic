package DynamicDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert 
	{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriver Driver;	
		
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/system/chromedriver.exe"); /*for browser launch*/
		Driver = new ChromeDriver();
		Driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		Driver.manage().window().maximize();
		Driver.findElement(By.xpath("//html[1]/body[1]/table[3]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[4]/form[1]/input[1]")).click();
		System.out.println(Driver.switchTo().alert().getText());
		// Click Ok , Yes and Accept Button
		Driver.switchTo().alert().accept();
		
	}

}
