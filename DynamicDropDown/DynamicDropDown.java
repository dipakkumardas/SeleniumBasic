package DynamicDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver Driver;

		System.setProperty("webdriver.chrome.driver", "E:/Selenium/system/chromedriver.exe"); /* for browser launch */
		Driver = new ChromeDriver();
		Driver.get("https://www.spicejet.com/");
		Driver.manage().window().maximize(); // TODO Auto-generated method stub
		Driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Driver.findElement(By.xpath("//a[@value='GOI']")).click();
		Thread.sleep(4000);
		Driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		Thread.sleep(4000);

		// Departure Date
		// Driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		// Driver.findElement(By.xpath("//span[contains(text(),'February')]")).click();

		Driver.findElement(By.xpath(
				"//span[@class='ui-datepicker-month' and contains(text(),'Feb')]//parent::div//parent::div//following-sibling::table[@class='ui-datepicker-calendar']//child::td/a[contains(text(),'25')]"))
				.click();

		Thread.sleep(2000);
		// Select Passenger For Adult
		Driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);

		for (int i = 1; i <= 2; i++) {
			Driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		}

		// Select Passenger For Child

		Driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();

		for (int i = 1; i <= 2; i++) {
			Driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		}

		// Select Passenger For Infant

		Driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();

		for (int i = 1; i <= 2; i++) {
			Driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
		}

		Driver.findElement(By.xpath("//input[@value='Done']")).click();

		// Driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")).click();
		Select s = new Select(Driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		// s.selectByVisibleText("USD");
		// s.selectByIndex(2);
		s.selectByValue("USD");

		Driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_StudentDiscount']")).click();

		Driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
		Thread.sleep(2000);
	}
}
