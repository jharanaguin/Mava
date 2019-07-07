package Testpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyUnandPwdAlignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement unTB=driver.findElement(By.id("username"));
		int un_x=unTB.getLocation().getX();
		int un_width=unTB.getSize().getWidth();
		int un_height=unTB.getSize().getHeight();
		WebElement pwTB=driver.findElement(By.name("pwd"));
		int pw_x=unTB.getLocation().getX();
		int pw_width=unTB.getSize().getWidth();
		int pw_height=unTB.getSize().getHeight();
		if(un_x==pw_x&&un_width==pw_width&&un_height==pw_height)
		{
			System.out.println("Username and password text box are alligned");
			
		}
		else
		{
			System.out.println("Username and password text box are not alligned");
		}
	}

}
