package Testpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	public class FirstSeleniumScript {
	public static void main(String[] args) {
		// set the path for the chrome browser
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromeDriver.exe");
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("http://www.google.com");
		//print the title
		String title=driver.getTitle();
		System.out.println(title);
		//print the url
		System.out.println(driver.getCurrentUrl());
		//close the browser window
		//driver.close();
	}
	
	
	
	
}
