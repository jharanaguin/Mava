package Testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsernamefieldLessthanMobileNoField {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement unTB=driver.findElement(By.id("email"));
		int username_width=unTB.getSize().getWidth();
		System.out.println(username_width);

		WebElement mobNumTB=driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number or email address')]"));
		int mobNumWidth=mobNumTB.getSize().getWidth();
		if(username_width==mobNumWidth)
		{
			System.out.println("Size of both username and password fields are same"+username_width+"="+mobNumWidth);
		}
		else
		{
			System.out.println("Size of username and password fields are not same that is:"+username_width+"not equals to"+mobNumWidth);
		}}}