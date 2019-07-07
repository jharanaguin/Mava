package Testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlignedSameRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement unTB=driver.findElement(By.id("email"));
		int username_Ycordinate=unTB.getLocation().getY();
		System.out.println(username_Ycordinate);
		WebElement pwdTB=driver.findElement(By.name("pass"));
		int password_Ycordinate=pwdTB.getLocation().getY();
		System.out.println(password_Ycordinate);
		if(username_Ycordinate==password_Ycordinate)
		{
			System.out.println("Both username and password fields are displayed in the same row");
			
		}
		else
		{
			System.out.println("Both username and password fields are not displayed in the same row");
			
		}

	}

}
