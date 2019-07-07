package Testpackage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutoSuggestionDemo  extends BaseClass{
	public static void main(String[] args) throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("ama");
		Thread.sleep(2000);
		
		List<WebElement> allsugg = driver.findElements(By.xpath("//*[contains(text(),'ama')]"));
		for(WebElement suggestion:allsugg)
		{
			String text=suggestion.getText();
			System.out.println(text);
			if(text.equals("am"));
			{
				suggestion.click();
				break;				
			}
		}
		//
		driver.close();
	}
}
