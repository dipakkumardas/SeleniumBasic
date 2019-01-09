package DynamicDropDown;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandel 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/system/chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2FManageAccount&followup=https%3A%2F%2Faccounts.google.com%2FManageAccount&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		System.out.println("Before Switching Window");
		System.out.println(Driver.getTitle());
		Driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		
		//This GetWindow handler Get window id and store it on string.
		Set<String>ids=Driver.getWindowHandles();
		
		Iterator<String> it= ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		Driver.switchTo().window(childid);
		System.out.println("After switching The Child Window");
		System.out.println(Driver.getTitle());
		System.out.println("Switch Back to the Parent Window");
		Driver.switchTo().window(parentid);
		System.out.println(Driver.getTitle());
		
		
		
		
		

	}

}
