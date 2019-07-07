package Testpackage;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parentWH=driver.getWindowHandle();
		System.out.println("Parent Window Handle..."+parentWH);
		Set<String>allWHs = driver.getWindowHandles();
		System.out.println("Total windows are...."+allWHs.size());
		
	}

}
 