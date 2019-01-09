package DynamicDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver Driver;
		
		
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/system/chromedriver.exe"); /*for browser launch*/
		Driver = new ChromeDriver();
		Driver.get("http://www.echoecho.com/htmlforms10.htm");
		Driver.manage().window().maximize();
		//Driver.findElement(By.xpath("//input[@value='Milk']")).click();
		
		int count=Driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int i=0;i<count;i++)
			{
			//Driver.findElements(By.xpath(("//input[@name='group1']"))).get(i).click();
			
			String text=Driver.findElements(By.xpath(("//input[@name='group1']"))).get(i).getAttribute("value");
			
			if(text.equals("Cheese"))
			{
				Driver.findElements(By.xpath(("//input[@name='group1']"))).get(i).click();
			}
			
			}
		}
	
		//Test by Dipak

	}


