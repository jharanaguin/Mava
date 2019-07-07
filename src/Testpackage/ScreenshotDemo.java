package Testpackage;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
				driver.get("http://www.google.com/");
				TakesScreenshot ts=(TakesScreenshot)driver;
				File srcFile=ts.getScreenshotAs(OutputType.FILE);//ctrl,1,enter
				System.out.println(srcFile);
				File destFile=new File("./Screenshot1/google.png");
				Files.copy(srcFile,destFile);
				
	}

}
