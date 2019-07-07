package Testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateErrorMsg {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	driver.get("http//localhost:90/login.do");
	driver.findElement(By.xpath("//div[text()='login']")).click();
	String xp="//span[contains(text(),'invalid'))]";
	WebElement errMsgObj=driver.findElement(By.xpath(xp));
	boolean displayed=errMsgObj.isDisplayed();
	if(displayed)
	{
		System.out.println("Error msg is display");
		String actErrMsgText=errMsgObj.getText();
		System.out.println(actErrMsgText+" ....> is the actualerror msg");
		Object actErrText = null;
		if(actErrText.equals("Username or password is valid. please try again"));
		System.out.println("Invalid Error mshg");
		
	}
	else
	{
		System.out.println("Error msg is not displayed");
	}
}	
}


	
