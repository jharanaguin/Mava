package Testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyHomePageUsingTitle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(3000);
		String expectedTitle="Enter Time";
		String actualTitle=driver.getTitle();
		//if actual title contains Enter Time text then home page is displayed
		if(actualTitle.contains(expectedTitle))
		{
			System.out.println("Home page is displayed");
			
		}
		else
		{
			System.out.println("Home page is not displayed");
		}
		
	}

}
