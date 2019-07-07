package Testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTime extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver",".\\driver\\geckodriver.exe" );
		System.setProperty("webdriver.chromedriver","./drivers/chromeDriver.exe");

		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();

		//enter the url of actitime
		driver.get("https://demo.actitime.com/login.do");
		//used id locator
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='popup_menu_icon'][1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[.='TypeS of Work']")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("a[.='testing']/../..//a[.='set by default']")).click();
		
		//driver.close(); 
		
		
	}

}
