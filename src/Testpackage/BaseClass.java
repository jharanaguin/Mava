package Testpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BaseClass {
//set the path of driver executable
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
	}
	//launch the browser
	// WebDriver driver=new FirefoxDriver();
	 WebDriver driver=new ChromeDriver();
	
	
	
}
