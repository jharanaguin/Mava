package Testpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LunchBrowser extends BaseClass {
public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		//setting the path
		System.setProperty("webdriver.chromedriver","./Drivers/chromeDriver.exe");
		//lunch the chrome browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("https://www.google.com/");
		//get the title
		String title = driver.getTitle();
		System.out.println("the title of the page is"+title);
		//get the url
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current url is"+currentUrl);
		//page source code
		String pageSource = driver.getPageSource();
		
		System.out.println("page source is"+pageSource);
		Thread.sleep(2000);
		//driver.close();
	}




}
