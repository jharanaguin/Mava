package Testpackage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
public class CaptureScreenShot_ActiTimePage {
	public static void main(String[] args) throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Creating an object of Date Class
		Date d=new Date();
		//Printing the actual date
		String date1=d.toString();
		System.out.println(date1);
		//replacing the colon present in the date time stamp format to "_"using replaceAll()
		//method of string class
		String date2=date1.replaceAll(":","_" );
		System.out.println(date2);
		//enter the url
		driver.get("https://demo.actitime.com/login.do");
		//type cast the driver object to takescreenshot interface type
		TakesScreenshot ts=(TakesScreenshot)driver;
		//getting the source file using getScreenshotAs()method and storing in the file
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		/*creating a folder called "screenshot" in the project directory
		 created another file by concatenating the date value which has "_" in it*/
		 File destFile = new File(".\\screenshot1\\"+date2+"_actiTimeLogin page.png");
		 Files.copy(srcFile,destFile);
		 Thread.sleep(2000);
		 //closing the browser
		 driver.close();
		 
		
		
	}

}
